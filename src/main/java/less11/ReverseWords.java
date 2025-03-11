package less11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String... args) throws Exception {
        String pathIn = ""; //   src/resources/fileForRead.txt
        String pathOut = ""; //   src/resources/fileForWrite.txt
        for (String str : args) {
            if (pathIn.isEmpty()) {
                pathIn = str;
            } else {
                pathOut = str;
                break;
            }
        }
        String revers = "";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(pathIn, StandardCharsets.UTF_8), 1024);
             BufferedReader fileReader1 = new BufferedReader(new FileReader(pathIn, StandardCharsets.UTF_8), 1024)
        ) {
            System.out.println("На входе:");
            fileReader1.lines().forEach(System.out::println);
            revers = Arrays.stream(fileReader.lines()
                            .collect(Collectors.joining(" "))
                            .split("\\s"))
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.joining(" "));
            System.out.println("На выходе:");
            System.out.println(revers);
        }
        if (!pathOut.isEmpty()) {
            System.out.println("Запись: " + revers);
            FileWriter fileWriter = new FileWriter(pathOut);
            fileWriter.write(revers);
            fileWriter.close();
        }
    }
}

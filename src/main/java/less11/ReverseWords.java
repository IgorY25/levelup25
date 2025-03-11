package less11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) throws Exception {
        String pathIn = args[0];
        String pathOut = args[1];
        System.out.println(pathIn);
        System.out.println(pathOut);
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
        try (FileWriter fileWriter = new FileWriter(pathOut)) {
            System.out.println("Запись: " + revers);
            fileWriter.write(revers);
        }
    }
}

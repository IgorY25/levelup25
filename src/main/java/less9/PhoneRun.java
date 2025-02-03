package less9;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeMap;

public class PhoneRun {
    public static void main(String[] args) {
        int countEl = 100000;
        System.out.println("Генерируется кол-во авбонентов с телефоном: " + countEl);
        int sizeBefore, sizeAfter;
        Random randomRel = new Random();
        int randomPhone;
        int countRel;
        String relPhone;
        TreeMap<String, PartPhoneBook> phones = new TreeMap<>();
        GenerBook book;
        for (int i = 0; i < countEl; i++) {
            book = new GenerBook(i);
            phones.put(book.getPhone(), new PartPhoneBook(book.getFio(), book.getOperator(), book.isСity()));
            if (i > 9) {
                for (int y = 0; y < 10; y++) {
                    randomPhone = randomRel.nextInt(i - 1) + 1000000000;
                    relPhone = Integer.toString(randomPhone);
                    sizeBefore = phones.get(book.getPhone()).getRelation().size();
                    phones.get(book.getPhone()).setRelation(relPhone);
                    sizeAfter = phones.get(book.getPhone()).getRelation().size();
                    if (sizeAfter > sizeBefore) {
                        phones.get(relPhone).setCount();
                    }
                }
            }
        }
        long start = System.currentTimeMillis();
        String[] phoneMax = new String[5];
        int[] countMax = new int[5];
        int countCur, countIndex;

        for (int i = 0; i < countEl; i++) {
            randomPhone = i + 1000000000;
            relPhone = Integer.toString(randomPhone);
            countRel = phones.get(relPhone).getCount();
            countCur = 0;
            countIndex = 0;
            for (int y = 0; y < 5; y++) {
                if (y == 0) {
                    countCur = countMax[y];
                    countIndex = y;
                } else {
                    if (countCur > countMax[y]) {
                        countCur = countMax[y];
                        countIndex = y;
                    }
                }
            }
            if (countCur < countRel) {
                countMax[countIndex] = countRel;
                phoneMax[countIndex] = relPhone;
            }
        }
        start = System.currentTimeMillis() - start;
        System.out.println("Кол-во затраченных миллисекунд: " + start);
        System.out.println("Пятерка наиболее вызываемях абонентов:");
        for (int y = 0; y < 5; y++) {
            System.out.println("Телефон:" + phoneMax[y] + " количество: " + countMax[y]);
            System.out.println("Абонент " + phones.get(phoneMax[y]).toString());
        }
    }
}

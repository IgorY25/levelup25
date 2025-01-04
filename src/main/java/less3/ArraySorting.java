package less3;

import java.util.Arrays;

public class ArraySorting {
    public static int[] bubbles(int[] mas) {
        System.out.println("Пузырьковая сортировка");
        System.out.println("На входе: " + Arrays.toString(mas));

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println("На выходе: " + Arrays.toString(mas));
        return mas;
    }
}

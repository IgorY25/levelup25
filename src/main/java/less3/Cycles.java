package less3;

import java.util.Arrays;
import java.util.Random;

public class Cycles {
    public static void main(String[] args) {
        System.out.println("1.Циклы");
        cycleWhile();
        System.out.println("2.Простые числа");
        primeNumb(10000);
        System.out.println("3.Натуральный корень");
        for (int count = 1; count <= 10; count++) {
            naturRoot(count);
        }
        System.out.println("4.Пузырьковая сортировка");
        System.out.println("Генерация случайных чисел");
        int[] intm = new int[10];
        for (int i = 0; i < 10; i++) {
            intm[i] = generateRandom();
            System.out.println(i + " cлучайное число:" + intm[i]);
        }

        System.out.println("НЕотсортированный массив: " + Arrays.toString(intm));
        intm = ArraySorting.bubbles(intm);
        System.out.println("Отсортированный массив: " + Arrays.toString(intm));
    }

    private static void cycleWhile() {
        String title = "HelloWorld";
        System.out.println("Демонстрация do...while");
        int counter = 0;
        do {
            System.out.println(counter + " " + title);
        } while (counter++ < 5);

        System.out.println("Демонстрация while");
        counter = 0;
        while (counter++ < 5) {
            System.out.println(counter + " " + title);
        }
        System.out.println("Демонстрация for");
        for (counter = 0; counter < 5; counter++) {
            System.out.println(counter + " " + title);
        }
        System.out.println("Демонстрация for / continue / break");
        counter = 0;
        for (; ; ) {
            ++counter;
            if (counter % 2 != 0) {
                continue;
            }
            if (counter > 5) {
                break;
            }
            System.out.println(counter + " " + title);
        }
        System.out.println("Демонстрация while / break");
        counter = 0;
        while (true) {
            if (counter++ > 5) {
                break;
            }
            System.out.println(counter + " " + title);
        }

    }

    private static void primeNumb(int numb) {
        System.out.println("Простые числа от 1 до " + numb);
        int sqrtNumb;
        int counter1 = 0;
        boolean res;
        for (int counter = 1; counter <= numb; counter++) {
            sqrtNumb = (int) Math.sqrt(counter);
            res = true;
            for (int i = 2; i <= sqrtNumb; i++) {
                if (counter % i == 0) {
                    res = false;
                    break;
                }
            }
            if (res) {
                counter1++;
                System.out.println(counter);
            }
        }
        System.out.println("Всего их " + counter1);
    }

    private static void naturRoot(int numb) {
        System.out.println("Натуральный корень из " + numb);
        int sqrtNumb;
        boolean res;
        for (int counter = 1; ; counter++) {
            sqrtNumb = counter * counter;
            if (sqrtNumb == numb) {
                sqrtNumb = counter;
                res = true;
                break;
            }
            if (sqrtNumb > numb) {
                res = false;
                break;
            }
        }
        if (res) {
            System.out.println("Натуральный квадратный корень из " + numb + " существует и = " + sqrtNumb);
        } else {
            System.out.println("Натурального квадратного корня из " + numb + " не существует");
        }

    }

    private static int generateRandom() {
        Random rand = new Random();
        int ret, max = 100, min = 1;
        ret = rand.nextInt(max - min + 1) + min;
        return ret;
    }

}



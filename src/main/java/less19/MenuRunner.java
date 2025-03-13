package less19;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        do {
            try {
                System.out.println("Для выбора режима введите номер пункта меню");
                System.out.println("1.Ввод поставщиков");
                System.out.println("2.Ввод подразделений");
                System.out.println("3.Приход товара от поставщиков");
                System.out.println("4.Расход товара со склада");
                System.out.println("5.Продажа товара");
                System.out.println("6.Оборотно-сальдовая ведомость");
                System.out.println("7.Перевод дня");
                System.out.println("8.Выход");
                if (scanner.hasNext()) {
                    menu = scanner.nextInt();
                    System.out.println("Вы ввели число %d".formatted(menu));
                    switch (menu) {
                        case 1: {
                            System.out.println("case 1");
                            AddClient addClient = new AddClient();
                            addClient.addClient();
                            menu = 0;
                            break;
                        }
                        case 2: {
                            System.out.println("case 2");
                            break;
                        }
                        default: {
                            System.out.println("default:");
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                menu = 0;
                System.out.println("Ошибка ввода " + e.toString());
                scanner = new Scanner(System.in);
            }
        }
        while (menu == 0);
        System.out.println("Выход");
    }
}

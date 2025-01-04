package less2;

import java.util.Arrays;

public class CondMain {
    public static void main(String[] args) {
        double val1 = 123.41267;
        System.out.println("Результат округления: " + roundmy(val1, true));
        val1 = 123.51267;
        System.out.println("Результат округления: " + roundmy(val1, true));
        System.out.println(" ");

        System.out.println("Ответ по 1 комбинации переменных: " + Arrays.toString(calcul(-5, 6, 7)));
        System.out.println("Ответ по 2 комбинации переменных: " + Arrays.toString(calcul(1, 2, 1)));
        System.out.println("Ответ по 3 комбинации переменных: " + Arrays.toString(calcul(3, 4, 5)));

        System.out.println(" ");
        payment(20000, 12, 36);
    }

    public static int roundmy(double val, boolean koment) {
        if (koment) {
            System.out.println("Округление дробного числа " + val + " до целого");
        }
        String str1 = String.valueOf(val);
        int index = str1.indexOf(".");
        String Str2 = new String(str1.substring(index + 1, index + 2));
        String Str3 = new String(str1.substring(0, index));
        int i1 = Integer.parseInt(Str2);
        int i2 = Integer.parseInt(Str3);
        if (i1 >= 5) {
            i2++;
            if (koment) {
                System.out.println("Округлили в большую сторону");
            }
        } else {
            if (koment) {
                System.out.println("Округлили в меньшую сторону");
            }
        }
        return i2;
    }


    public static String[] calcul(double a, double b, double c) {
        System.out.println("Решение квадратного уравнения " + a + "x^2+" + b + "x+" + c + "=0");
        double disc;
        String temp;
        disc = b * b - 4 * a * c;
        System.out.println("дискриминант= " + disc);
        String[] answer = new String[2];
        if (disc > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(disc)) / (2 * a);
            x2 = (-b + Math.sqrt(disc)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            temp = String.valueOf(x1);
            answer[0] = temp;
            temp = String.valueOf(x2);
            answer[1] = temp;
        } else if (disc == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
            temp = String.valueOf(x);
            answer[0] = temp;
        } else {
            System.out.println("Уравнение не имеет корней!");
        }
        return answer;
    }

    public static void payment(double Oск, double b, double PP) {
        System.out.println("рассчитать аннуитетный платеж по формуле: Pen=Ock*PS/(1-(1+PS)^(-PP)))");
        System.out.println("где  Pеп — размер ежемесячного платежа");
        System.out.println("Oск — остаток суммы кредита");
        System.out.println("PS — месячная процентная ставка (рассчитывается как: процентная ставка по кредиту /(100 *12)");
        System.out.println("PP — процентные периоды до окончания срока кредита (в месяцах)");
        System.out.println(" ");
        System.out.println("сумма кредита " + Oск);
        System.out.println("процентная ставка (годовая)" + b);
        System.out.println("срок займа (в месяцах) " + PP);
        System.out.println(" ");
        double PS, Pen, hhh;
        PS = b / (100 * 12);
        System.out.println("Рассчитаем процентную ставку в месяц: " + PS);
        Pen = Oск * PS / (1 - Math.pow((1 + PS), -PP));
        System.out.println("Аннуитетный платеж: " + roundmy(Pen, false));
        hhh = Pen * PP - Oск;
        System.out.println("Переплата за весь период займа:" + roundmy(hhh, false));
    }

}

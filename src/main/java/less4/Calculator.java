package less4;

public class Calculator {
   // public
   static boolean err1;

    public static int addOper(int arg1, int arg2) {
        System.out.print("int a=" + arg1 + ", b=" + arg2 + ", a+b=");
        return arg1 + arg2;
    }

    public static double addOper(double arg1, double arg2) {
        System.out.print("double a=" + arg1 + ", b=" + arg2 + ", a+b=");
        return arg1 + arg2;
    }

    public static long addOper(long arg1, long arg2) {
        System.out.print("long a=" + arg1 + ", b=" + arg2 + ", a+b=");
        return arg1 + arg2;
    }

    public static int minusOper(int arg1, int arg2) {
        System.out.print("int a=" + arg1 + ", b=" + arg2 + ", a-b=");
        return arg1 - arg2;
    }

    public static double minusOper(double arg1, double arg2) {
        System.out.print("double a=" + arg1 + ", b=" + arg2 + ", a-b=");
        return arg1 - arg2;
    }

    public static long minusOper(long arg1, long arg2) {
        System.out.print("long a=" + arg1 + ", b=" + arg2 + ", a-b=");
        return arg1 - arg2;
    }

    public static int multiOper(int arg1, int arg2) {
        System.out.print("int a=" + arg1 + ", b=" + arg2 + ", a*b=");
        return arg1 * arg2;
    }

    public static double multiOper(double arg1, double arg2) {
        System.out.print("double a=" + arg1 + ", b=" + arg2 + ", a*b=");
        return arg1 * arg2;
    }

    public static long multiOper(long arg1, long arg2) {
        System.out.print("long a=" + arg1 + ", b=" + arg2 + ", a*b=");
        return arg1 * arg2;
    }

    public static int divideOper(int arg1, int arg2) {
        err1 = false;
        System.out.print("int a=" + arg1 + ", b=" + arg2 + ", a/b=");
        if (arg2 == 0) {
            err1 = true;
            return arg1;
        } else {
            return arg1 / arg2;
        }
    }

    public static double divideOper(double arg1, double arg2) {
        err1 = false;
        System.out.print("double a=" + arg1 + ", b=" + arg2 + ", a/b=");
        if (arg2 == 0) {
            err1 = true;
            return arg1;
        } else {
            return arg1 / arg2;
        }
    }

    public static long divideOper(long arg1, long arg2) {
        err1 = false;
        System.out.print("long a=" + arg1 + ", b=" + arg2 + ", a/b=");
        if (arg2 == 0) {
            err1 = true;
            return arg1;
        } else {
            return arg1 / arg2;
        }
    }
}

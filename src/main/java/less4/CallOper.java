package less4;
public class CallOper {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        System.out.println(" ");
        System.out.println("Операции с int");
        int a1 = 5, a2 = 6;
        a1 = Calculator.addOper(a1,a2);
        System.out.println(a1);
        a2 = 7;
        a1 = Calculator.minusOper(a1,a2);
        System.out.println(a1);
        a2 = 8;
        a1 = Calculator.multiOper(a1,a2);
        System.out.println(a1);
        a2 = 4;
        a1 = Calculator.divideOper(a1,a2);
        System.out.println(a1);
        a2 = 0;
        a1 = calc1.divideOper(a1,a2);
        if (calc1.err1) {
            System.out.println("Ошибка деления на 0");
        }
        else {
            System.out.println(a1);
        }

        System.out.println("");
        System.out.println("Операции с double");
        double ar1 = 5.6, ar2=7.9;
        ar1 = Calculator.addOper(ar1,ar2);
        System.out.println(ar1);
        ar2 = 7.31;
        ar1 = Calculator.minusOper(ar1,ar2);
        System.out.println(ar1);
        ar2 = 8.28;
        ar1 = Calculator.multiOper(ar1,ar2);
        System.out.println(ar1);
        ar2 = 4.15;
        ar1 = Calculator.divideOper(ar1,ar2);
        System.out.println(ar1);
        ar2 = 0;
        ar1 = calc1.divideOper(ar1,ar2);
        if (calc1.err1) {
            System.out.println("Ошибка деления на 0");
        }
        else {
            System.out.println(ar1);
        }

        System.out.println("");
        System.out.println("Операции с long");
        long arg1 = 123, arg2 =456;
        arg1 = Calculator.addOper(arg1,arg2);
        System.out.println(arg1);
        arg2 = 731;
        arg1 = Calculator.minusOper(arg1,arg2);
        System.out.println(arg1);
        arg2 = 828;
        arg1 = Calculator.multiOper(arg1,arg2);
        System.out.println(arg1);
        arg2 = 415;
        arg1 = Calculator.divideOper(arg1,arg2);
        System.out.println(arg1);
        arg2 = 0;
        arg1 = calc1.divideOper(arg1,arg2);
        if (calc1.err1) {
            System.out.println("Ошибка деления на 0");
        }
        else {
            System.out.println(arg1);
        }
    }
}

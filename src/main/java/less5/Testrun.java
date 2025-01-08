package less5;

public class Testrun {
    public static void main(String[] args){
        Converter test1 = new Cels();
        int pre = test1.convert(36,MeasureUnit.KELVIN);
        System.out.println("Градусов по "+MeasureUnit.KELVIN+" "+pre);
        pre = test1.convert(36,MeasureUnit.FAHRENHEIT);
        System.out.println("Градусов по "+MeasureUnit.FAHRENHEIT+" "+pre);

        System.out.println("");
        test1 = new Kelv();
        pre = test1.convert(36,MeasureUnit.CELSIUS);
        System.out.println("Градусов по "+MeasureUnit.CELSIUS+" "+pre);
        pre = test1.convert(36,MeasureUnit.FAHRENHEIT);
        System.out.println("Градусов по "+MeasureUnit.FAHRENHEIT+" "+pre);

        System.out.println("");
        test1 = new Fahr();
        pre = test1.convert(36,MeasureUnit.CELSIUS);
        System.out.println("Градусов по "+MeasureUnit.CELSIUS+" "+pre);
        pre = test1.convert(36,MeasureUnit.KELVIN);
        System.out.println("Градусов по "+MeasureUnit.KELVIN+" "+pre);
    }
}

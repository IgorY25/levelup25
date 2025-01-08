package less5;

public class Fahr implements Converter {
    public int convert (int temper, MeasureUnit scaleOut){
        System.out.println("На входе конвертера градусов по "+MeasureUnit.FAHRENHEIT+": "+temper);
        int res=0;
        switch (scaleOut){
            case KELVIN:
                res = (temper-32)*5/9+273;
                break;
            case FAHRENHEIT:
                res = temper;
                break;
            case CELSIUS:
                res = (temper-32)*5/9;
                break;
        }
        return res;
    }
}

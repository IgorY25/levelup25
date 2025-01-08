package less5;

public class Kelv implements Converter {
    public int convert (int temper, MeasureUnit scaleOut){
        System.out.println("На входе конвертера градусов по "+MeasureUnit.KELVIN+": "+temper);
        int res=0;
        switch (scaleOut){
            case KELVIN:
                res = temper;
                break;
            case FAHRENHEIT:
                res = (temper - 273)*9/5+32;
                break;
            case CELSIUS:
                res = temper - 273;
                break;
        }
        return res;
    }
}

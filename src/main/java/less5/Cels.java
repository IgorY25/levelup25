package less5;

public class Cels implements Converter{
      public int convert (int temper, MeasureUnit scaleOut){
          System.out.println("На входе конвертера градусов по "+MeasureUnit.CELSIUS+": "+temper);
        int res=0;
        switch (scaleOut){
            case KELVIN:
             res = temper + 273;
             break;
            case FAHRENHEIT:
                res = temper*9/5+32;
                break;
            case CELSIUS:
                res = temper;
                break;
        }
        return res;
    }
}

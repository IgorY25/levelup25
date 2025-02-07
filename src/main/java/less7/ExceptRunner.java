package less7;

import java.util.Random;

public class ExceptRunner {
    public static void main(String[] args) {
        Automobile list[] = new Automobile[20];
        AutoType typeA;
        for (int i = 0; i < 20; i++) {
            typeA = (i < 10 ? AutoType.CAR : AutoType.TRUCK);
            list[i] = new Automobile(typeA
                    , genRandom(typeA, AutoParam.NUMBER)
                    , genRandom(typeA, AutoParam.SPEED)
                    , genRandom(typeA, AutoParam.WEIGHT)
                    , genRandom(typeA, AutoParam.WIDTH)
                    , genRandom(typeA, AutoParam.HEIGHT)
                    , genRandom(typeA, AutoParam.LENGTH)
            );
            System.out.println(i + " Тип  автомобиля: %s Номер: %d Скорость(км/ч): %d Вес(т): %f Габариты: Ширина(м) %f Высота(м) %f Длина(м) %f".formatted(
                    list[i].getType()
                    , list[i].getNumber()
                    , list[i].getSpeed()
                    , (double) list[i].getWeight() / 1000
                    , (double) list[i].getWidth() / 100
                    , (double) list[i].getHeight() / 100
                    , (double) list[i].getLength() / 100)
            );
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(i);
            System.out.print(" Скорость: " + list[i].getSpeed());
            System.out.print(" ,вес(т) " + (double) list[i].getWeight() / 1000);
            System.out.print(" ,Высота(м)" + (double) list[i].getHeight() / 100);
            System.out.println(" ,Ширина(м)" + (double) list[i].getWidth() / 100);
            try {
                if (list[i].getSpeed() > 100) {
                    throw new ExceptionSpeedLimit100("");
                }
                if (list[i].getSpeed() > 80 & list[i].getSpeed() <= 100) {
                    throw new ExceptionSpeedLimit("");
                }
                if (list[i].getWeight() > 8000 | list[i].getHeight() > 400 | list[i].getWidth() > 250) {
                    throw new Exception();
                }
            } catch (ExceptionSpeedLimit100 e) {
                System.out.println("Превышещие скорости 100 км/ч, номер автомобиля: " + list[i].getNumber() + " Вызываем полицию");
            } catch (ExceptionSpeedLimit e) {
                System.out.println("2.Превышещие допустимой скорости 80 км/ч");
            } catch (Exception e) {
                System.out.println("Проезд через  КПП запрещен! (автомобиль не проходит по весу или габаритам) Номер автомобиля: " + list[i].getNumber() + " Тип " + list[i].getType());
            }
        }

    }

    private static int genRandom(AutoType type, AutoParam parametr) {
        Random rand = new Random();
        int ret = 0, max, min;
        switch (type) {
            case CAR:
                switch (parametr) {
                    case NUMBER: {
                        max = 999;
                        min = 100;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                    case SPEED: {
                        max = 160;
                        min = 40;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                    case WEIGHT: {
                        max = 700;
                        min = 300;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                    case WIDTH: {
                        max = 200;
                        min = 160;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                    case HEIGHT: {
                        max = 200;
                        min = 120;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                    case LENGTH: {
                        max = 450;
                        min = 200;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                }
                break;
            case TRUCK:
                switch (parametr) {
                    case NUMBER: {
                        max = 999;
                        min = 100;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                    case SPEED: {
                        max = 120;
                        min = 20;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                    case WEIGHT: {
                        max = 50000;
                        min = 3000;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                    case WIDTH: {
                        max = 300;
                        min = 200;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                    case HEIGHT: {
                        max = 500;
                        min = 200;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                    case LENGTH: {
                        max = 800;
                        min = 200;
                        ret = rand.nextInt(max - min + 1) + min;
                        break;
                    }
                }
                break;
        }

        return ret;
    }
}

package less5;

import java.util.Random;

public class Launcher {
    public static void main(String[] args){
//        Car niva = new Car("niva");
//        niva.move(100);
//        Car moskvich = new Car("moskvich");
//        moskvich.move(600);
//        Truck kamaz = new Truck("kamaz");
//        kamaz.move(700);
//        Truck maz = new Truck("maz");
//        maz.move(1500);

        CpecCar spis[] = new CpecCar[10];
        String nameCar;
        String typeCar;
        for (int i=0;i<10;i++){
            if (i<3) {
                nameCar = "niva"+(i+1);
                typeCar = "car";
            }
            else if (i<6) {
                nameCar = "moskvich"+(i+1);
                typeCar = "car";
            }
            else {
                nameCar = "kamaz"+(i+1);
                typeCar = "truck";
            }
            spis[i] = new CpecCar(nameCar, typeCar, generateRandom());
        }
        Car autoCar;
        Truck autoTruck;
        for (int i=0;i<10;i++){
            if (spis[i].type == "car"){
                autoCar = new Car(spis[i].name);
                autoCar.move(spis[i].curRoute);
            }
            else {
                autoTruck = new Truck(spis[i].name);
                autoTruck.move(spis[i].curRoute);
            }
        }
    }
    private static int generateRandom() {
        Random rand = new Random();
        int ret, max = 1000, min = 1;
        ret = rand.nextInt(max - min + 1) + min;
        return ret;
    }
}

package less5;

public abstract class Automobile {
    String marka;
    int maxDist;
    protected Automobile(String marka,int maxDist){
        this.marka = marka;
        this.maxDist = maxDist;
    }
    public void move(int distance) {
        if (distance > maxDist) {
            System.out.println("Автомобиль "+this.marka+" Объеиа бака (до "+maxDist+"км) не хватит для преодоления дистанции "+distance+" км");
        }
        else{
            System.out.println("Автомобиль "+this.marka+" Объеиа бака (до "+maxDist+"км) хватит для преодоления дистанции "+distance+" км");
        }
    }

}




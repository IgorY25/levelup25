package less6;

import java.io.Serializable;

public class AnimalsLife extends Animal implements Serializable {
    private int eatenFood;

    public AnimalsLife(String name, String habitatArea, int eatenFood) {
        super(name, habitatArea);
        this.eatenFood = eatenFood;
    }

    public void setEatenFood(int eatenFood) {
        this.eatenFood = eatenFood;
    }

    public int getEatenFood() {
        return eatenFood;
    }

}

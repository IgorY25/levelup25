package less6;

public class Animal {
    private String name;
    private String habitatArea;

    public Animal(String name, String habitatArea) {
        this.name = name;
        this.habitatArea = habitatArea;
    }

    public String getName() {
        return name;
    }

    public String getHabitatArea() {
        return habitatArea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHabitatArea(String habitatArea) {
        this.habitatArea = habitatArea;
    }
}

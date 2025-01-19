package less7;

public class Automobile {
    private AutoType type;
    private int number;
    private int speed;//км/ч
    private int weight;//кг
    private int width;//см
    private int height;//см
    private int length;//см

    public Automobile(AutoType type, int number, int speed, int weight, int width, int height, int length) {
        this.type = type;
        this.number = number;
        this.speed = speed;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public AutoType getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}

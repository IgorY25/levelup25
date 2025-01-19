package less7;

public class Automobile {
    private AutoType type;
    private int number;
    private int speed;
    private int weight;
    private int width;
    private int height;
    private int length;

    public Automobile(AutoType type, int number, int speed, int weight, int width, int height, int length) {
        this.type = type;
        this.number = number;
        this.speed = speed;//км/ч
        this.weight = weight;//кг
        this.width = width;//см
        this.height = height;//см
        this.length = length;//см
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

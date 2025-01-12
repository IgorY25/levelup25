package less6;

public class TestRun {
    public static void main(String[] args) {
        AnimalsLife mouse = new AnimalsLife("Мышь", "Везде", 55);
        GenericClass<Integer, AnimalsLife, Double> gen1 = new GenericClass<>(123, mouse, 123.45);
        System.out.println(gen1.getObT());
        System.out.println(gen1.getObT().compareTo(121));

        System.out.println(gen1.getObV().getName());
        System.out.println(gen1.getObV().getHabitatArea());
        System.out.println(gen1.getObV().getEatenFood());

        System.out.println(gen1.getObT().getClass());
        System.out.println(gen1.getObV().getClass());
        System.out.println(gen1.getObK().getClass());
    }
}

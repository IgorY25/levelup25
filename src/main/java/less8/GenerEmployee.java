package less8;

import java.util.Random;

public class GenerEmployee {
    private String fio;
    private int tabn;
    private int workAge;

    public GenerEmployee(int index) {
        this.tabn = index + 1;
        String name;
        int ret, gender;

        String fiom[] = {"Иван", "Федор", "Петр", "Сидор", "Нефед"};
        String fiof[] = {"Фекла", "Мария", "Светлана", "Ольга", "Алла"};
        Random random = new Random();
        gender = random.nextInt(2);
        ret = random.nextInt(5);
        name = fiom[ret] + (gender == 0 ? "ов " : "ова ");
        ret = random.nextInt(5);
        name = name + (gender == 0 ? fiom[ret] : fiof[ret]) + " ";
        ret = random.nextInt(5);
        name = name + fiom[ret] + (gender == 0 ? "ович" : "овна");
        this.fio = name;
        this.workAge = random.nextInt(40) + 1;

    }

    public String getFio() {
        return fio;
    }

    public int getWorkAge() {
        return workAge;
    }

    public int getTabn() {
        return tabn;
    }
}


package less9;

import java.util.Random;

public class GenerBook {

    private String fio;
    private String phone;
    private Provider operator;
    private boolean city;

    public String getFio() {
        return fio;
    }

    public String getPhone() {
        return phone;
    }

    public Provider getOperator() {
        return operator;
    }

    public boolean isСity() {
        return city;
    }

    @Override
    public String toString() {

        return "GenerBook{" +
                "fio='" + fio + '\'' +
                ", phone='" + phone + '\'' +
                ", operator=" + operator +
                ", sity=" + city +
                '}';
    }

    public GenerBook(int index) {
        String name;
        char operNom;
        int ret, gender;
        index = index + 1000000000;
        this.phone = Integer.toString(index);
        String fiom[] = {"Иван", "Федор", "Петр", "Сидор", "Нефед", "Богдан", "Агафон", "Евдоким", "Ефим", "Ефрем", "Онисим", "Олег", "Ждан", "Платон"};
        String fiof[] = {"Фекла", "Мария", "Светлана", "Ольга", "Алла", "Елена", "Ирина", "Алиса", "Наталья", "Зинаида", "Маруся", "Анна", "Груша", "Елизавета"};
        Random random = new Random();
        gender = random.nextInt(2);
        ret = random.nextInt(14);
        name = fiom[ret] + (gender == 0 ? "ов " : "ова ");
        ret = random.nextInt(14);
        name = name + (gender == 0 ? fiom[ret] : fiof[ret]) + " ";
        ret = random.nextInt(14);
        name = name + fiom[ret] + (gender == 0 ? "ович" : "овна");
        this.fio = name;
        index = (index % 2 != 0) ? (index - 1) : index;
        operNom = Integer.toString(index).charAt(9);
        switch (operNom) {
            case '0':
                this.operator = Provider.BEELINE;
                this.city = false;
                break;
            case '2':
                this.operator = Provider.МЕГАФОН;
                this.city = false;
                break;
            case '4':
                this.operator = Provider.МТС;
                this.city = false;
                break;
            case '6':
                this.operator = Provider.ТЕЛЕ2;
                this.city = false;
                break;
            case '8':
                this.operator = Provider.РОСТЕЛЕКОМ;
                this.city = true;
        }
    }
}


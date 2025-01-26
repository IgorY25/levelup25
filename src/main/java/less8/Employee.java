package less8;

public class Employee {
    private String fio;
    private Integer tabnum;
    private int workAge;

    public Employee(String fio, Integer tabnum, int workAge) {
        this.fio = fio;
        this.tabnum = tabnum;
        this.workAge = workAge;
    }

    public String getFio() {
        return fio;
    }

    public Integer getTabnum() {
        return tabnum;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setTabnum(Integer tabnum) {
        this.tabnum = tabnum;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public String toString() {
        return "ФИО: " + fio + " Таб.номер: " + tabnum + " Стаж: " + workAge;
    }
}

package less9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PartPhoneBook {
    private String abonent;
    private Provider operator;
    private boolean city;
    private Set<String> relation;
    private int count;

    public PartPhoneBook(String abonent, Provider operator, boolean city) {
        this.abonent = abonent;
        this.operator = operator;
        this.city = city;
        this.relation = new TreeSet<>();
        this.count = 0;
    }

    public void setRelation(String phone) {
        this.relation.add(phone);
    }

    public void setCount() {
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public Set<String> getRelation() {
        return relation;
    }

    @Override
    public String toString() {
        return "PartPhoneBook{" +
                "abonent='" + abonent + '\'' +
                ", operator=" + operator +
                ", city=" + city +
                ", relation=" + relation +
                ", count=" + count +
                '}';
    }
}


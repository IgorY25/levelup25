package less8;

import java.util.*;

public class CollRun {
    public static void main(String[] args) {
        int countEl = 20, wage = 21;
        ArrayList<Employee> employList = new ArrayList<>();
        GenerEmployee gemp;
        for (int i = 0; i < countEl; i++) {
            gemp = new GenerEmployee(i);
            employList.add(new Employee(gemp.getFio(), gemp.getTabn(), gemp.getWorkAge()));
        }
        System.out.println("ArrayList*********************");
        System.out.println("Количество элементов ArrayList: " + employList.size());
        ListIterator<Employee> integerListIterator = employList.listIterator();

        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next().toString());
        }
        System.out.println("-------------");
        EmployeeUtils.printEmployee(employList, wage);
        System.out.println("=============");
        EmployeeUtils.printRemove(employList);

        System.out.println("LinkedList*********************");
        LinkedList<Employee> employLinkedList = new LinkedList<>();
        for (int i = 0; i < countEl; i++) {
            gemp = new GenerEmployee(i);
            employLinkedList.add(new Employee(gemp.getFio(), gemp.getTabn(), gemp.getWorkAge()));
        }
        System.out.println("Количество элементов LinkedList: " + employLinkedList.size());
        ListIterator<Employee> integerLinkedIterator = employLinkedList.listIterator();
        while (integerLinkedIterator.hasNext()) {
            System.out.println(integerLinkedIterator.next().toString());
        }
        System.out.println("-------------");
        EmployeeUtils.printEmployee(employLinkedList, wage);
        System.out.println("=============");
        EmployeeUtils.printRemove(employLinkedList);

        System.out.println("TreeSet*********************");
        Set<Employee> employTreeSet = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getTabnum().compareTo(o2.getTabnum());
            }
        });
        for (int i = 0; i < countEl; i++) {
            gemp = new GenerEmployee(i);
            employTreeSet.add(new Employee(gemp.getFio(), (Integer) gemp.getTabn(), gemp.getWorkAge()));
        }
        System.out.println("Количество элементов TreeSet: " + employTreeSet.size());
        Iterator<Employee> integerTreeSetIterator = employTreeSet.iterator();
        while (integerTreeSetIterator.hasNext()) {
            System.out.println(integerTreeSetIterator.next().toString());
        }
        System.out.println("-------------");
        EmployeeUtils.printEmployee(employTreeSet, wage);
        System.out.println("=============");
        EmployeeUtils.printRemove(employTreeSet);
    }
}

package less8;

import java.util.*;
import java.util.function.Predicate;

public class EmployeeUtils {
    public static void printEmployee(Collection<Employee> parameterList, int workAge) {
        Employee temp = new Employee("ff", 1, 1);
        System.out.println("Список со стажем >" + workAge);
        Iterator<Employee> iterUtils = parameterList.iterator();

        while (iterUtils.hasNext()) {
            temp = iterUtils.next();
            if (temp.getWorkAge() > workAge) {
                System.out.println(temp);
            }
        }
    }

    public static void printRemove(Collection<Employee> parameterList) {
        int arrSize, tabnumber;
        Employee temp = new Employee("ff", 1, 1);
        System.out.println("Удаление по нечетным табельным номерам:");
        if (parameterList instanceof ArrayList<Employee> | parameterList instanceof LinkedList<Employee>) {
            arrSize = parameterList.size();
            System.out.println("Размер списка " + arrSize);
            ListIterator<Employee> iterUtils = ((AbstractList<Employee>) parameterList).listIterator(arrSize);
            while (iterUtils.hasPrevious()) {
                temp = iterUtils.previous();
                tabnumber = temp.getTabnum();
                System.out.println("Таб.N:" + tabnumber);
                if (tabnumber % 2 != 0) {
                    System.out.println("Удаляем " + temp.toString());
                    iterUtils.remove();
                }
            }
            System.out.println("Объем после удаления: " + parameterList.size());
            System.out.println("Оставшиеся элементы:");
            while (iterUtils.hasNext()) {
                System.out.println(iterUtils.next().toString());
            }

        } else {
            arrSize = parameterList.size();
            System.out.println("Размер TreeSet " + arrSize);
            TreeSet<Employee> employTreeSet = (TreeSet) parameterList;

            Iterator<Employee> integerTreeSetIterator = employTreeSet.descendingIterator();
            while (integerTreeSetIterator.hasNext()) {
                temp = integerTreeSetIterator.next();
                tabnumber = temp.getTabnum();
                System.out.println("Таб.N:" + tabnumber);
                if (tabnumber % 2 != 0) {
                    System.out.println("Удаляем: ");
                    System.out.println(temp);
                    integerTreeSetIterator.remove();
                }
            }

            System.out.println("Объем после удаления: " + parameterList.size());
            System.out.println("Оставшиеся элементы:");
            for (Employee empl : employTreeSet) {
                System.out.println(empl);
            }
        }
    }
}

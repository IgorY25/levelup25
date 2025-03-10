package less10;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGener {
    public static void main(String[] args) {
        Supplier<Stream<Long>> streamSupplier =
                () -> Stream.generate(Math::random)
                        .limit(1000)
                        .map(s -> Math.round(s * 10000));
        IntHolder intHolder = new IntHolder();
        Map<Long, Long> resLong =
                streamSupplier.get()
                        .distinct()
                        .sorted(Comparator.naturalOrder())
                        .collect(Collectors.toMap(Function.identity(),value -> {
                                    Long sum = 0L;
                                    System.out.println(value);
                                    intHolder.setValue(value);
                                    while (value > 0) {
                                        sum += + value % 10;
                                        value /= 10;
                                    }
                                    if (sum > 9) {
                                        value = sum;
                                        sum = 0L;
                                        while (value > 0) {
                                            sum += + value % 10;
                                            value /= 10;
                                        }
                                    }
                                    if (sum > 9) {
                                        value = sum;
                                        sum = 0L;
                                        while (value > 0) {
                                            sum += value % 10;
                                            value /= 10;
                                        }
                                    }
                                    return sum;
                                })
                        );
        System.out.println("Среднее значение: " + intHolder.getValue());
        System.out.println("Минимальноее значение: " + intHolder.getMin());
        System.out.println("Максимальное значение: " + intHolder.getMax());
        System.out.println("Cумма нечетных элементов: " + intHolder.getUneven());
        Map<Long, Long> sortedMap = new TreeMap<>(resLong);
        System.out.println("Sorted Map: " + sortedMap);
    }
}

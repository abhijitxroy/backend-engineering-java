import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSortDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                23, 4, 56, 78, 12, 22
        );

        System.out.println("Ascending Order:");

        numbers.stream()
                .sorted()
                .forEach(number -> System.out.print(number + " "));

        System.out.println("\n");

        System.out.println("Descending Order:");

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(number -> System.out.print(number + " "));
    }
}

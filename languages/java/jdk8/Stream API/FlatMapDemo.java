import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<List<String>> departments = Arrays.asList(
                Arrays.asList("Rahul", "Amit"),
                Arrays.asList("Priya", "Zoya")
        );

        System.out.println("Before flatMap:");
        System.out.println(departments);

        System.out.println("\nAfter flatMap:");

        departments.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}

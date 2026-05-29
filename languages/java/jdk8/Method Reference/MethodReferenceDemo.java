import java.util.Arrays;
import java.util.List;

public class StaticMethodReferenceDemo {

    public static void main(String[] args) {

        List<String> numbers = Arrays.asList(
                "10",
                "20",
                "30",
                "40"
        );

        System.out.println("Converting String To Integer:");

        numbers.stream()
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}

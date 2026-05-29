import java.util.Arrays;
import java.util.List;

public class MapDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "rahul",
                "amit",
                "priya",
                "zoya"
        );

        System.out.println("Before map():");
        System.out.println(names);

        System.out.println("\nAfter map():");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

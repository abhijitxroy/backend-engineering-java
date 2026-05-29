import java.util.Arrays;
import java.util.List;

public class StreamMethodReferenceDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "rahul",
                "amit",
                "priya",
                "zoya"
        );

        System.out.println("Names In Uppercase:");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

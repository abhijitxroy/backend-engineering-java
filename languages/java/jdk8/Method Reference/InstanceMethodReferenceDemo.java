import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Rahul",
                "Amit",
                "Priya",
                "Zoya"
        );

        System.out.println("Using Instance Method Reference:");

        names.forEach(System.out::println);
    }
}

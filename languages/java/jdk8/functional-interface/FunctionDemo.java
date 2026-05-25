import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        /*
         * Function<T,R>
         *
         * T -> Input
         * R -> Return Type
         */

        Function<String, Integer> function1 =

                value -> value.length();

        System.out.println(

                function1.apply("BackendEngineering")

        );

        Function<Integer, Integer> function2 =

                value -> value * value;

        System.out.println(

                function2.apply(5)

        );

        List<String> technologies =

                Arrays.asList(

                        "Java",

                        "Kafka",

                        "Spring"

                );

        technologies.stream()

                .map(String::toUpperCase)

                .forEach(System.out::println);

    }

}
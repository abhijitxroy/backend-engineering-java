// Consumer is a predefined Functional Interface provided by JDK.
// Consumer<T> accepts a single input argument and returns no result.

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    // Backend engineering usage:
    // Logging pipelines
    // Event processing
    // Stream processing operations

    public static void main(String[] args) {

        // Way-1
        Consumer<Integer> consumer1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println("Accept: " + value);
            }
        };
        consumer1.accept(10); // "Accept: 10"

        ////////////////////////////////////////////////

        // Way-2
        Consumer<Integer> consumer2 = value -> System.out.println("Accept: " + value);
        consumer2.accept(100); // "Accept: 100"

        // Example-1
        List<Integer> list = List.of(22,3,4,56,1,10,34);
        // list.stream().forEach(consumer1);
        // OR
        list.forEach(value -> System.out.print(value + " "));

        System.out.println();

        // Example-2
        Consumer<String> logger = message -> System.out.println("LOG: " + message);
        logger.accept("Consumer Functional Interface Demo");
    }

}
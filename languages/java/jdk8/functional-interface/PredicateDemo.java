// Predicate is a predefined Functional Interface provided by JDK.
// Predicate<T> accepts input and returns boolean result.

import java.util.List;
import java.util.function.Predicate;

// Backend engineering usage:
// Data filtering
// Validation pipelines
// Business rule processing

public class PredicateDemo implements Predicate<Integer>{
   
    @Override
    public boolean test(Integer value) {
        return value % 2 == 0;
    }

    public static void main(String[] args) {

        // Way-1
        Predicate<Integer> predicate1 = new PredicateDemo();
        System.out.println("Predicate1 Result: "+predicate1.test(10));

        // Way-2
        Predicate<Integer> predicate2 = value -> value % 2 == 0;
        System.out.println("Predicate2 Result: "+predicate2.test(100));

        // Example-1
        List<Integer> list = List.of(22,3,4,56,1,10,34);
        // list.stream().forEach(consumer1); 
        // OR
        list.stream().filter(predicate2).forEach(number -> System.out.println("Even Number: " + number));
        
        System.out.println();

        // Example-2
        Predicate<String> validName = name -> !name.isBlank();
        System.out.println("Valid Name: " + validName.test("BackendEngineering"));
    }
}

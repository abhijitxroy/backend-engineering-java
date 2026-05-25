import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Backend engineering usage:
// Aggregation operations
// Report generation
// Analytics processing
// Stream reduction patterns

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,7,8,1,5,9);

        // Example-1 sum of all elements from an array/list
        // Way-1 
        int sum = 0;
        for(int a : list){
            sum = sum + a;
        }
        System.out.println("Brute Force Sum: " + sum);
        
        // Way-2
        Integer sum2  = list.stream().mapToInt(e -> e).sum();
        System.out.println("Sum with stream sum : " + sum2);

        // reduce combines stream elements into single aggregated result

        // Way-3 - Using reduce + lambda
        Integer sum3 = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum with reduce : "  + sum3);

        // Way-4 - Using reduce + method reference
        Optional<Integer> sum4 = list.stream().reduce(Integer::sum);
        System.out.println("Sum with reduce method ref: " + sum4.orElse(0));
        
        /////////////////////////////////////////////////////////////////////

        // Example-2 : Print max value from an array/list
        Integer maxValByReduce = list.stream().reduce(0, Integer::max);
        Integer maxValByReduceMethodRef = list.stream().reduce(Integer::max).get();
        
        System.out.println("Max Value by reduce: " + maxValByReduce);
        System.out.println("Max Value by method reference: " + maxValByReduceMethodRef);

        /////////////////////////////////////////////////////////////////////
        
        // Backend usage:
        // Report processing
        // Largest payload identification
        // Aggregated result processing

        // Example-3 : Print max length String from an array/list
        List<String> words = Arrays.asList("CoreJava", "Spring", "Hibernate", "Docker", "AWS", "Kubernetes", "kafka", "redis");
        String maxLengthWord = words.stream()
                                    .reduce("", (i1, i2) -> i1.length() > i2.length() ? i1 : i2);
        System.out.println("Max length word: " + maxLengthWord); 
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Backend engineering usage:
// Sorting pipelines
// Ranking operations
// Data presentation ordering
// Collection processing discussions

public class ListSortDemo {
    
    public static void main(String[] args) {
        
        // List sort - using collections
        List<Integer> numbers = new ArrayList<>(List.of(23, 4, 56, 78, 12, 22));

        
        // Way-1: 
        Collections.sort(numbers);

        numbers.stream().forEach(number -> System.out.print(number + " "));
        System.out.println();

        // Way-2: 
        numbers.stream().sorted().forEach(number -> System.out.print(number + " "));
        System.out.println();

        // Way-3 - Comparator compareTo lambda function
        numbers.stream().sorted(Integer::compareTo).forEach(number -> System.out.print(number + " "));
        System.out.println();

        // Descending ordering example
        // Way-4: 
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.print(number + " "));
        System.out.println();

        // Way-5: 
        numbers.stream().sorted(Comparator.naturalOrder()).forEach(number -> System.out.print(number + " "));
        System.out.println();
    }
    
    // Sorting directly influences backend reporting, analytics and response formatting patterns.
}

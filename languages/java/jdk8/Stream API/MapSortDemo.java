import java.util.HashMap;
import java.util.Map;

public class MapSortDemo {

    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();

        scores.put("Rahul", 85);
        scores.put("Amit", 92);
        scores.put("Priya", 78);
        scores.put("Zoya", 95);

        System.out.println("Sort By Value (Ascending):");

        scores.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println("\nSort By Value (Descending):");

        scores.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                3, 7, 8, 1, 5, 9
        );

        Integer totalSalary = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Total Sum: " + totalSalary);

        Integer highestValue = numbers.stream()
                .reduce(Integer::max)
                .orElse(0);

        System.out.println("Highest Value: " + highestValue);

        List<String> technologies = Arrays.asList(
                "Java",
                "Spring",
                "Docker",
                "Kubernetes",
                "Terraform"
        );

        String longestTechnology = technologies.stream()
                .reduce(
                        (first, second) ->
                                first.length() > second.length()
                                        ? first
                                        : second
                )
                .orElse("");

        System.out.println("Longest Technology: " + longestTechnology);
    }
}

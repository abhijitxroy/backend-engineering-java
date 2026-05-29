import java.util.List;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        List<String> employees = List.of(
                "Rahul",
                "Amit",
                "Priya",
                "Zoya",
                "Karan"
        );

        System.out.println("Sequential Stream:");

        employees.stream()
                .forEach(employee ->
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " -> "
                                        + employee
                        )
                );

        System.out.println("\nParallel Stream:");

        employees.parallelStream()
                .forEach(employee ->
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " -> "
                                        + employee
                        )
                );

        System.out.println("\nInterview Rule:");
        System.out.println(
                "Use parallel streams only after performance testing."
        );
    }
}

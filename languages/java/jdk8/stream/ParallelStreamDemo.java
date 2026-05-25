// Backend engineering usage:
// Parallel data processing
// CPU intensive workloads
// Aggregation processing
// Performance optimization discussions
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        // Sequential stream processing
        start = System.currentTimeMillis();
        IntStream.range(0, 10)
                 .forEach(number ->
                     System.out.println(Thread.currentThread().getName() + " prints " + number)
                 );
        end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Single core execution time: " + (end - start) + "ms");
        System.out.println("======================"); 
        // Parallel stream processing
        start = System.currentTimeMillis();
        IntStream.range(0, 10)
                 .parallel()
                 .forEach(number ->
                     System.out.println(Thread.currentThread().getName() + " prints " + number)
                 );
        end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Parallel multi core execution time: " + (end - start) + "ms");

        System.out.println("======================");
        System.out.println("Backend consideration:");
        System.out.println("Use parallel stream only after performance validation.");
    }
}

// Parallel streams improve throughput but may increase thread management overhead.
// Measure before adopting in backend production systems.

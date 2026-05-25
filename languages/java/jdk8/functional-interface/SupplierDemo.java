// Supplier is a predefined Functional Interface provided by JDK.
// Supplier<T> returns data without accepting input.
// Method:
// T get();
// Backend engineering usage:
// Default configuration values
// Lazy object creation
// Fallback data generation
// Environment configuration loading
// Feature flag default generation

import java.util.List;
import java.util.function.Supplier;
public class SupplierDemo implements Supplier<String> {

    @Override
    public String get() {
        return "DefaultUser";
    }
    
    public static void main(String[] args) {

        // Way-1
        Supplier<String> supplier1 = new SupplierDemo();
        System.out.println(supplier1.get());

        // Way-2
        Supplier<String> supplier2 = () -> "BackendEngineer";

        System.out.println(supplier2.get());

        // Example-1
        // orElseGet invokes Supplier only when value is absent.
        List<String> list = List.of("John", "Dcosta");
        System.out.println(list.stream().findAny().orElseGet(supplier1));

        System.out.println();

        // Example-2
        Supplier<String> environment = () -> "Production";
        System.out.println("Environment: " + environment.get());

    }
}

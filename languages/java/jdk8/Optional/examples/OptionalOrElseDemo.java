import java.util.Optional;

public class OptionalOrElseDemo {

    public static void main(String[] args) {

        Optional<String> name = Optional.empty();

        String value1 = name.orElse("Default User");

        String value2 = name.orElseGet(
                () -> "Generated User"
        );

        System.out.println("orElse(): " + value1);
        System.out.println("orElseGet(): " + value2);

        try {
            name.orElseThrow(
                    () -> new RuntimeException("User Not Found")
            );
        } catch (RuntimeException ex) {
            System.out.println("orElseThrow(): " + ex.getMessage());
        }
    }
}

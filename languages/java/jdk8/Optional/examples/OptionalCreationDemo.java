import java.util.Optional;

public class OptionalCreationDemo {

    public static void main(String[] args) {

        Optional<String> name1 = Optional.of("Rahul");

        Optional<String> name2 = Optional.ofNullable(null);

        Optional<String> name3 = Optional.empty();

        System.out.println("Optional.of(): " + name1);
        System.out.println("Optional.ofNullable(): " + name2);
        System.out.println("Optional.empty(): " + name3);
    }
}

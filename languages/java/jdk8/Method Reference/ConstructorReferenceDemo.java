import java.util.function.Supplier;

class User {

    User() {
        System.out.println("User Object Created");
    }
}

public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        Supplier<User> supplier = User::new;

        User user = supplier.get();
    }
}

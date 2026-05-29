import java.util.Optional;

class User {

    private final Long id;
    private final String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class UserRepository {

    public Optional<User> findById(Long id) {

        if (id == 1L) {
            return Optional.of(new User(1L, "Rahul"));
        }

        return Optional.empty();
    }
}

public class OptionalRepositoryDemo {

    public static void main(String[] args) {

        UserRepository repository = new UserRepository();

        User user = repository
                .findById(1L)
                .orElseThrow(
                        () -> new RuntimeException("User Not Found")
                );

        System.out.println("User: " + user.getName());
    }
}

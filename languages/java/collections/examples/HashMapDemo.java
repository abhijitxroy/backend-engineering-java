package backend_engineering.languages.java.collections.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> users = new HashMap<>();

        // put()
        users.put(1, "John");
        users.put(2, "Alice");

        System.out.println("Initial Map");
        System.out.println(users);

        // get()
        System.out.println("\nget(1): " + users.get(1));

        // containsKey()
        System.out.println(
                "containsKey(2): " + users.containsKey(2));

        // putIfAbsent()
        users.putIfAbsent(2, "Bob");
        users.putIfAbsent(3, "David");

        System.out.println("\nAfter putIfAbsent()");
        System.out.println(users);

        // computeIfAbsent()
        users.computeIfAbsent(
                4,
                id -> "User-" + id
        );

        System.out.println("\nAfter computeIfAbsent()");
        System.out.println(users);

        // remove()
        users.remove(1);

        System.out.println("\nAfter remove(1)");
        System.out.println(users);
    }
}

package backend_engineering.languages.java.collections.examples;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) throws InterruptedException {

        Map<Integer, String> users = new ConcurrentHashMap<>();

        Thread writer1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                users.put(i, "User-" + i);
                System.out.println("Writer-1 Added: " + i);
            }
        });

        Thread writer2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                users.put(i, "User-" + i);
                System.out.println("Writer-2 Added: " + i);
            }
        });

        writer1.start();
        writer2.start();

        writer1.join();
        writer2.join();

        System.out.println("\nFinal Map");
        users.forEach((id, name) ->
                System.out.println(id + " -> " + name));

        System.out.println("\ncomputeIfAbsent Demo");

        String user = users.computeIfAbsent(
                11,
                id -> "User-" + id
        );

        System.out.println("Added: " + user);
    }
}

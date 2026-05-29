package backend_engineering.languages.java.collections.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastDemo {

    public static void main(String[] args) {

        failFastExample();

        System.out.println("\n==============================\n");

        failSafeExample();
    }

    private static void failFastExample() {

        System.out.println("Fail Fast Example");

        List<String> users = new ArrayList<>();
        users.add("John");
        users.add("Alice");

        try {
            for (String user : users) {
                System.out.println(user);
                users.add("Bob");
            }
        } catch (Exception e) {
            System.out.println(
                    "Exception: " + e.getClass().getSimpleName());
        }
    }

    private static void failSafeExample() {

        System.out.println("Fail Safe Example");

        CopyOnWriteArrayList<String> users =
                new CopyOnWriteArrayList<>();

        users.add("John");
        users.add("Alice");

        for (String user : users) {
            System.out.println(user);
            users.add("Bob");
        }

        System.out.println("Final List: " + users);
    }
}

package backend_engineering.languages.java.jdk8.Lambda.examples;

import java.util.ArrayList;
import java.util.List;

public class LambdaComparatorDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Zoya");
        names.add("Priya");

        names.sort((a, b) -> a.compareTo(b));

        System.out.println("Ascending Order:");
        names.forEach(System.out::println);

        names.sort((a, b) -> b.compareTo(a));

        System.out.println("\nDescending Order:");
        names.forEach(System.out::println);
    }
}

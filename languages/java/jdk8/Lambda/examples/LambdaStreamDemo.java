package backend_engineering.languages.java.jdk8.Lambda.examples;

import java.util.Arrays;
import java.util.List;

public class LambdaStreamDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Rahul",
                "Amit",
                "Priya",
                "Zoya",
                "Pooja"
        );

        System.out.println("Names Starting With P:");

        names.stream()
                .filter(name -> name.startsWith("P"))
                .forEach(System.out::println);
    }
}

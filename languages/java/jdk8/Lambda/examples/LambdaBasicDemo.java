package backend_engineering.languages.java.jdk8.Lambda.examples;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class LambdaBasicDemo {

    public static void main(String[] args) {

        Calculator calculator = (a, b) -> a + b;

        int result = calculator.add(10, 20);

        System.out.println("Result: " + result);
    }
}

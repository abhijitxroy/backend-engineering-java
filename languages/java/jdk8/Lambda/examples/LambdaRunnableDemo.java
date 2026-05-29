package backend_engineering.languages.java.jdk8.Lambda.examples;

public class LambdaRunnableDemo {

    public static void main(String[] args) {

        Runnable task = () ->
                System.out.println("Task Running Using Lambda");

        Thread thread = new Thread(task);

        thread.start();
    }
}

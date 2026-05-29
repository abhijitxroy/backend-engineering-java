import java.util.concurrent.CompletableFuture;

public class RunAsyncDemo {

    public static void main(String[] args) {

        CompletableFuture<Void> future =
                CompletableFuture.runAsync(() -> {
                    System.out.println("Background Task Running");
                });

        future.join();

        System.out.println("Task Completed");
    }
}

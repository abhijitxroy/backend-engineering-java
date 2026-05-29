import java.util.concurrent.CompletableFuture;

public class ExceptionallyDemo {

    public static void main(String[] args) {

        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {
                    throw new RuntimeException("Service Unavailable");
                }).exceptionally(ex -> {
                    System.out.println("Error: " + ex.getMessage());
                    return "Default Response";
                });

        System.out.println(future.join());
    }
}

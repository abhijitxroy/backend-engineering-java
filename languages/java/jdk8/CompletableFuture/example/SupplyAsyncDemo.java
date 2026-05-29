import java.util.concurrent.CompletableFuture;

public class SupplyAsyncDemo {

    public static void main(String[] args) {

        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {
                    return "User Data Loaded";
                });

        String result = future.join();

        System.out.println(result);
    }
}

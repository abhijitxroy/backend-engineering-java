import java.util.concurrent.CompletableFuture;

public class ThenApplyDemo {

    public static void main(String[] args) {

        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(
                        () -> "rahul"
                )
                .thenApply(String::toUpperCase);

        System.out.println(future.join());
    }
}

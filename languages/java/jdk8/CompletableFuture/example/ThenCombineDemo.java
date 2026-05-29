import java.util.concurrent.CompletableFuture;

public class ThenCombineDemo {

    public static void main(String[] args) {

        CompletableFuture<String> userFuture =
                CompletableFuture.supplyAsync(
                        () -> "User"
                );

        CompletableFuture<String> orderFuture =
                CompletableFuture.supplyAsync(
                        () -> "Order"
                );

        CompletableFuture<String> result =
                userFuture.thenCombine(
                        orderFuture,
                        (user, order) -> user + " " + order
                );

        System.out.println(result.join());
    }
}

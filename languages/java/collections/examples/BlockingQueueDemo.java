package backend_engineering.languages.java.collections.examples;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {

    public static void main(String[] args) {

        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer: Adding Task-1");
                queue.put("Task-1");

                System.out.println("Producer: Adding Task-2");
                queue.put("Task-2");

                System.out.println("Producer: Adding Task-3");
                queue.put("Task-3");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(1000);

                System.out.println("Consumer: Processing " + queue.take());
                System.out.println("Consumer: Processing " + queue.take());
                System.out.println("Consumer: Processing " + queue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}

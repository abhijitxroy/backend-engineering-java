package backend-engineering.design-patterns.creational.abstract-factory;

public class AbstractFactoryDesignPattern {

  public static void main(String[] args) {

    CloudFactory awsFactory = new AwsFactory();

    StorageService storage = awsFactory.createStorage();
    QueueService queue = awsFactory.createQueue();

    storage.store();
    queue.send();
  }
}

// Real-world examples:
// Multi-Cloud Platforms
// Database Providers
// Payment Providers
// Notification Providers

interface CloudFactory {

  StorageService createStorage();

  QueueService createQueue();
}

class AwsFactory implements CloudFactory {

  @Override
  public StorageService createStorage() {
    return new S3StorageService();
  }

  @Override
  public QueueService createQueue() {
    return new SqsQueueService();
  }
}

interface StorageService {
  void store();
}

interface QueueService {
  void send();
}

class S3StorageService implements StorageService {

  @Override
  public void store() {
    System.out.println("Stored in S3");
  }
}

class SqsQueueService implements QueueService {

  @Override
  public void send() {
    System.out.println("Message sent to SQS");
  }
}

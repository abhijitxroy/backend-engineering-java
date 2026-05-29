package backend-engineering.design-patterns.creational.singleton;

public class SingletonDesignPattern {

  public static void main(String[] args) {

    AppConfig config1 = AppConfig.getInstance();
    AppConfig config2 = AppConfig.getInstance();

    System.out.println(config1 == config2);
  }
}

// Real-world examples:
// Spring Singleton Beans
// Configuration Managers
// Logging Systems
// Cache Managers

class AppConfig {

  private static AppConfig instance;

  private AppConfig() {
  }

  public static AppConfig getInstance() {

    if (instance == null) {
      instance = new AppConfig();
    }

    return instance;
  }
}

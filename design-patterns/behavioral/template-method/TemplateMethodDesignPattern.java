package backend-engineering.design-patterns.behavioral.template-method;

public class TemplateMethodDesignPattern {

  public static void main(String[] args) {

    DataProcessor processor = new CsvDataProcessor();
    processor.process();
  }
}

// Real-world examples:
// JdbcTemplate
// RestTemplate
// Spring Batch
// ETL Pipelines

abstract class DataProcessor {

  public final void process() {
    readData();
    transformData();
    saveData();
  }

  protected abstract void readData();

  protected abstract void transformData();

  protected void saveData() {
    System.out.println("Data Saved");
  }
}

class CsvDataProcessor extends DataProcessor {

  @Override
  protected void readData() {
    System.out.println("Reading CSV Data");
  }

  @Override
  protected void transformData() {
    System.out.println("Transforming CSV Data");
  }
}

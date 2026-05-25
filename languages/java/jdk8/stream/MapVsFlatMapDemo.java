import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Backend engineering usage:
// Data transformation pipelines
// Collection flattening
// Report generation and aggregation processing

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = CustomerDatabase.getAllCustomers();

        // map -> One To One transformation
        // flatMap -> Flatten nested collections

        // Fetch all the customer emails from the customer list
        // Using map -> Data transformation -> One To One Mapping
        List<String> emailList = customers.stream()
                                            .map(Customer::getEmail)
                                            .collect(Collectors.toList());
        System.out.println(emailList);

        // Fetch all the customer phonelist from the customer list
        // Using map -> Data transformation -> One To Many Mapping
        List<List<String>> phoneList = customers.stream()
                                                .map(Customer::getPhone)
                                                .collect(Collectors.toList());
        System.out.println("Phone List (Nested): " + phoneList);

        // Fetch all the customer phonelist from the customer list
        // Using flatMap -> Data transformation -> One To Many Mapping 
        List<String> flatMapPhoneList = customers.stream()
                                                    .flatMap(customer -> customer.getPhone().stream())
                                                    .collect(Collectors.toList());
        System.out.println("Phone List (Flattened): " + flatMapPhoneList);
 
    }
}

class CustomerDatabase {
    public static List<Customer> getAllCustomers(){
        return Arrays.asList(
            new Customer(101, "john", "john@email.com", Arrays.asList("12345", "67890")),
            new Customer(102, "smith", "smith@email.com", Arrays.asList("23456", "78901")),
            new Customer(103, "peter", "peter@email.com", Arrays.asList("34567", "89012")),
            new Customer(104, "kelly", "kelly@email.com", Arrays.asList("45678", "90123")),
            new Customer(105, "oliver", "oliver@email.com", Arrays.asList("56789", "01234"))
        );
    }
}
class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> phone;

    public Customer(int id, String name, String email, List<String> phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getPhone() {
        return phone;
    }
    public void setPhone(List<String> phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
    }  
}

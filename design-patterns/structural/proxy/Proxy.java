package structural.proxy;

import java.util.Scanner;

public class Proxy extends EmployeeImpl {

    private boolean isAuthenticate;

    @SuppressWarnings("resource")
    @Override
    public void getEmpDetails() {
        // First authenticate yourself then will fetch employee details if valid
        System.out.println("Please authenticate yourself, will fetch employee details if valid");
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide your auth Key: " + scan);

        String authKey = scan.nextLine();
        System.out.println("AuthKey is: " + authKey);

        isAuthenticate = authKey.trim().equals("abhi123") ? true : false;

        if (isAuthenticate) {
            super.getEmpDetails();
        } else {
            System.out.println("You are failed to authenticate yourself.");
        }

    }
}

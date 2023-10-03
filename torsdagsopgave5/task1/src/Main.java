import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("Bekhan", "Mahauri", "bingbong", 1);
        Customer customer2 = new Customer("Aslan", "Mahauri", "dumbass", 2);
        Customer customer3 = new Customer("Amir", "Mahauri", "Cutie", 3);
        Customer customer4 = new Customer("Madina", "Mahauri", "Mama", 4);
        Customer customer5 = new Customer("Hussein", "Mahauri", "Papa", 5);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println("Customer " + customer.getID() + ": ");
            System.out.println(customer.toString());
        }
    }
}
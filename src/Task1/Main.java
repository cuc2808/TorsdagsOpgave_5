package Task1;

import java.util.ArrayList;

public class Main {

    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {

        Customer customer1 = new Customer("Lars", "Bo", "LB69");
        Customer customer2 = new Customer("Benny", "Buksedreng", "BukserneBrændteLOL");
        customers.add(customer1);
        customers.add(customer2);

        printCustomers(customers);

        }


    public static void printCustomers(ArrayList<Customer> customers){

        for(Object customer : customers){

        System.out.println(customer.toString());

        }
    }
}
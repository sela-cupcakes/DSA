import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerServiceSerafin{

    public static void main(String[] args) {
        Queue<Integer> customerQueue = new LinkedList<>();//Create a queue to store customer IDs using a LinkedList
        Scanner scanner = new Scanner(System.in);//Create a scanner object to read user input from the console

        while (true) {
            System.out.println("--- Customer Service Queue ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. View Next Customer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();//Read the user's choice as an integer
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1://Add customer
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();//Add the customer ID to the queue
                    customerQueue.add(customerId);
                    System.out.println("Customer added to the queue.");
                    break;
                case 2://Remove Customer
                    if (!customerQueue.isEmpty()) {
                        int removedCustomerId = customerQueue.remove();
                        System.out.println("Customer ID " + removedCustomerId + " removed from the queue.");
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3://view next customer
                    if (!customerQueue.isEmpty()) {
                        int nextCustomerId = customerQueue.peek();
                        System.out.println("Next customer ID: " + nextCustomerId);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 4:// Exit
                    System.out.println("End the  program.");//Close the scanner object
                    scanner.close();//Exit the program
                    return;

            }
        }
    }
}
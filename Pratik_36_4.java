public class Pratik_36_4 {
    public static void main(String[] args) {
        
        int[] customerIds = {101, 102, 103, 104, 105, 110, 120, 130, 140, 150};

        for (int i = 0; i < customerIds.length; i++) {
            int customerId = customerIds[i];

            // If the customer ID is divisible by 10, stop processing
            if (customerId % 10 == 0) {
                System.out.println("Customer with ID " + customerId + " has a special request. Stopping the queue.");
                break; // Stop the loop immediately
            }

            // If the customer ID is divisible by 5, skip their turn
            if (customerId % 5 == 0) {
                System.out.println("Customer with ID " + customerId + " is divisible by 5. Skipping their turn.");
                continue; // Skip to the next customer in the loop
            }

           
            System.out.println("Processing customer with ID " + customerId);
        }
    }
}
/*
 Output:-
 Processing customer with ID 101
Processing customer with ID 102
Processing customer with ID 103
Processing customer with ID 104
Customer with ID 105 is divisible by 5. Skipping their turn.
Customer with ID 110 has a special request. Stopping the queue.
 */
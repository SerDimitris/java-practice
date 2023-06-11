package gr.cf.bankapp;

import gr.cf.bankapp.model.JointAccount;

/**
 * The Main class for the BankApp application.
 */
public class Main {
    /**
     * The entry point of the application.
     *
     * @param args the command line arguments
     * @throws Exception if an exception occurs during execution
     */
    public static void main(String[] args) throws Exception {
        // Create a JointAccount object
        JointAccount jointAccount1 = new JointAccount(1, "123456789", "John", "Doe", "123-45-6789", 50.0);

        // Perform a deposit from the account
        jointAccount1.deposit(100.0);

        // Perform a withdrawal from the account
        jointAccount1.withdraw(200.0);

        // Print the new balance of the account
        System.out.println("New balance: " + jointAccount1.getBalance());

        // Print the account's status
        System.out.println(jointAccount1.accountToString());
    }
}

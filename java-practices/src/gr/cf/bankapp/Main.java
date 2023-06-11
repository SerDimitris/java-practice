package gr.cf.bankapp;

import gr.cf.bankapp.model.OverdraftAccount;
import gr.cf.bankapp.model.JointAccount;

public class Main {
    public static void main(String[] args) throws Exception {
        OverdraftAccount overdraftAccount = new OverdraftAccount(1000.0);
        overdraftAccount.withdraw(50.0);
        overdraftAccount.withdraw(200.0);
        System.out.println("Υπόλοιπο λογαριασμού Overdraft: " + overdraftAccount.getBalance());

        JointAccount jointAccount = new JointAccount(1, "123456789", "John", "Doe", "123-45-6789", 5000.0);
        jointAccount.withdraw(200.0);
        jointAccount.withdraw(400.0);
        jointAccount.deposit(100.0);
        System.out.println("Υπόλοιπο κοινού λογαριασμού: " + jointAccount.getBalance());
    }

}

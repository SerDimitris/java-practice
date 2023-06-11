package gr.cf.bankapp.model;

public class OverdraftAccount {
    private double balance;

    public OverdraftAccount(double initialBalance){
        balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient balance. Overdraft: ");
            balance -= amount;
        } else{
            balance -= amount;
            System.out.println("Successful withdrawal. New balance: " + balance);
        }
    }
}

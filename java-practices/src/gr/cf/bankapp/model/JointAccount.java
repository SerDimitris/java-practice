package gr.cf.bankapp.model;

import java.rmi.server.ExportException;

public class JointAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public JointAccount(){

    }

    public JointAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0){
                throw new Exception("Negative amount exception");
            }
            balance += amount;
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public void withdraw(double amount) throws Exception{
        try{
            if (amount > balance){
                throw new Exception("Insufficient balance exception");
            }
            balance -= amount;
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }


    public double getAccountBalance(){
        return getBalance();
    }

    public String accountToString(){
        return "(" + id + ", " + iban + ", " + firstname + ", " +
                lastname + ", " + ssn + ", " + balance + ")";
    }
}

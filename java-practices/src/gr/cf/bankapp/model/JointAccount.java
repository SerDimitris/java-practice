package gr.cf.bankapp.model;

import java.rmi.server.ExportException;

/**
 * Represents a Joint Account in a bank.
 */
public class JointAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    /**
     * Default constructor for JointAccount class.
     */
    public JointAccount(){
    }

    /**
     * Constructor for JointAccount class with parameters.
     *
     * @param id        the account ID
     * @param iban      the account IBAN
     * @param firstname the account holder's first name
     * @param lastname  the account holder's last name
     * @param ssn       the account holder's Social Security Number (SSN)
     * @param balance   the initial account balance
     */
    public JointAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Public API
    /** Deposits a cetain amount of money.
     *
     * @param amount
     *          the amount of money to be deposited.
     * @throws Exception
     *          if the amount is negative.
     * */
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

    /**
     * Withdraws an amount of money from an account.
     *
     * @param amount the amount to be withdrawn.
     *
     * {@link OverdraftAccount} If the amount to withdraw is greater
     *               that the balance, then overdraftAccount class is
     *               called to calculate and prints the process.
     * @throws Exception if the amount is greater than
     *                   the balance or the ssn is not valid.
     */
    public void withdraw(double amount) throws Exception{
        try{
            if(!isSsnValid(ssn)){
                throw new ExportException("Ssn not valid exception.");
            }
            if (amount > balance){
                OverdraftAccount overdraftAccount = new OverdraftAccount();
                overdraftAccount.processOverdraft(this, amount);
                setBalance(0);
            }else{
                balance -= amount;
            }
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the account.
     *
     * @return
     *      the account's balance.
     */
    public double getAccountBalance(){
        return getBalance();
    }

    /**
     * Returns the account state in string format.
     *
     * @return
     *      the string-representation of the state of the account.
     */
    public String accountToString(){
        return "(" + id + ", " + iban + ", " + firstname + ", " +
                lastname + ", " + ssn + ", " + balance + ")";
    }

    /**
     * Checks if the provided SSN is valid for the account.
     *
     * @param ssn the SSN to be checked
     * @return true if the SSN is valid, false otherwise
     */
    private boolean isSsnValid(String ssn){
        return this.ssn.equals(ssn);
    }
}

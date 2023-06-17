package gr.aueb.cf.exceptions;

public class InsufficinetBalanceException extends Exception{
    private static final long serialVersionUID = 1L;

    public InsufficinetBalanceException(){}

    public InsufficinetBalanceException(double balance, double amount){
        super("Insufficient balance" + balance + " for amount" + amount);
    }
}

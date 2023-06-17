package gr.aueb.cf.model;

import gr.aueb.cf.exceptions.InsufficinetBalanceException;
import gr.aueb.cf.exceptions.NegativeAmountException;
import gr.aueb.cf.exceptions.SsnNotValideException;

public class OverdraftAccount extends Account{

    public OverdraftAccount(){}

    public OverdraftAccount(User holder, String iban, double balance) {
        super(holder, iban, balance);
    }

    @Override
    public void withdraw(double amount, String ssn)
            throws InsufficinetBalanceException, SsnNotValideException, NegativeAmountException {
       try{
           if (amount < 0) throw new NegativeAmountException(amount);
           if (!isSsnValid(ssn)) throw new SsnNotValideException(ssn);

           setBalance(getBalance() - amount);
       } catch (SsnNotValideException | NegativeAmountException e){
           System.out.println("Error: withdrawal");
           throw e;
       }
    }
}

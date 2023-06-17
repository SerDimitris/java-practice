package gr.aueb.cf.exceptions;

public class SsnNotValideException extends Exception{
    private static final long serialVersionUID = 1L;

    public SsnNotValideException(String ssn){
        super("Ssn " + ssn + " is not valid");
    }
}

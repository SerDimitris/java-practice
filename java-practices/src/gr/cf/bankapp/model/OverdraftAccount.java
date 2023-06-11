package gr.cf.bankapp.model;

/**
 * Represents an Overdraft Account used for overdraft functionality.
 */
public class OverdraftAccount {
    private double overdraftAmount;

    /**
     * Gets the overdraft amount.
     *
     * @return the overdraft amount
     */
    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    /**
     * Sets the overdraft amount.
     *
     * @param overdraftAmount the overdraft amount to be set
     */
    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    /**
     * Processes the overdraft for a JointAccount.
     *
     * @param account the JointAccount for which to process the overdraft
     * @param amount  the amount to be withdrawn
     */
    public void processOverdraft(JointAccount account, double amount) {
        double overdraftAmount = amount - account.getAccountBalance();
        System.out.println("The overdraft amount to withdraw is: " + overdraftAmount);
    }
}
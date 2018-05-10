package week7;

public class savingAccount extends Account {

    private static double interest;

    savingAccount()
    {
        super();
        this.interest = 0.06;
    }

    savingAccount(String owner, double balance)
    {
        super(owner, balance);
        this.interest = 0.06;
    }

    savingAccount(String owner, double balance, double interest)
    {
        super(owner, balance);
        this.interest = interest/100;
    }

    public static double getInterest() {
        return interest*100;
    }

    public static void setInterest(double interest) {
        savingAccount.interest = interest/100;
    }

    public void updateBalance()
    {
        super.setBalance(super.getBalance()*(1+interest));
    }

}

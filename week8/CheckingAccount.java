package week8;

public class CheckingAccount extends Account {

    CheckingAccount()
    {
        super();
    }

    CheckingAccount(String owner, double amount)
    {
        super(owner, amount);
    }

    public String getDetails()
    {
        return getOwner() + " having " + getBalance() + " VND in the account.";
    }
}

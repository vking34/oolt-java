package week7;

public class Account {
    private String owner;
    private double balance;

    Account()
    {
        owner = null;
        balance = 0;
    }

    Account(String name, double amount)
    {
        owner = name;
        balance = amount;
    }

    public String getOwner()
    {
        return owner;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double amount)
    {
        balance = amount;
    }

    public void setOwner(String name)
    {
        owner = name;
    }

    public boolean deposit(double amount)
    {
        if(amount < 0)
        {
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean deposite(double amount, String currency)
    {
        switch (currency)
        {
            case "USD": {
                if (deposit(amount * 22747) == false) {
                    return false;
                }
                return true;
            }
            case "GBP": {
                if (deposit(amount * 31484) == false) {
                    return false;
                }
                return true;
            }
            case "JPY":{
                if (deposit(amount * 213) == false) {
                    return false;
                }
                return true;
            }
            case "VND":{
                if (deposit(amount) == false) {
                    return false;
                }
                return true;
            }
            default:
                return false;
        }
    }

}

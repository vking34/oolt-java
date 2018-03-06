package ass3;

class Account {
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

    public void setName(String name)
    {
        owner = name;
    }
}

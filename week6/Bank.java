package week6;

public class Bank {

    private String brand;
    private int maxAcc;
    private int pointAcc = 0;
    private Account[] accounts;
    Bank()
    {
        brand = null;
        maxAcc = 5;
        accounts = new Account[maxAcc];

    }

    Bank(String name, int max)
    {
        brand = name;
        maxAcc = max;
        try {
            accounts = new Account[maxAcc];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
    }

    public String getBrand()
    {
        return brand;
    }

    public void add(Account account)
    {
        if(accounts.length <= maxAcc)
        {
            accounts[pointAcc] = account;
            pointAcc++;
        }
    }

    public void printAllAccount()
    {
        if(pointAcc == 0)
        {
            return;
        }

        int i;
        for(i = 0; i < pointAcc; i++)
        {
            System.out.println("Account "+ i + ": " + accounts[i].getOwner() + " has balance: " + accounts[i].getBalance() + " VND");
        }
    }

    public double calculateTotalBalance()
    {
        int i;
        double total = 0;
        for (i = 0; i < pointAcc; i++)
        {
            total += accounts[i].getBalance();
        }
        return total;
    }
}

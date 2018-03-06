package assigment2;

class Account {
    private String owner;
    private double balance;
    static float interest;

    void credit(double amount)
    {
        if(amount < 0)
        {
            System.out.println("Please use the debit method !!!");
        }
        else {
            balance += amount;
        }
    }

    public boolean debit(double amount)
    {
        if(amount > balance)
        {
            return false;
        }
        else
        {
            balance -= amount;
            return true;
        }
    }

    public void setData(String name, double amount)
    {
        owner = name;
        balance = amount;
    }

    void checkBalance()
    {
        System.out.println(balance);
    }

    void updateBalance()
    {
        balance *= (1+interest);
    }

    double getBalance()
    {
        return balance;
    }

    String getName()
    {
        return owner;
    }

    public void setBalance(double NewValue)
    {
        balance = NewValue;
    }

    public void setName(String name)
    {
        owner = name;
    }
}


public class assignment2 {

    public static void main(String[] args) {

        Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account();
        Account acc4 = new Account();
        Account acc5 = new Account();

        acc1.setData("MinhTo",4000);
        acc2.setData("Dung", 4000);
        acc3.setData("Hung", 4000);

        Account.interest = 0.064f;

        System.out.print(acc1.getName() + "'s balance: $");
        acc1.checkBalance();
        acc1.updateBalance();
        System.out.println("Update balance: $" + acc1.getBalance());

        acc2.interest = 0.072f;
        System.out.print(acc2.getName() + "'s balance: $");
        acc2.checkBalance();
        acc2.updateBalance();
        System.out.println("1. Update balance: $" + acc2.getBalance());

        acc2.updateBalance();
        System.out.println("2. Update balance: $" + acc2.getBalance());
    }
}

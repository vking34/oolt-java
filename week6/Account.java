package week6;

class Account {
    private String owner;
    private double balance;
    static float interest;

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

    public void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("The amount is greater than the current balance.");
        }
        else {
            balance -= amount;
        }
    }

    public boolean withdraw(double amount, String currency) {
        if (currency.equals("USD")) {
            withdraw(amount * 22727);
            return true;
        } else if (currency.equals("GBP")) {
            withdraw(amount * 31488);
            return true;
        } else if (currency.equals("VND")) {
            withdraw(amount);
            return true;
        } else {
            return false;
        }
    }
}

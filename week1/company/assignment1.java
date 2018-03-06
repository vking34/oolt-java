package com.company;
class Account {
    private String owner;
    private double balance;


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


public class assignment1 {

    public static void main(String[] args) {

    Account acc1 = new Account();
    Account acc2 = new Account();
    Account acc3 = new Account();
    Account acc4 = new Account();
    Account acc5 = new Account();

    acc1.setData("MinhTo",4000);
    acc2.setData("Dung", 5000);
    acc3.setData("Hung", 6000);
    acc4.setData("Tuan", 2000);
    acc5.setData("Dat", 3000);

    System.out.println(acc1.getName() + " debits $4500.");
    if(acc1.debit(4500) == false)
    {
        System.out.println("The balance is lower !!!");
    }
    else
    {
        System.out.print(acc1.getName() + "'s balance: $");
        acc1.checkBalance();
    }

    System.out.println(acc2.getName() + " debits $4500.");
    if(acc2.debit(4500) == false)
    {
        System.out.println("The balance is lower !!!");
    }
    else {
        System.out.print(acc2.getName() + "'s balance: $");
        acc2.checkBalance();
    }

    System.out.println(acc3.getName() + " credit $300.");
    acc3.credit(300);
    System.out.print(acc3.getName() + "'s balance: $");
    acc3.checkBalance();

    System.out.println("Change name of the account 4: " + acc4.getName() + "into Quan.");
    acc4.setName("Quan");
    System.out.println("Now, name of the account 4: "+ acc4.getName());

    System.out.println("Change balance for account 5: " + acc5.getBalance() + " into $1000");
    acc5.setBalance(1000);
    System.out.println(acc5.getName() + "'s balance: " + acc5.getBalance());
    }
}

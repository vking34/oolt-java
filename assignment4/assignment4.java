package assignment4;

public class assignment4 {
    public static void main(String[] args)
    {
        Account acc1 = new Account("Vuong", 3000000);

        System.out.println("Account 1 have been created with owner: "+ acc1.getOwner() + " and balance: " + acc1.getBalance() + " VND");

        System.out.println("Trade 1:");
        if(acc1.withdraw(1000000) == true)
        {
            System.out.println("Owner: "+ acc1.getOwner() + " and balance: " + acc1.getBalance() + " VND");
        }
        else
        {
            System.out.println("The amount is greater than the current balance.");
        }

        System.out.println("Trade 2:");
        if(acc1.withdraw(3500,"USD") == true)
        {
            System.out.println("Owner: "+ acc1.getOwner() + " and balance: " + acc1.getBalance() + " VND");
        }
        else
        {
            System.out.println("The amount is greater than the current balance.");
        }

        System.out.println("Trade 3:");
        if( acc1.deposite(6000, "JPY") == true)
        {
            System.out.println("Owner: "+ acc1.getOwner() + " and balance: " + acc1.getBalance() + " VND");
        }
        else
        {
            System.out.println("The amount is greater than the current balance.");
        }

        System.out.println("Trade 4:");
        if(acc1.withdraw(10,"GBP") == true)
        {
            System.out.println("Owner: "+ acc1.getOwner() + " and balance: " + acc1.getBalance() + " VND");
        }
        else
        {
            System.out.println("The amount is greater than the current balance.");
        }

    }
}

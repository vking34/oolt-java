package week6;

public class week6 {
    public static void main(String[] agrs)
    {
        Account acc1 = new Account("Vuong", 3000000);

        System.out.println("Account 1 have been created with owner: "+ acc1.getOwner() + " and balance: " + acc1.getBalance() + " VND");

        acc1.withdraw(1000000);
        System.out.println("Owner: "+ acc1.getOwner() + " and balance: " + acc1.getBalance() + " VND");

        acc1.withdraw(30,"USD");
        System.out.println("Owner: "+ acc1.getOwner() + " and balance: " + acc1.getBalance() + " VND");

        acc1.withdraw(10,"GBP");
        System.out.println("Owner: "+ acc1.getOwner() + " and balance: " + acc1.getBalance() + " VND");

        if(acc1.withdraw(20, "CDS") == false)
        {
            System.out.println("This currency is supported in the Bank");
        }
    }
}

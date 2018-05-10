package week8;


public class week8 {
    public static void main(String[] agrs)
    {

        // Check abstraction
        Date createdDate = new Date(4,4,2018);
        CheckingAccount acc1 = new CheckingAccount("Vuong", 500000);
        System.out.println(acc1.getDetails());

        savingAccount acc2 = new savingAccount("Dung", 6000000, createdDate);
        System.out.println(acc2.getDetails());

        // Check overriding

        acc2.setDate(3,4,2019);
        System.out.println(acc2.getDate().toString()+ ": \nUpdate account " + acc2.getOwner() +  " ...");
        if (acc2.updateBalance())
        {
            System.out.println(acc2.getDetails());
        }
        else {
            System.out.println("Can't update the account !!!");
        }

        acc2.setDate(4,4,2019);

        System.out.println(acc2.getDate().toString()+ ": \nUpdate account " + acc2.getOwner() +  " ...");
        if (acc2.updateBalance())
        {
            System.out.println(acc2.getDetails());
        }
        else {
            System.out.println("Can't update the account !!!");
        }

        System.out.println("Withdraw 100 USD from saving account " + acc2.getOwner() + " ...");
        if(acc2.withdraw(100, "USD"))
        {
            System.out.println(acc2.getDetails());
        }
        else {
            System.out.println("Can't withdraw !!!");
        }

        acc2.setDate(5,4,2019);

        System.out.println(acc2.getDate().toString() + ": \nDeposit 200 GBP to saving account " + acc2.getOwner() + " ...");
        if(acc2.deposit(200, "GBP"))
        {
            System.out.println(acc2.getDetails());
        }
        else {
            System.out.println("Can't deposit !!!");
            System.out.println(acc2.getDetails());
        }

        // CreditAccount test
        Date creadtedDate2 = new Date(4,4,2018);
        CreditAccount acc3 = new CreditAccount("Tu", 2000000, 30000000, 0.06, 0.07, creadtedDate2);
        System.out.println(acc3.getDetails());

        acc3.setDate(4,4,2019);
        System.out.println(acc3.getDate() + ": Update credit account: " + acc3.getOwner() + " ...");
        if(acc3.updateBalance())
        {
            System.out.println(acc3.getDetails());
        }
        else {
            System.out.println("Can't update !!!");
        }

        System.out.println(acc3.getDate() + ": Withdraw 33000000 VND ...");
        if(acc3.withdraw(33000000))
        {
            System.out.println(acc3.getDetails());
        }
        else {
            System.out.println("Can't withdraw !!!");
        }

        System.out.println(acc3.getDate() + ": Withdraw 32000000 VND ...");
        if(acc3.withdraw(32000000))
        {
            System.out.println(acc3.getDetails());
        }
        else {
            System.out.println("Can't withdraw !!!");
        }

        acc3.setDate(4,4,2020);
        System.out.println(acc3.getDate() + ": Update credit account: " + acc3.getOwner() + " ...");
        if(acc3.updateBalance())
        {
            System.out.println(acc3.getDetails());
        }
        else {
            System.out.println("Can't update !!!");
        }

    }
}

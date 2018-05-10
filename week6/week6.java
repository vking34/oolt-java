package week6;
import java.lang.NullPointerException;

public class week6 {
    public static void main(String[] agrs)
    {
        Account acc1 = new Account("Vuong", 3000000);
        Account acc2 = new Account("Tu", 4000000);

        Bank bank = new Bank("BIDV", 6);
        System.out.println("Bank " + bank.getBrand() + " have been created.");

        bank.add(acc1);
        bank.add(acc2);

        bank.printAllAccount();

        System.out.println("Total balance: " + bank.calculateTotalBalance());


    }
}

package assignment3;

public class ass3 {
    public static void main(String[] agrs)
    {
        Account acc1 = new Account();
        Account acc2 = new Account("Vuong", 10);

        System.out.println("Name 1: " + acc1.getOwner());
        System.out.println("Balance 1: "+ acc1.getBalance() + " $");

        System.out.println("Name 2: "+ acc2.getOwner());
        System.out.println("Balance 2: " + acc2.getBalance() + " $");

    }
}

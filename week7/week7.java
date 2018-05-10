package week7;

public class week7 {
    public static void main(String[] args)
    {
        savingAccount acc1 = new savingAccount("vuong", 4000000);
        savingAccount acc2 = new savingAccount("dung", 4000000);

        System.out.println("Account 1: "+acc1.getOwner()+" has balance: " + acc1.getBalance() +" VND with the interest "+ acc1.getInterest() +" %.");
        System.out.println("Update balance for account 1.");
        acc1.updateBalance();
        System.out.println("Account 1: "+acc1.getOwner()+" has balance: " + acc1.getBalance() +" VND.");

        System.out.println("Change the interest into 7%...");
        acc1.setInterest(8);

        System.out.println("Account 2: "+acc2.getOwner()+" has balance: " + acc2.getBalance() +" VND with the interest "+ acc2.getInterest() +" %.");
        System.out.println("Update balance for account 2.");
        acc2.updateBalance();
        System.out.println("Account 2: "+acc2.getOwner()+" has balance: " + acc2.getBalance() +" VND.");

    }
}

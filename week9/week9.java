package week9;

public class week9 {
    public static void main(String[] args){
        Date d1 = new Date(22,4,2018);
        SavingAccount savingAccount = new SavingAccount("Vuong", 3000000, d1);
        CreditAccount creditAccount = new CreditAccount("Tu", 2000000, 30000000, 0.06, 0.07, d1);

        Account acc1;
        Account acc2;
        acc1 = savingAccount;
        System.out.println(acc1.getDetails());

        acc2 = creditAccount;
        System.out.println(acc2.getDetails());

        SavingAccount savingAccount1 = (SavingAccount) acc1;
        CreditAccount creditAccount1 = (CreditAccount) acc2;

        Bank bank = new Bank("BIDV", "26 Ba Trieu");
        bank.addAccount(savingAccount1);
        bank.addAccount(creditAccount1);

        bank.printAllAccounts();
    }
}

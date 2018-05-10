package week9;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private String name;
    private String address;

    public Bank(String n, String addr){
        name = n;
        address = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addAccount(Account acc)
    {
        accounts.add(acc);
    }

    public void printAllAccounts(){
        System.out.println("Bank name: " + name);
        System.out.println("Address: " + address);

        for (Account account : accounts){
            System.out.println(account.getDetails());
        }
    }
}

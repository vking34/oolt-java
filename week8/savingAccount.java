package week8;

public class savingAccount extends Account {

    private static double interest;

    private Date dateCreated = new Date();  // the date that creating a saving account.

    private Date date = new Date(); // for testing

    savingAccount()
    {
        super();

        this.interest = 0.06;
    }

    savingAccount(String owner, double balance, Date d)
    {
        super(owner, balance);
        this.interest = 0.06;
        this.dateCreated = d;
    }

    savingAccount(String owner, double balance, double interest, Date d)
    {
        super(owner, balance);
        this.interest = interest;
        this.dateCreated = d;
    }

    public static double getInterest() {
        return interest*100;
    }

    public static void setInterest(double interest) {
        savingAccount.interest = interest/100;
    }

    public Date getCreatedDate() {
        return dateCreated;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(int d, int m, int y) {
        this.date.setDate(d);
        this.date.setMonth(m);
        this.date.setYear(y);
    }

    public boolean updateBalance()
    {
        if(this.dateCreated.getDate() == date.getDate() && this.dateCreated.getMonth() == date.getMonth())
        {
            super.setBalance(super.getBalance() * (1 + interest));
            return true;
        }
        return false;
    }

    public String getDetails()
    {
        return getOwner() + " having " + getBalance() + " VND in the saving account created in " + dateCreated.toString();
    }

    @Override
    public boolean withdraw(double amount)
    {
        if(this.dateCreated.getDate() == date.getDate() && this.dateCreated.getMonth() == date.getMonth() && this.dateCreated.getYear() != date.getYear())
        {
            if(amount > 0)
            {
                if(amount > super.getBalance())
                {
                    return false;
                }

                this.setBalance(super.getBalance() - amount);
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return  false;
        }
    }

    @Override
    public boolean deposit(double amount)
    {
        if(this.dateCreated.getDate() == date.getDate() && this.dateCreated.getMonth() == date.getMonth() && this.dateCreated.getYear() != date.getYear())
        {
            if(amount <= 0)
            {
                return false;
            }
            super.setBalance(super.getBalance() + amount);
            return true;
        }
        else
        {
            return false;
        }
    }

}

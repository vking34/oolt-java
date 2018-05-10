package week9;

public class CreditAccount extends Account implements HasInterest{
    private double limit;
    private double debitInterest;
    private double creditInterest;
    private Date dateCreated = new Date();
    private Date date = new Date();

    CreditAccount()
    {
        super();
    }

    CreditAccount(String owner, double balance, double limit, double debitInterest, double creditInterest, Date d)
    {
        super(owner, balance);
        this.limit = limit;
        this.debitInterest = debitInterest;
        this.creditInterest = creditInterest;
        this.dateCreated = d;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getDebitInterest() {
        return debitInterest;
    }

    public void setDebitInterest(double debitInterest) {
        this.debitInterest = debitInterest;
    }

    public double getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(double creditInterest) {
        this.creditInterest = creditInterest;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(int d, int m, int y) {
        this.date.setDate(d);
        this.date.setMonth(m);
        this.date.setYear(y);
    }

    @Override
    public String getDetails()
    {
        return super.getOwner() + " having " + super.getBalance() + " VND in the credit account (with the debit interest : " + this.debitInterest + ", the credit interest: " + this.creditInterest + ", limit: " + this.limit + ") created in " + this.dateCreated.toString();
    }

    @Override
    public boolean deposit(double amount)
    {
        if(amount <= 0)
        {
            return false;
        }

        super.setBalance(super.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount)
    {
        if(amount > 0)
        {
            if(super.getBalance() + limit >= amount)
            {
                super.setBalance(super.getBalance() - amount);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;

        }
    }

    @Override
    public boolean updateBalance()
    {
        if(this.dateCreated.getDate() == date.getDate() && this.dateCreated.getMonth() == date.getMonth() && this.dateCreated.getYear() != date.getYear()) {
            if (super.getBalance() > 0) {
                super.setBalance(super.getBalance() * (1 + this.debitInterest));
                return true;
            } else if (super.getBalance() < 0) {
                super.setBalance(super.getBalance() * (1 + this.creditInterest));
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}

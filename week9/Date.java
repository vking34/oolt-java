package week9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {

    private int date;
    private int month;
    private int year;

    Date()
    {
        GregorianCalendar time = new GregorianCalendar();
        this.date = time.get(Calendar.DATE);
        this.month = (time.get(Calendar.MONTH) + 1);
        this.year = time.get(Calendar.YEAR);
    }

    Date(int d, int m, int y)
    {
        this.date = d;
        this.month = m;
        this.year = y;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString()
    {
        String str = String.format("%02d-%02d-%4d", this.getDate(), this.getMonth(), this.getYear());
        return str;
    }
}

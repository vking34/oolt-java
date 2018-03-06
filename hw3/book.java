package hw3;

public class book {

    private String title;
    private String author;
    private int year;

    book()
    {
        title = null;
        year = 2018;
        author = "Unknown";
    }

    book(String name)
    {
        title = name;
        author = "Unknown";
        year = 2018;
    }

    book(String name, int time)
    {
        title = name;
        year = time;
        author = "Unknown";
    }

    book(String name, String person, int time)
    {
        title = name;
        author = person;
        year = time;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getYear()
    {
        return year;
    }

    public void setTitle(String name)
    {
        title = name;
    }

    public void setAuthor(String person)
    {
        author = person;
    }

    public void setYear(int time)
    {
        year = time;
    }

}

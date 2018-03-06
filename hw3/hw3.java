package hw3;

public class hw3 {

    public static void main(String[] args)
    {
        book b1 = new book();
        book b2 = new book("Harry Potter");
        book b3 = new book("Lord of the rings", 1964);
        book b4 = new book("Cooking", "Stephen King", 2005);

        System.out.print("Book 1:\n Title: " + b1.getTitle() + "\n Author: "+ b1.getAuthor() + "\n Year: "+ b1.getYear() + "\n" );
        System.out.print("Book 2:\n Title: " + b2.getTitle() + "\n Author: "+ b2.getAuthor() + "\n Year: "+ b2.getYear() + "\n" );
        System.out.print("Book 3:\n Title: " + b3.getTitle() + "\n Author: "+ b3.getAuthor() + "\n Year: "+ b3.getYear() + "\n" );
        System.out.print("Book 4:\n Title: " + b4.getTitle() + "\n Author: "+ b4.getAuthor() + "\n Year: "+ b4.getYear() + "\n" );

        b1.setTitle("Star Wars");
        System.out.print("Book 1:\n Title: " + b1.getTitle() + "\n Author: "+ b1.getAuthor() + "\n Year: "+ b1.getYear() + "\n" );
    }

}

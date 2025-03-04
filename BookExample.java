
class Book {
    // Declare fields (properties) of the Book class
    String title;
    String author;
    double price;

    // Default constructor to initialize the fields
    public Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }

    // Method to display the details of the book
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }
}

public class BookExample {
    public static void main(String[] args) {
        // Create an object of the Book class using the default constructor
        Book book1 = new Book();

        // Display the details of the book\
        book1.displayDetails();

    }
}
class Book {
    String bookName;
    String author;
    String publisher;
    double price;
    String year;

    // Constructor
    public Book(String name, String author, String publisher, double price, String year) {
        this.bookName = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
    }
}
class BookSales {
    String sellerName;
    String id;
    int numberOfSales;

    public BookSales(String sellerName, String id, int numberOfSales) {
        this.sellerName = sellerName;
        this.id = id;
        this.numberOfSales = numberOfSales;
    }

    public void displayBookSales() {
        System.out.println("Seller Details:");
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Seller ID: " + id);
        System.out.println("Number of Sales: " + numberOfSales);
    }
}
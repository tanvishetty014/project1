public class Book2 {
    public static void main(String[] args) {
        // Creating Book object
        Book b1 = new Book("TS Grewal", "Mr. XYZ", "SM Publications", 1200.0, "2022");
        b1.displayDetails();

        // Creating BookSales object
        BookSales s1 = new BookSales("xyz", "202", 150);
        s1.displayBookSales();
    }
}
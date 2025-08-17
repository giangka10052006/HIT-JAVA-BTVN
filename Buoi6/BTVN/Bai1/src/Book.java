public class Book {
    private static int nextId = 1;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.bookId = nextId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String title, String author, double price) {
        this(title, author,price, new Publisher("Unknown", "Unknown"));
    }

    public void disPlayInfo() {
        System.out.println("ID: " + bookId + ", Title: " + title + " , Author: " + author + ", Price: " + price);
    }

    public void disPlayInfo(boolean showPublisher) {
        disPlayInfo();

        if (showPublisher) {
            System.out.println("    " + publisher.toString());
        }
        else {
            System.out.println("     Publisher: Unkown");
        }
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Book.nextId = nextId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}

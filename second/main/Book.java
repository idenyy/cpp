package second.main;

public class Book extends PrintedEdition {
    private String author;

    public Book(String title, String publisher, int pageCount, String author) {
        super(title, publisher, pageCount);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
    }
}

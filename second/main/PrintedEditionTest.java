package second.main;

public class PrintedEditionTest {
    public static void main(String[] args) {
        PrintedEdition magazine = new Magazine("Tech Times", "Global Publishers", 50, "April 2024");
        PrintedEdition book = new Book("Java for Beginners", "Code Books", 300, "John Smith");
        PrintedEdition textbook = new Textbook("Math 101", "Academic Press", 200, "Jane Doe", "Mathematics");

        System.out.println("Magazine Info:");
        magazine.displayInfo();

        System.out.println("\nBook Info:");
        book.displayInfo();

        System.out.println("\nTextbook Info:");
        textbook.displayInfo();
    }
}

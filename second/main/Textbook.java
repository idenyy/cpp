package second.main;

public class Textbook extends Book {
    private String subject;

    public Textbook(String title, String publisher, int pageCount, String author, String subject) {
        super(title, publisher, pageCount, author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

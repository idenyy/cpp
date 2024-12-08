package second.main;

public class Magazine extends PrintedEdition {
    private String issue;

    public Magazine(String title, String publisher, int pageCount, String issue) {
        super(title, publisher, pageCount);
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue: " + issue);
    }
}

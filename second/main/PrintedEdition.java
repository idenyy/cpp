package second.main;


public class PrintedEdition {
    private String title;
    private String publisher;
    private int pageCount;

    public PrintedEdition(String title, String publisher, int pageCount) {
        this.title = title;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Publisher: " + publisher + ", Pages: " + pageCount);
    }
}

package structural.bridge;

public class PDFFormat implements Format {

    @Override
    public void open(String title) {
        System.out.println("Opening PDF: " + title);
    }

    @Override
    public void read(String title) {
        System.out.println("Reading PDF: " + title);
    }

    @Override
    public void close(String title) {
        System.out.println("Closing PDF: " + title);
    }
}

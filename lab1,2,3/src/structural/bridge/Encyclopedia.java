package structural.bridge;

public class Encyclopedia extends Book {

    private final String title;

    public Encyclopedia(String title, Format format) {
        super(format);
        this.title = title;
    }

    @Override
    public void startReading() {
        System.out.println("Starting encyclopedia: " + title);
        format.open(title);
        format.read(title);
    }

    @Override
    public void stopReading() {
        format.close(title);
        System.out.println("Finished encyclopedia: " + title + "\n");
    }
}

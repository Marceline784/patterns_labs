package structural.bridge;

public class Novel extends Book {

    private final String title;

    public Novel(String title, Format format) {
        super(format);
        this.title = title;
    }

    @Override
    public void startReading() {
        System.out.println("Starting novel: " + title);
        format.open(title);
        format.read(title);
    }

    @Override
    public void stopReading() {
        format.close(title);
        System.out.println("Finished novel: " + title + "\n");
    }
}

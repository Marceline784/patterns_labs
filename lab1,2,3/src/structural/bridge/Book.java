package structural.bridge;

public abstract class Book {
    protected Format format;

    public Book(Format format) {
        this.format = format;
    }

    public abstract void startReading();
    public abstract void stopReading();
}

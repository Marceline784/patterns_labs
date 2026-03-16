package structural.bridge;

public class AudioFormat implements Format {

    @Override
    public void open(String title) {
        System.out.println("Opening audio book: " + title);
    }

    @Override
    public void read(String title) {
        System.out.println("Listening to audio book: " + title);
    }

    @Override
    public void close(String title) {
        System.out.println("Closing audio book: " + title);
    }
}

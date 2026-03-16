package structural.bridge;

public interface Format {
    void open(String title);
    void read(String title);
    void close(String title);
}

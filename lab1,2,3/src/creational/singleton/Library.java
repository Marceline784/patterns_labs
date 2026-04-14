package creational.singleton;

public class Library {

    private static Library instance = null;
    private Library() {}

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public String getBook() {
        return "Harry Potter";
    }

    public String getLibrarian() {
        return "Mrs. Smith";
    }
}

package behavioral.iterator;

public class Book {

    private BookType type;
    private final String name;

    public Book(BookType type, String name) {
        this.setType(type);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public BookType getType() {
        return type;
    }

    public final void setType(BookType type) {
        this.type = type;
    }
}
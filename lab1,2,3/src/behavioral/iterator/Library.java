package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public record Library(List<Book> books) {

    public Iterator<Book> iterator(BookType type) {
        return new LibraryIterator(this, type);
    }

    @Override
    public List<Book> books() {
        return new ArrayList<>(books);
    }
}
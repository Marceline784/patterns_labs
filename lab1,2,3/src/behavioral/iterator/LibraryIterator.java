package behavioral.iterator;

public class LibraryIterator implements Iterator<Book> {

    private final Library library;
    private int idx;
    private final BookType type;

    public LibraryIterator(Library library, BookType type) {
        this.library = library;
        this.type = type;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Book next() {
        idx = findNextIdx();
        if (idx != -1) {
            return library.books().get(idx);
        }
        return null;
    }

    private int findNextIdx() {
        var books = library.books();
        var tempIdx = idx;

        while (true) {
            tempIdx++;

            if (tempIdx >= books.size()) {
                tempIdx = -1;
                break;
            }

            if (type.equals(BookType.ANY) || books.get(tempIdx).getType().equals(type)) {
                break;
            }
        }

        return tempIdx;
    }
}
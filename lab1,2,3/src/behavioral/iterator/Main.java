package behavioral.iterator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Library library = new Library(Arrays.asList(
                new Book(BookType.NOVEL, "Pride and Prejudice"),
                new Book(BookType.DETECTIVE, "Sherlock Holmes"),
                new Book(BookType.FANTASY, "Harry Potter"),
                new Book(BookType.DETECTIVE, "Agatha Christie")
        ));

        System.out.println("All books:");
        printBooks(library.iterator(BookType.ANY));

        System.out.println("\nDetective books:");
        printBooks(library.iterator(BookType.DETECTIVE));
    }

    private static void printBooks(Iterator<Book> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
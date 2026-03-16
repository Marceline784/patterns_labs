package creational.singleton;

public class Main {
    public static void main(String[] args) {

        Library lib1 = Library.getInstance();
        Library lib2 = Library.getInstance();

        System.out.println("Librarian: " + lib1.getLibrarian());
        System.out.println("Book: " + lib2.getBook());

        System.out.println("Are both instances same? " + (lib1 == lib2));
    }
}

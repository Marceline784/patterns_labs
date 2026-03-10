package creational.singleton;

public class Library {

    // єдиний екземпляр
    private static Library instance = null;

    // приватний конструктор
    private Library() {}

    // метод для отримання єдиного екземпляру
    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    // приклад методу бібліотеки
    public String getBook() {
        return "Harry Potter";
    }

    public String getLibrarian() {
        return "Mrs. Smith";
    }
}

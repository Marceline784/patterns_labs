package execute_around;

public class Main {
    public static void main(String[] args) {

        DatabaseResource.use(db -> {
            db.query("SELECT * FROM students");
        });

        System.out.println(); // Для візуального розділення

        DatabaseResource.use(db -> {
            db.query("UPDATE students SET grade = 'A' WHERE name = 'Maria'");
        });
    }
}
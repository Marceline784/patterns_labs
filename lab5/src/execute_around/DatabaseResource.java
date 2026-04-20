package execute_around;

public class DatabaseResource {

    private DatabaseResource() {
        System.out.println("[DB] Відкриття з'єднання з базою даних...");
    }

    private void close() {
        System.out.println("[DB] Закриття з'єднання. Ресурси звільнено.");
    }

    public void query(String sql) {
        System.out.println("[Query] Виконується запит: " + sql);
    }

    public static void use(DatabaseAction action) {
        DatabaseResource resource = new DatabaseResource();
        try {
            action.execute(resource);
        } finally {
            resource.close();
        }
    }
}
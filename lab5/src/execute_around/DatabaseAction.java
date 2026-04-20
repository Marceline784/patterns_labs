package execute_around;

@FunctionalInterface
public interface DatabaseAction {
    void execute(DatabaseResource resource);
}

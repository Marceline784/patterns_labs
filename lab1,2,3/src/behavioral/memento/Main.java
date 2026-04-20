package behavioral.memento;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor("Hello");
        System.out.println("Start: " + editor);

        TextMemento saved = editor.getMemento();

        editor.write(" Anna");
        System.out.println("After write: " + editor);

        editor.deleteLast(1);
        System.out.println("After delete: " + editor);

        editor.setMemento(saved);
        System.out.println("After restore: " + editor);
    }
}
package behavioral.memento;

import behavioral.memento.*;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor("Hello");
        System.out.println(editor);

        // зберігаємо стан
        TextMemento saved = editor.getMemento();

        // змінюємо текст
        editor.write(" World!");
        System.out.println(editor);

        // ще зміни
        editor.deleteLast(6);
        System.out.println(editor);

        // відновлюємо
        editor.setMemento(saved);
        System.out.println(editor);
    }
}

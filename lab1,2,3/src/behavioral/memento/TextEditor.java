package behavioral.memento;

public class TextEditor {

    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public void write(String newText) {
        text += newText;
    }

    public void deleteLast(int count) {
        if (count <= text.length()) {
            text = text.substring(0, text.length() - count);
        }
    }

    public TextMemento getMemento() {
        return new TextMemento(text);
    }

    public void setMemento(TextMemento memento) {
        this.text = memento.getText();
    }

    @Override
    public String toString() {
        return "Text: " + text;
    }
}

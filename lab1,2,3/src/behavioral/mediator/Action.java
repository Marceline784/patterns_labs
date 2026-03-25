package behavioral.mediator;

public enum Action {

    ANSWER("answers the question", "listens carefully"),
    ASK("asks a question", "thinks about the answer"),
    LAUGH("laughs", "smiles"),
    NONE("", "");

    private final String title;
    private final String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return title;
    }
}

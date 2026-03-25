package behavioral.observer;

public enum VideoType {
    VLOG("vlog"),
    TUTORIAL("tutorial"),
    REVIEW("review");

    public final String description;

    VideoType(String description) {
        this.description = description;
    }
}

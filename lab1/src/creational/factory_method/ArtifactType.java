package creational.factory_method;

public enum ArtifactType {
    RING("Ring"),
    STAFF("Staff"),
    AMULET("Amulet"),
    SHIELD("Shield"),
    UNDEFINED("");

    private final String title;

    ArtifactType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

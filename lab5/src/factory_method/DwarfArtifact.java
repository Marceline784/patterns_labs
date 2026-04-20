package factory_method;

public record DwarfArtifact(ArtifactType type) implements Artifact {

    @Override
    public String toString() {
        return "a dwarven " + type;
    }

    @Override
    public ArtifactType artifactType() {
        return type;
    }
}

package factory_method;

public record ElfArtifact(ArtifactType type) implements Artifact {

    @Override
    public String toString() {
        return "an elven " + type;
    }

    @Override
    public ArtifactType artifactType() {
        return type;
    }
}

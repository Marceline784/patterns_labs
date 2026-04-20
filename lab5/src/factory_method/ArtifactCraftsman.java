package factory_method;

@FunctionalInterface
public interface ArtifactCraftsman {
    Artifact manufactureArtifact(ArtifactType type);
}

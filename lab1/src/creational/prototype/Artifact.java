package creational.prototype;

import java.util.Objects;

public class Artifact implements ArtifactPrototype {

    private final String name;
    private final ArtifactType type;
    private final int powerLevel;

    public Artifact(String name, ArtifactType type, int powerLevel) {
        this.name = name;
        this.type = type;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public ArtifactType getType() {
        return type;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    @Override
    public ArtifactPrototype doClone() {
        return new Artifact(name, type, powerLevel);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Artifact artifact = (Artifact) o;
        return powerLevel == artifact.powerLevel &&
                Objects.equals(name, artifact.name) &&
                type == artifact.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, powerLevel);
    }

    @Override
    public String toString() {
        return name + " (" + type + ") Power: " + powerLevel;
    }
}

package creational.factory_method;

import java.util.EnumMap;
import java.util.Map;

public class ElfCraftsman implements ArtifactCraftsman {

    private static final Map<ArtifactType, ElfArtifact> ELF_WORKSHOP;

    static {
        ELF_WORKSHOP = new EnumMap<>(ArtifactType.class);
        for (ArtifactType type : ArtifactType.values()) {
            if (type != ArtifactType.UNDEFINED) {
                ELF_WORKSHOP.put(type, new ElfArtifact(type));
            }
        }
    }

    @Override
    public Artifact manufactureArtifact(ArtifactType type) {
        return ELF_WORKSHOP.get(type);
    }

    @Override
    public String toString() {
        return "Elf Craftsman";
    }
}

package creational.factory_method;

import java.util.EnumMap;
import java.util.Map;

public class DwarfCraftsman implements ArtifactCraftsman {

    private static final Map<ArtifactType, DwarfArtifact> DWARF_WORKSHOP;

    static {
        DWARF_WORKSHOP = new EnumMap<>(ArtifactType.class);
        for (ArtifactType type : ArtifactType.values()) {
            if (type != ArtifactType.UNDEFINED) {
                DWARF_WORKSHOP.put(type, new DwarfArtifact(type));
            }
        }
    }

    @Override
    public Artifact manufactureArtifact(ArtifactType type) {
        return DWARF_WORKSHOP.get(type);
    }

    @Override
    public String toString() {
        return "Dwarf Craftsman";
    }
}

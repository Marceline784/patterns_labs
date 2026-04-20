package factory_method;

public class Main {
    public static void main(String[] args) {
        ArtifactCraftsman elf = ElfArtifact::new;
        ArtifactCraftsman dwarf = DwarfArtifact::new;

        System.out.println("Elf Craftsman");
        System.out.println(elf.manufactureArtifact(ArtifactType.RING));
        System.out.println(elf.manufactureArtifact(ArtifactType.STAFF));

        System.out.println();

        System.out.println("Dwarf Craftsman");
        System.out.println(dwarf.manufactureArtifact(ArtifactType.AMULET));
        System.out.println(dwarf.manufactureArtifact(ArtifactType.SHIELD));
    }
}

package creational.factory_method;

public class Main {

    public static void main(String[] args) {

        ArtifactCraftsman elf = new ElfCraftsman();
        ArtifactCraftsman dwarf = new DwarfCraftsman();

        System.out.println(elf);
        System.out.println(elf.manufactureArtifact(ArtifactType.RING));
        System.out.println(elf.manufactureArtifact(ArtifactType.STAFF));

        System.out.println();

        System.out.println(dwarf);
        System.out.println(dwarf.manufactureArtifact(ArtifactType.AMULET));
        System.out.println(dwarf.manufactureArtifact(ArtifactType.SHIELD));
    }
}

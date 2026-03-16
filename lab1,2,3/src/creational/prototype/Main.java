package creational.prototype;

public class Main {

    public static void main(String[] args) {

        // Оригінальний артефакт
        Artifact ringOfFire = new Artifact("Ring of Fire", ArtifactType.RING, 50);

        // Клон артефакту
        Artifact clonedRing = (Artifact) ringOfFire.doClone();

        System.out.println("Original: " + ringOfFire);
        System.out.println("Clone:    " + clonedRing);

        // Перевіримо, чи об’єкти різні
        System.out.println("Are objects the same? " + (ringOfFire == clonedRing));
        System.out.println("Are objects equal? " + ringOfFire.equals(clonedRing));
    }
}

package behavioral.visitor;

public class FestivalDemo {

    public static void main(String[] args) {

        // Створюємо музикантів
        Musician musician1 = new Musician();
        Musician musician2 = new Musician();

        // Створюємо групу з музикантів
        Band band1 = new Band(musician1, musician2);

        // Створюємо організатора
        Organizer organizer = new Organizer();

        // Створюємо головну сцену (як Unit) з групою та організатором
        Band mainStage = new Band(band1, organizer);

        // Створюємо відвідувачів
        MusicianVisitor visitor1 = new MusicianVisitor();
        BandVisitor visitor2 = new BandVisitor();
        OrganizerVisitor visitor3 = new OrganizerVisitor();

        System.out.println("=== MusicianVisitor ===");
        mainStage.accept(visitor1);

        System.out.println("\n=== BandVisitor ===");
        mainStage.accept(visitor2);

        System.out.println("\n=== OrganizerVisitor ===");
        mainStage.accept(visitor3);
    }
}

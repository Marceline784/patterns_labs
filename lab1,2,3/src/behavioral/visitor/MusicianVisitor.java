package behavioral.visitor;

public class MusicianVisitor implements UnitVisitor {

    @Override
    public void visit(Musician musician) {
        System.out.println("Applauding the " + musician);
    }

    @Override
    public void visit(Band band) {
        System.out.println("Listening to the " + band + " performance.");
    }

    @Override
    public void visit(Organizer organizer) {
        System.out.println("Greeting the " + organizer);
    }
}
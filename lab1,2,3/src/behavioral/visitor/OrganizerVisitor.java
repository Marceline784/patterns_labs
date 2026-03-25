package behavioral.visitor;

public class OrganizerVisitor implements UnitVisitor {

    @Override
    public void visit(Musician musician) {
        System.out.println("Noticing the " + musician + " on stage.");
    }

    @Override
    public void visit(Band band) {
        System.out.println("Checking that the " + band + " is ready.");
    }

    @Override
    public void visit(Organizer organizer) {
        System.out.println("Communicating with " + organizer);
    }
}

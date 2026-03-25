package behavioral.visitor;

public class BandVisitor implements UnitVisitor {

    @Override
    public void visit(Musician musician) {
        System.out.println("Enjoying the " + musician + "'s solo.");
    }

    @Override
    public void visit(Band band) {
        System.out.println("Cheering for the " + band);
    }

    @Override
    public void visit(Organizer organizer) {
        System.out.println("Thanking the " + organizer + " for organizing!");
    }
}

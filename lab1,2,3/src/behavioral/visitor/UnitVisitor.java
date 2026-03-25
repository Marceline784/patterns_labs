package behavioral.visitor;

public interface UnitVisitor {

    void visit(Musician musician);

    void visit(Band band);

    void visit(Organizer organizer);
}

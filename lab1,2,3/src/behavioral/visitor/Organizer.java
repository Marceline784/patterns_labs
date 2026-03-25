package behavioral.visitor;

public class Organizer extends Unit {

    public Organizer(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "organizer";
    }
}

package behavioral.mediator.members;

import behavioral.mediator.Action;
import behavioral.mediator.Classroom;

public abstract class StudentBase implements Student {

    protected Classroom classroom;

    @Override
    public void joinedClass(Classroom classroom) {
        System.out.println(this + " joins the class");
        this.classroom = classroom;
    }

    @Override
    public void classAction(Action action) {
        System.out.println(this + " " + action.getDescription());
    }

    @Override
    public void act(Action action) {
        if (classroom != null) {
            System.out.println(this + " " + action);
            classroom.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}

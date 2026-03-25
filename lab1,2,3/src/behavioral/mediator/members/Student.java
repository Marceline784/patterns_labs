package behavioral.mediator.members;

import behavioral.mediator.Action;
import behavioral.mediator.Classroom;

public interface Student {

    void joinedClass(Classroom classroom);

    void classAction(Action action);

    void act(Action action);
}

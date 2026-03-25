package behavioral.mediator;

import behavioral.mediator.members.Student;

public interface Classroom {

    void addStudent(Student student);

    void act(Student actor, Action action);
}

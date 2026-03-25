package behavioral.mediator;

import behavioral.mediator.*;
import behavioral.mediator.members.*;

public class Main {
    public static void main(String[] args) {

        Classroom classroom = new ClassroomImpl();

        Student s1 = new ExcellentStudent();
        Student s2 = new LazyStudent();
        Student s3 = new FunnyStudent();

        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);

        s1.act(Action.ANSWER);
        s2.act(Action.ASK);
        s3.act(Action.LAUGH);
    }
}

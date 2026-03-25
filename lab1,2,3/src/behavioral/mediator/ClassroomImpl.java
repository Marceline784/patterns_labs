package behavioral.mediator;

import behavioral.mediator.members.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassroomImpl implements Classroom {

    private final List<Student> students;

    public ClassroomImpl() {
        students = new ArrayList<>();
    }

    @Override
    public void act(Student actor, Action action) {
        for (Student student : students) {
            if (!student.equals(actor)) {
                student.classAction(action);
            }
        }
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
        student.joinedClass(this);
    }
}

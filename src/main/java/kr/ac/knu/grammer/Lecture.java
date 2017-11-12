package kr.ac.knu.grammer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rokim on 2017. 5. 25..
 */
public class Lecture {
    private List<Student> students;

    public Lecture() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}

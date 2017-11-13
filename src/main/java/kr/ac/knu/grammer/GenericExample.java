package kr.ac.knu.grammer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rokim on 2017. 11. 13..
 */
public class GenericExample {
    private List students;

    public GenericExample() {
        this.students = new ArrayList();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addObject(Object obj) {
        this.students.add(obj);
    }

    public Student findFirstObject() {
        return (Student) students.get(0);
    }
}

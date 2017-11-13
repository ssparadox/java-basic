package kr.ac.knu.grammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rokim on 2017. 11. 13..
 */
public class CallByReference {
    public List<Student> students;

    public CallByReference() {
        this.students = Arrays.asList(
                new Student("Robin", 100),
                new Student("Rica", 90),
                new Student("Tony", 80));
    }

    public void resetMember() {
        for (Student student : students) {
            student = new Student("", 0);
        }
    }
}

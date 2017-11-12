package kr.ac.knu.grammer;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 5. 26..
 */
public class LectureTest {
    private static Student S1 = new Student("Robin", 10);
    private static Student S2 = new Student("Tony", 8);
    private static Student S3 = new Student("David", 13);
    private static Student S4 = new Student("Sam", 17);

    private static Lecture lecture;

    @BeforeClass
    public static void setUp() throws Exception {
        lecture = new Lecture();

        lecture.addStudent(S1);
        lecture.addStudent(S2);
        lecture.addStudent(S3);
        lecture.addStudent(S4);
    }

    @Test
    public void Call_By_Reference_확인() {
        Student student = lecture.findStudent("Robin");

        assertEquals(student.getPoint(), 10);

        student.setPoint(20);
    }

    @Test
    public void Call_By_Reference_확인2() {
        Student student = lecture.findStudent("Robin");
        assertEquals(student.getPoint(), 10);
    }
}
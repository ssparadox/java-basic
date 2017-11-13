package kr.ac.knu.grammer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 11. 13..
 */
public class GenericExampleTest {
    @Test
    public void test() {
        Student student = new Student("Robin", 100);

        GenericExample genericExample = new GenericExample();
        genericExample.addStudent(student);

        Student firstItem = genericExample.findFirstObject();
        assertEquals(firstItem.getName(), "Robin");
    }
}
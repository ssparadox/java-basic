package kr.ac.knu.grammer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 11. 13..
 */
public class CallByReferenceTest {
    private CallByReference callByReference;

    @Before
    public void init() {
        callByReference = new CallByReference();
    }

    @Test
    public void test() {
        Student first = callByReference.students.get(0);
        assertEquals(100, first.getPoint());
    }
}
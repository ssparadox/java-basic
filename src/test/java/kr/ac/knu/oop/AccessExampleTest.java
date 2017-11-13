package kr.ac.knu.oop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 5. 26..
 */
public class AccessExampleTest {
    private AccessExample accessExample;

    @Before
    public void setUp() throws Exception {
        accessExample = new AccessExample("rokim", "Robin", 21, "Rioter");
    }

    @Test
    public void testAccess() {
        assertEquals(accessExample.name, "Robin");
        assertEquals(accessExample.age, 21);
        assertEquals(accessExample.profile, "Rioter");
    }
}
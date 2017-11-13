package kr.ac.knu.oop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 10. 30..
 */
public class CalculatorTest {
    private ExtendedCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new ExtendedCalculator();
    }

    @Test
    public void test() {
        int i = 10;
        int j = 20;

        int result = calculator.plus(i, j);
        assertEquals(result, 30);
    }

    @Test
    public void test_overload() {
        int i = 10;
        int j = 20;
        int k = 30;

        // TODO overload 는 왜 쓸까?
//        int result = calculator.plus(i, j, k);
//        assertEquals(60, result);
    }

    @Test
    public void test_override() {
        // 화투 끗 계산하기.
        int i = 6;
        int j = 13;


//        int result = calculator.plus(i, j);
//        assertEquals(9, result);

        // TODO override 는 왜 쓸까?
    }

    public class ExtendedCalculator extends Calculator {
    }
}
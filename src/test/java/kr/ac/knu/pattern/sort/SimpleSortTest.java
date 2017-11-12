package kr.ac.knu.pattern.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 11. 12..
 */
public class SimpleSortTest {
    private SimpleSort simpleSort = new SimpleSort();

    @Test
    public void test() {
        List<Integer> list = Arrays.asList(1, 5, 3, 2);
        List<Integer> result = simpleSort.sort(list);

        assertEquals(result.get(0).intValue(), 1);
        assertEquals(result.get(1).intValue(), 2);
        assertEquals(result.get(2).intValue(), 3);
        assertEquals(result.get(3).intValue(), 5);
    }

}
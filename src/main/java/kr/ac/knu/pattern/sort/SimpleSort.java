package kr.ac.knu.pattern.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rokim on 2017. 10. 30..
 */
public class SimpleSort {
    public List<Integer> sort(List<Integer> list) {
        Integer[] items = list.toArray(new Integer[list.size()]);

        for (int i = 0 ; i < items.length ; i++) {
            Integer base = items[i];

            for (int j = i + 1 ; j < items.length ; j++) {
                Integer target = items[j];

                // 오름차순
                if (target < base) {
                    // swap
                    items[i] = target;
                    items[j] = base;

                    base = target;
                }
            }
        }

        return Arrays.asList(items);
    }
}

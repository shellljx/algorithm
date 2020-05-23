package com.licrafter.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by shell on 2020/5/20.
 * <p>
 * Gmail: shellljx@gmail.com
 */
public class TestDemo {


    @Test
    public void mergeSortedArray() {
        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(num1, 3, num2, 3);
        assertArrayEquals(num1, new int[]{1, 2, 2, 3, 5, 6});
    }
}

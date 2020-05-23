package com.licrafter.leetcode;

/**
 * Created by shell on 2020/5/18.
 * <p>
 * Gmail: shellljx@gmail.com
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null) {
            return;
        }
        int newindex = m + n - 1;

        int index1 = m - 1;
        int index2 = n - 1;

        if (index2 < 0 || newindex < 0) {
            return;
        }

        while (index2 >= 0) {
            if (index1 < 0 || nums2[index2] > nums1[index1]) {
                nums1[newindex--] = nums2[index2];
                index2--;
            } else {
                nums1[newindex--] = nums1[index1];
                index1--;
            }
        }
    }
}

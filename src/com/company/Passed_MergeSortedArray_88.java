package com.company;

public class Passed_MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[count];
            count++;
        }

        if(m > 0) {
            for (int i = 0; i < nums1.length - 1; i++) {
                for (int j = i; j < nums1.length; j++) {
                    if (nums1[j] < nums1[i]) {
                        int temp = nums1[i];
                        nums1[i] = nums1[j];
                        nums1[j] = temp;
                    }


                }
            }
        }
    }


}

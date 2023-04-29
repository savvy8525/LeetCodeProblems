package com.company;

import java.util.Arrays;

public class NeedsWork_RotateArray {

    public void rotate(int[] nums, int k) {
        int[] duplicate = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            duplicate[i] = nums[i];
        }

        int index = 0;
        int kDecrease = k;
        if(nums.length > 2) {
            for (int i = 0; i < nums.length; i++) {
                if (i < k) {
                    nums[i] = duplicate[nums.length - kDecrease];
                    kDecrease--;
                } else {
                    nums[i] = duplicate[index];
                    index++;
                }
            }
        }else if (nums.length == 2) {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }

        System.out.println(Arrays.toString(nums));


    }
}





















//    int temp = 0;
//    int[] numsCopy = new int[nums.length];
//    int count = k;
//    int index = 0;
//
//        for(int i = 0; i < nums.length; i++) {
//        numsCopy[i] = nums[i];
//        }
//
//        if(k > 0 && k < nums.length) {
//            if(nums.length - 1 == k) {
//                for(int i = nums.length - 1; i >= 0; i--) {
//                    nums[index] = numsCopy[i];
//                    index++;
//                }
//            }else {
//        for (int i = nums.length - 1; i >= nums.length - 1 - k; i--) {
//        temp = nums[i];
//        nums[i] = numsCopy[count];
//
//        if (count <= k && count > 0) {
//        count--;
//        nums[count] = temp;
//        }
//        }
//        }


//        }

//        if(k >= 0 && k < nums.length) {
//            for(int i = 0; i < nums.length; i++){
//                numsCopy[i] = nums[i];
//            }
//            for(int i = nums.length/2; i < nums.length; i++) {
//                if(i > k - 1 && k - 1 > 0) {
//                    System.out.println(i);
//                    nums[i] = numsCopy[count];
//                    count++;
//                }
//            }
//            count = 0;
//
//            for(int i = nums.length - k; i < nums.length; i++) {
//                nums[count] = numsCopy[i];
//                count++;
//            }
//        }

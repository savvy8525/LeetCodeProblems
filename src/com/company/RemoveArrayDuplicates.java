package com.company;

import java.util.Arrays;

public class RemoveArrayDuplicates {

    public int removeDuplicates(int[] nums) {

//        int[] singleNums = new int[nums.length];
        int count = 1;

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] != nums[i + 1]){
                nums[count] = nums[i + 1];
                count++;
            }

        }
//        for(int i = 1; i < nums.length; i++) {
//
//            if(nums[i - 1] != nums[i]){
//                nums[count] = nums[i];
//                count++;
//            }
//
//        }
//        for(int i = nums.length - 2; i > 0; i--) {
//            System.out.println(nums[i]);
//            if(nums[i] != nums[i-1]){
////                int temp = nums[i];
//                singleNums[count] = nums[i];
//                count++;
//
//            }
//
//        }


        System.out.println(Arrays.toString(nums));

        return count;
    }
}

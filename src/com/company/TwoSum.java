package com.company;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {


        int[] targetIndices = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return targetIndices;

    }

}

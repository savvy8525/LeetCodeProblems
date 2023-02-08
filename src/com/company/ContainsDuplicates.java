package com.company;

public class ContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {
        boolean hasDuplicates = false;
        int num = 0;

        while(num < nums.length) {
            for (int i = num + 1; i < nums.length; i++) {

                if (nums[i] == nums[num]){
                    hasDuplicates = true;
                    break;
                }
            }
            num++;
        }
        return hasDuplicates;
    }
}

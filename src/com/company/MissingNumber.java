package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int missing = -1;
        int numCheck = 0;
        int temp = 0;

        Set<Integer> set = new HashSet<Integer>();


        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] > nums[i]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        while(numCheck != nums.length) {
            if(numCheck != nums[numCheck]) {
                missing = numCheck;
                break;
            }
            numCheck++;
        }

        if(missing == -1) {
            missing = nums.length;
        }
        System.out.println(missing);
        return missing;

    }
}

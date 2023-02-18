package com.company;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> noDuplicates = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(noDuplicates.contains(nums[i])){
                return true;
            }
            noDuplicates.add(nums[i]);
        }
        return false;



//        boolean hasDuplicates = false;
//        int num = 0;
//
//        while(num < nums.length) {
//            for (int i = num + 1; i < nums.length; i++) {
//
//                if (nums[i] == nums[num]){
//                    hasDuplicates = true;
//                    break;
//                }
//            }
//            num++;
//        }
//        return hasDuplicates;
    }
}

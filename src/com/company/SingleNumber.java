package com.company;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int singleNum = -1;
        int countI = 0;



        for (int i = 0; i < nums.length; i++) {
            countI = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    countI++;
                }
            }
            if(countI == 1) {
                return nums[i];
            }
        }


        return 0;
    }
}

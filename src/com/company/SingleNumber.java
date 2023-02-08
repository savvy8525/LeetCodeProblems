package com.company;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        int[] copyNums = new int[nums.length];
        int count = 0;
        int singleNum = 0;

        for(int i = nums.length - 1; i >= 0; i--) {
            copyNums[count] = nums[i];
            count++;
        }

        for(int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
//            if(singleNum )
        }


        return singleNum;

    }

}

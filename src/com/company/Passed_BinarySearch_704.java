package com.company;

public class Passed_BinarySearch_704 {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length;

        int mid = (low + high) / 2;


//        System.out.println(low + high);

        while(low <= high) {
            mid = (low + high) / 2;
            if(target == nums[mid]) {
                return mid;
            }else if(nums[nums.length - 1] < target) {
                return -1;
            }else if(target > nums[mid]) {
                low = mid + 1;
            } else if(target < nums[mid]) {
                high = mid - 1;
            }

        }

        return -1;


    }
}

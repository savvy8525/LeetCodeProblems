package com.company;

public class Passed_SearchInsertPosition_35 {

    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int index = -1;


        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > nums[mid]) {
                start = mid + 1;
                index = mid + 1;

            } else if (target < nums[mid]) {
                end = mid - 1;
                index = mid;
            }else if(nums[mid] == target) {
                return mid;
            }
        }

        return index;
    }
}

package com.company;

public class ProductOfArrayExceptSelf_238 {

    public int[] productExceptSelf(int[] nums) {

        int[] answers = new int[nums.length];
        int total = 1;

        for (int i = 0; i < nums.length; i++) {
//            System.out.println(answers[i]);
            answers[i] = total;
            total *= nums[i];
//            System.out.println(answers[i]);
        }

        total = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println("a" + answers[i]);
            System.out.println("t" + total);
            answers[i] *= total;
            total *= nums[i];
//            System.out.println(total);

        }




//        for (int i = 0; i < nums.length; i++) {
//            total = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if(i != j) {
//                    total *= nums[j];
//                }
//                if(nums.length - 1 == j) {
//                    answers[i] = total;
//                }
//            }
//
//        }


        return answers;
    }

}

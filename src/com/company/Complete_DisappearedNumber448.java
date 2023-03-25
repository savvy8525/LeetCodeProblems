package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Complete_DisappearedNumber448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
// experimenting with hashsets
        HashSet<Integer> removeDuplicates = new HashSet<>();
        List<Integer> disappeared = new ArrayList<>();

        for (int num : nums) {
            removeDuplicates.add(num);
        }

        for (int j = 1; j < nums.length + 1; j++) {
            if(!removeDuplicates.contains(j)) {
                disappeared.add(j);
            }
        }

        return disappeared;
    }
}

//array that passes 32/33 test cases
//    List<Integer> disappeared = new ArrayList<>();
//    int numTracker = 1;
//    boolean isPresent = false;
//
//        for (int i = 0; i < nums.length; i++) {
//        isPresent = false;
//        for (int num : nums) {
//        if (numTracker == num) {
//        isPresent = true;
//        break;
//        }
//        }
//        if(!isPresent) {
//        disappeared.add(numTracker);
//        }
//
//        numTracker++;
//        }
//
//        return disappeared;

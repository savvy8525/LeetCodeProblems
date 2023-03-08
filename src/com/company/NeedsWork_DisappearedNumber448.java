package com.company;

import java.util.ArrayList;
import java.util.List;

public class NeedsWork_DisappearedNumber448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disappeared = new ArrayList<>();
        int numTracker = 1;
        boolean isPresent = false;

        for (int i = 0; i < nums.length; i++) {
            isPresent = false;
            for (int num : nums) {
                if (numTracker == num) {
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent) {
                disappeared.add(numTracker);
            }

            numTracker++;
        }

        return disappeared;
    }
}

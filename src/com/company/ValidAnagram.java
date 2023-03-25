package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.SortedSet;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        if(s.length() > t.length() || t.length() > s.length()) {
            return false;
        } else {

            for (int i = 0; i < sSort.length; i++) {
                if (sSort[i] != tSort[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}

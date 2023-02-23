package com.company;

import java.util.Arrays;

public class NeedsFinishedValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        char temp = ' ';
        for(int i = s.length() - 1; i >= 0; i--) {
            for(int j = s.length() - 1; j >= 0; j--) {
                if(sChar[i] > sChar[j]) {
                    temp = sChar[j];
                    sChar[j] = sChar[i];
                    sChar[i] = temp;
                }

            }
        }
        for(int i = t.length() - 1; i >= 0; i--) {
            for(int j = t.length() - 1; j >= 0; j--) {
                if(tChar[i] > tChar[j]) {
                    temp = tChar[j];
                    tChar[j] = tChar[i];
                    tChar[i] = temp;
                }

            }
        }

        if(Arrays.equals(sChar, tChar)){
            return true;
        }

        return false;

    }
}

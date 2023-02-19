package com.company;

public class NeedsFinishedValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        char temp = ' ';
        for(int i = 1; i < s.length() - 1; i++) {
                if(sChar[i - 1] > sChar[i]) {
                    temp = sChar[i];
                    sChar[i] = sChar[i-1];
                    sChar[i-1] = temp;
            }
        }

        for(int i = 1; i < t.length() - 1; i++) {
            if(tChar[i - 1] > tChar[i]) {
                temp = tChar[i];
                tChar[i] = tChar[i-1];
                tChar[i-1] = temp;
            }
        }

        System.out.println(tChar);
        System.out.println(sChar);

        return false;

    }
}

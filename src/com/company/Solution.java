package com.company;

import java.util.Dictionary;
import java.util.Hashtable;

public class Solution {
    public boolean isIsomorphic(String s, String t) {

        boolean isIso = false;
        Dictionary<Character, Character> s1 = new Hashtable<Character, Character>();
        if(s.length() == t.length()) {
            char[] sChar = s.toCharArray();
            char[] tChar = t.toCharArray();

            for(int i = 0; i < s.length(); i++) {
//                if(s1.get())
                s1.put(sChar[i], tChar[i]);

                System.out.println(s1.get(sChar[i]));
            }



            System.out.println(s1.get('o'));
        }




        return true;
    }
}

package com.company;

public class WantToRework_FirstUniqueChar {

    public int firstUniqChar(String s) {

        char[] sChar = s.toCharArray();
        int increment = sChar.length - 1;
        int count = 0;
        int index = -1;

        //this one needs some work to try to make it faster
        for (int i = 0; i < sChar.length / 2; i++) {
//            System.out.println(i);
            count = -1;
            increment = sChar.length/2;
//            System.out.println(increment);
            for(int j = 0; j < sChar.length / 2; j++) {
//                System.out.println(i +"++++++++++++++++++++");
//                System.out.println(j + "---------------");
                if(sChar[j] == sChar[i]) {
                    count++;
//                    System.out.println(j + "---------------");
//                    System.out.println(count);
                }
                if(sChar[j] == sChar[increment]) {
                    System.out.println(j + "---------------");
//                    System.out.println(sChar[j]);
                    count++;
                    System.out.println(count);
                }
                increment++;
//                System.out.println(increment);
            }

            if(count == 0) {
                index = i;
                break;
            }
        }
        return index;
    }
}

//this one works but is slower
//    public int firstUniqChar(String s) {
//
//        char[] sChar = s.toCharArray();
//        int count = -1;
//        int index = -1;
//
//        for (int i = 0; i < sChar.length; i++) {
//            count = -1;
//            for(int j = 0; j < sChar.length; j++) {
//                if(sChar[j] == sChar[i]) {
//                    count++;
//                }
//            }
//            if(count == 0) {
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }
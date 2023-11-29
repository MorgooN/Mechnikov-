package com.company.problems;

    public class Sheriff {
        static int checkS(String s) {
            int sCount = 0;
            for (int i = 0; i < s.length(); ++i) {
                char sCheck = s.charAt(i);
                if (sCheck == 's') {
                    sCount++;
                }
                System.out.println(sCount);
            }
            return sCount;
        }


    public static void main(String args[]){
        checkS("ussr");
    }
}

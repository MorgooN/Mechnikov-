package com.company.problems;

public class ReversWords {
    public String reverseWords(String s){
        String[] words = s.split("\\s+"); // saving original string with spaces
        StringBuilder reversed = new StringBuilder(); // stringBuilder to append

        for(String word: words){
            StringBuilder r = new StringBuilder(word); //  StringBuilder from original String
            r.reverse(); // reversing string
            reversed.append(r).append(" ");
        }

        return reversed.toString().trim();
    }
    public static void main(String args[]){
        ReversWords s1 = new ReversWords();
        System.out.println(s1.reverseWords("String good"));

    }
}

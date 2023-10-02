package com.company.problems;

import java.awt.*;

public class ColoredPieces {

    boolean winner(String color){
       int aliceScore = 0;
       int bobScore = 0;

       for(int i = 1; i < color.length()-1; ++i){
           char currentColor = color.charAt(i);
           char prevColor = color.charAt(i-1);
           char nextColor = color.charAt(i+1);


           if(currentColor == 'A' & prevColor == 'A' & nextColor == 'A'){
                aliceScore+=1;
           }
           else if(currentColor == 'B' & prevColor == 'B' & nextColor == 'B')
           {
               bobScore+=1;
           }
       }
       return aliceScore > bobScore;
    }

    public static void main(String args[]){
        ColoredPieces cp = new ColoredPieces();
        boolean result = cp.winner("AAABABB");
        System.out.println(result);
    }
}

package com.company.problems;

/*
        If n is less than or equal to 3, return n - 1 as the maximum product (special cases).
        Initialize a variable result to 1.
        While n is greater than 4:
        Multiply result by 3.
        Subtract 3 from n.
        Multiply result by n to get the final result.
        
        O(1) - complexity
 */

public class IntegerBreak {
    static int intBreak(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }

        int result = 1;
        while(n>4){
            result *=3; // 3
            n -=3; // 3
        }
        result *=n;
        return result;
    }

    public static void main(String args[]){
        int res = intBreak(6);
        System.out.println(res);
    }
}

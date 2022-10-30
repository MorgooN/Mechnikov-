package com.company.problems;
import java.util.Arrays;

public class Squares {
    public int[] sortedSquares(int[] nums){
        if(nums == null){
            return nums;
        }

        for(int i =0 ; i < nums.length; ++i){
            nums[i] = (int) Math.pow(nums[i],2);
            System.out.println(" After squaring " + nums[i]);
        }

        boolean swapped = true;
        int j = 0;
        int temp = 0;
        while(swapped){
            swapped = false;
            j++;
            for(int i = 0;i < nums.length-1; ++i){
                    if(nums[i] > nums[i+1]) {
                        temp = nums[i+1];
                        nums[i + 1] = nums[i];
                        nums[i] = temp;
                        swapped = true;
                    }
                    System.out.println(" After sorting squared array " + nums[i]);
            }
        }
        return nums;
    }

    public static void main(String args[]){
        int[] nums = {-4,-1,0,3,10};
        Squares a1 = new Squares();
        System.out.println(Arrays.toString(a1.sortedSquares(nums)));

    }
}

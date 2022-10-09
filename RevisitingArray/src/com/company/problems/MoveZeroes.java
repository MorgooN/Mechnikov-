package com.company.problems;

import java.util.Arrays;

public class MoveZeroes {
        public static void moveZeroes(int[] nums) {
            int temp = 0;
            int j = 0;
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                j++;
                for (int i = 0; i < nums.length - j; ++i) {
                    if (nums[i] == 0) {
                        temp = nums[i + 1];
                        nums[i + 1] = nums[i];
                        nums[i] = temp;
                        swapped = true;
                    }
                }
            }
        }

    public static void main(String args[]){
            
    }
}

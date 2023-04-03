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
                    if (nums[i] % nums[i+1] == 0) {
                        temp = nums[i + 1];
                        nums[i + 1] = nums[i];
                        nums[i] = temp;
                        swapped = true;
                    }
                }
            }
        }

    public static void main(String args[]){
            int[] nums = {3,1,2,4};
                moveZeroes(nums);
                System.out.println(Arrays.toString(nums));
    }
}

package com.company.problems;

import java.util.Arrays;

class SolutionDemo2 {
    public static int[] squareSort(int[] nums){
        for(int i = 0 ; i < nums.length; ++i){
            System.out.println(nums[i]*nums[i]);
            }

        return nums;
        }
    }

    class SolDemo2 {
        public static void main(String args[]) {
            int nums[] = new int[]{-7,-3,2,3,11};
            int temp = 0;
            for (int i = 0; i < nums.length; ++i) {
                nums[i]= nums[i]*nums[i];
            }
            for(int i = 0; i < nums.length; ++i){
                for(int j = i+1; j < nums.length;++j){
                    if(nums[i]>nums[j]) {
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }





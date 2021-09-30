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

    class SolDemo2 extends SolutionDemo2{
    public static void main(String args[]){
        int[] nums = new int[]{-4,-1,0,3,10};
        for(int i = 0; i < nums.length; ++i){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    }


package com.company.problems;
import java.util.Arrays;

class ZeroDup {
    static int removeDuplicates(int[] nums) {
        for(int i = 1; i< nums.length; ++i){
            int element = nums[i];
            if(element == nums[i-1])
                nums[i] = nums[i+1];
        }
        int k[] = nums;
        return k.length;
    }
}

class TestZeroDup {
    public static void main(String args[]){
        int[] ns = {1,1,2};
        ZeroDup.removeDuplicates(ns);
        System.out.println(Arrays.toString(ns));
    }
}

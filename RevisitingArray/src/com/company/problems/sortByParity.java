package com.company.problems;

public class sortByParity {
    public int[] sortByPar(int nums[]){

        boolean swapped = true;
        int j = 0;
        int temp = 0;
        while(swapped){
            swapped = false;
            j++;
            for(int i = 0; i < nums.length-j; ++i){
                if((nums[i]%2)!=0){
                    temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
                System.out.println(nums[i]);
            }
        }
        return nums;
    }
    public static void main(String args[]){
        int[] nums = {3,1,2,4};
        sortByParity sb = new sortByParity();
        sb.sortByPar(nums);
    }
}

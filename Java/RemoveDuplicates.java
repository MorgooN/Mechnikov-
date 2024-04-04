package com.company.problems;

public class RemoveDuplicates {
    public static int[] copyWithRemovedDuplicates(int[] nums){
        // checking for existing
       
        if(nums == null || nums.length == 0){
            return null;
        }

        int uniqueElem =0;

        // counting unique elements
        for(int i =0; i < nums.length; ++i){
            if(i == 0 || nums[i] != nums[i-1]){
                uniqueElem++;
            }
        }
        // creating resulting array and...
        int[] result = new int [uniqueElem];
        int posinAr = 0;

        // ...copying elements into it
        for(int i = 0; i < nums.length; ++i){
            if(i == 0|| nums[i]!=nums[i-1]){
                result[posinAr] = nums[i];
                posinAr++;
            }
        }
        return result;
    }
}

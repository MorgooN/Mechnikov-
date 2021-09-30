package com.company.problems;

     class Solution1 {
    public static int findMaxConsecutiveOnes(int[] nums)
        {
            int cons = 0;
            int consize = 0;
            for(int i =0; i < nums.length;++i){
                if(nums[i] ==1 ) {
                    cons++;
                    if(consize<cons)
                       consize = cons;
                }
                else {
                    cons=0;
                }
        }
            return consize;
    }
}

class SolutionDemo extends Solution1{
    public static void main(String[] args){
        int[] arr1 = new int[]{0,1,1,1,0,0,1,1};    //1,1,0,1,1,1 / 0,1,1,1,0,0,1,1 / 1,0,1,1,0,1 / tested arrays
       System.out.println(findMaxConsecutiveOnes(arr1));
    }
}

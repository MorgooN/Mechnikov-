package com.company.problems;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String args[]){
        int temp = 0;
        int n =3;
       int nums1[] = {1,2,3,0,0,0};
       int nums2[] = {2,5,6};
       System.arraycopy(nums2,0,nums1,3,3);
       for(int i = 0;i< nums1.length;++i) {
           for(int j = i+1; j < nums1.length;++j){
               if(nums1[i]>nums1[j]){
                   temp = nums1[i];
                   nums1[i]=nums1[j];
                   nums1[j]=temp;
               }
           }
       }
       System.out.println(Arrays.toString(nums1));

    }
}

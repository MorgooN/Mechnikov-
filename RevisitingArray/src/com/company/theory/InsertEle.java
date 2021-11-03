package com.company.theory;

public class InsertEle {
    public static void main(String args[]){
        int nums1[] = new int[6];
        int length =0;
        for(int i = 0; i < 3;++i){
            nums1[length] = i;
            ++length;
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.println("Index " + i + " contains " + nums1[i]);
        }
    }
}

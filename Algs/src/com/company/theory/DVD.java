package com.company.theory;


import java.util.Arrays;

public class DVD{
    String name;
    String author;
    int relDate;

    DVD(String name, String author, int relDate){
        this.name = name;
        this.author = author;
        this.relDate = relDate;
    }

    public String toSring(){
        return this.name + " of " + this.author + " was released " + this.relDate;
    }

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

    public static void main(String args[]){
        DVD[] dvdarray = new DVD[2];
        DVD dv1 = new DVD("Stalker" , "Tarkovsky", 1980);
        DVD dv2 = new DVD("LotR","Jeckson", 2001);
        dvdarray[0]=dv2;
        dvdarray[1] = dv1;

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(Arrays.toString(copyWithRemovedDuplicates(nums)));

        for(int i = 0; i < dvdarray.length; ++i){
            System.out.println(dvdarray[i].toSring());
        }

        dv1.toSring();
    }

}

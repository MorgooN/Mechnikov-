package com.company.problems;

public class squaredAr {
  public  int[] squareEven(int ar[], int length){

        if(ar == null){
            return null;
        }
        for(int i = 0;i < length; ++i) {
            System.out.println("element at index " + i +
                    " is" + ar[i]);
            if(ar[i]%2==0){
                ar[i] = (int)Math.pow(ar[i],2);
            }

            System.out.println(" the array after squaring ");
            System.out.println("element at index " + i + "after squaring " +
                    " is " + ar[i]);

        }
        return ar;
    }

    public static void main(String args[]){
        int array[] = {9, -2, -9, 11, 56, -12, -3};
        squaredAr ar1 = new squaredAr();
        ar1.squareEven(array,7);

    }
}

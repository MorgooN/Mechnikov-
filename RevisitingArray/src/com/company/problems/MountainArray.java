package com.company.problems;

public class MountainArray {
        public boolean validMountainArray ( int[] A) {
            int N = A.length;
            int i = 0;

            // mountain array must be at least length of >3
            if(A.length < 3){
                return false;
            }

            if(A[0] > A[1]){
                return false;
            }

            // walk up
            while (i + 1 < N && A[i] < A[i + 1])
                i++;

            // peak can't be first or last
            if (i == 0 || i == N - 1)
                return false;

            // walk down
            while (i + 1 < N && A[i] > A[i + 1])
                i++;

            return i == N - 1;
        }



        public static void main(String args[]){
            int arr[] = {0,3,6,9,6,3,0};
            MountainArray ar = new MountainArray();
            System.out.println(ar.validMountainArray(arr));

        }
    }



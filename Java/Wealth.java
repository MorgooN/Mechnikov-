package com.company.problems;

public class Wealth {
    public int maximumWealth(int[][] accounts){
        int maxWealthSoFar = 0;

        for(int[] customer: accounts){
            int currentCustomerWealth = 0;

            for(int bank: customer){
                currentCustomerWealth +=bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);

        }
        return maxWealthSoFar;
    }

    public static void main(String args[]){
        int[][] akk = new int[][]{
                {7,6},
                {8,9}
        };

        Wealth w1 = new Wealth();
        System.out.println(w1.maximumWealth(akk));
    }
}

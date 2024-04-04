package com.company.problems;
import java.util.*;


public class ThirdMax {
        public int thirdMax(int[] nums) {
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                set.add(nums[i]);
            }

            List<Integer> list=new ArrayList<>(set);
            Collections.sort(list);
            if(list.size()<3){
                return list.get(list.size()-1);
            }
            return list.get(list.size()-3);

    }
    public static void main(String args[]){
            int[] nums = {2,2,3,1};
            ThirdMax tm  = new ThirdMax();
            System.out.println(tm.thirdMax(nums));
    }
}

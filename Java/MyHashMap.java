package com.company.problems;

import java.util.Arrays;
import java.util.*;

public class MyHashMap {
        int[] map = new int[1000001];

        MyHashMap(){
            Arrays.fill(map,-1);
        }

        public void put(int key, int value){
            map[key] = value;
        }

        public int get(int key){
            return map[key];
        }

        public void remove(int key){
            map[key] = -1;
    }
}
/*
Second approach which is more honest
 */

class MyHashMap2{

    ArrayList<Integer> values = new ArrayList<>();
    ArrayList<Integer> keys = new ArrayList<>();

    public void put(int key, int value){
        int i;
        if((i = keys.indexOf(key))!=-1){
            values.set(i, value);
        }
        else{ // if hashmap is empty - fill it
            keys.add(key);
            values.add(value);
        }
    }

    public int get(int key){
        int i;
        if((i = keys.indexOf(key))!=-1) {
            return values.get(i);
        }
            return -1;

    }

    public void remove(int key){
        int i = keys.indexOf(key);
        if(i !=-1){ // if at the end of map then remove
            keys.remove(i);
            values.remove(i);
        }
    }
}

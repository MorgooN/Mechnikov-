package com.company.theory;
import java.util.*;

class MyQueue{
    List<Integer> data;
    int p_pointer;
    // allocating dynamic memory
    MyQueue(){
        data = new ArrayList<Integer>();
        p_pointer = 0;
    }
    // adding new element
    public boolean enQueue(int x){
        data.add(x);
        return true;
    }
    // deleting one element
    public boolean deQueue(){
        if(data.isEmpty() == true){
            return false;
        }
        p_pointer++;
        return true;
    }
    // getting from the head
    int getFront(){
        return data.get(p_pointer);
    }

    public boolean isEmpty(){
        return p_pointer >= data.size();
    }
}

public class Queues {
    public static void main(String args[]){
        MyQueue q1 = new MyQueue();
        q1.enQueue(7);
        q1.enQueue(38);
        q1.enQueue(42);
        // As you can see in the output the structure IS FIFO
        if(!q1.isEmpty()){
            System.out.println(q1.getFront());
        }
        q1.deQueue();
        if(!q1.isEmpty()){
            System.out.println(q1.getFront());
        }
        q1.deQueue();
        if(!q1.isEmpty()){
            System.out.println(q1.getFront());
        }
        q1.deQueue();
        if(!q1.isEmpty()){
            System.out.println(q1.getFront());
        }
        else{
            System.out.println("Queue is empty");
        }
    }
}

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

class MyCircularQueue {

    private int[] data;
    private int head;
    private int tail;
    private int size;


    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }


    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }
        if (isEmpty() == true) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }


    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }


    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[head];
    }


    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[tail];
    }


    public boolean isEmpty() {
        return head == -1;
    }


    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }
}



public class Queues {
    public static void main(String args[]){

        Queue<Integer> q = new LinkedList<>();

        /*
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

         */
    }
}

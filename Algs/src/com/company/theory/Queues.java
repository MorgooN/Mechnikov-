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

class Graph{
    LinkedList<Integer> adj[]; // смежные вершины
    private int V; // вершины

    Graph(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < adj.length;++i){
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int w, int v){adj[v].add(w);} // add edge to the graph

    void BFS(int s){
        LinkedList<Integer> q1 =
                new LinkedList<>();

        boolean visited[] = new boolean[V]; // Mark all the vertices as not visited

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        q1.add(s);

        while(q1.size()!=0){
            s = q1.poll();
            System.out.println(s + " ");
        }

        // Get all adjacent vertices of the dequeued
        // vertex s If adjacent has not been visited,
        // then mark it visited and enqueue it
        Iterator<Integer> i = adj[s].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                visited[n] = true;
                q1.add(n);
            }
        }
    }
}



public class Queues {
    public static void main(String args[]){

        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Breadth First Traversal "
                        + "(starting from vertex 2)");

        g.BFS(2);

        /*
        Queue<Integer> q = new LinkedList<>();
        q.offer(77);
        System.out.println("The 1st element is : " + q.peek());
        q.offer(38);
        System.out.println(q.poll() + " and size is: " + q.size());
        */


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

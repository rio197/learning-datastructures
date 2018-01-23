/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.queue;

/**
 *
 * @author rio197
 */
public class Queue {
    
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long [maxSize];
        this.front = 0;
        this.rear = -1;
        nItems = 0;
    }

    public void insert (long j) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = j;
        nItems++;
    }
    
    public long remove() {
        long temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }        
        nItems--;
        return temp;
    }
    
    public long peekFront() {
        return queueArray[front];
    }
    
    public boolean isEmpty () {
        return (nItems == 0);
    }
    
    public boolean isFull () {
        return (nItems == maxSize);
    }
    
    public void view () {
        System.out.print("[ ");
        for (int i =0; i < queueArray.length; i++){
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("]");
    }
    
    
}

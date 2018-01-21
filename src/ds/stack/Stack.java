/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.stack;

/**
 *
 * @author rio197
 */
public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }
    
    public void push(long j){
        if (this.isFull()) 
            System.out.println("Sorry, the stack is full");
        else {
            top++;
            stackArray[top] = j;
        }
    }
    
    public long pop() {
        if (this.isEmpty()) {
            System.out.println("Sorry, the stack is empty");
            return -1;
        }
        else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
        
    }
    
    public long peak() {
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (maxSize - 1 == top);
    }
    
}

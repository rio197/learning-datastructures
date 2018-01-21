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
        top++;
        stackArray[top] = j;
    }
    
    public long pop(long j) {
        int old_top = top;
        top--;
        return stackArray[old_top];
    }
}

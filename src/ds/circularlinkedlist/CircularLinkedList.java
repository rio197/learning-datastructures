/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.circularlinkedlist;

/**
 *
 * @author rio197
 */
public class CircularLinkedList {
 
    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }
        
    private boolean isEmpty() {
        return (first == null);
    }
    
    public void insertFirst (int data){
        Node newNode = new Node();
        newNode.data = data;
        
        if(isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }
    
    public void insertLast (int data) {
        Node newNode = new Node();
        newNode.data = data;
        
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }
    }
}

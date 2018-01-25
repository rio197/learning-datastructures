/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.doublylinkedlist;

/**
 *
 * @author rio197
 */
public class DoublyLinkedList {
    private Node first;
    private Node last;
    
    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }
    
    public boolean isEmpty() {
        return (first == null);
    }
    
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }        
        
        newNode.next = first;
        this.first = newNode;
    }
    
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
    }
}

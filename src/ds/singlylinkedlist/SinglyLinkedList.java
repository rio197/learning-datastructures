/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.singlylinkedlist;

/**
 *
 * @author rio197
 */
public class SinglyLinkedList {
    
    private Node first;
    private Node last;
    
    public SinglyLinkedList() {
    }
    
    public boolean isEmpty() {
        return (first == null);
    }
    
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty())
            last = newNode;
        newNode.next = first;
        first = newNode;
        if (newNode.next == null)
            last = newNode;
    }
    
    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }
    
    public void displayList() {
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
    
    public void insertLast(int data) {
        /*Node current = first;
        while (current.next != null) {
            current = current.next;
        }*/
        Node newNode = new Node();
        newNode.data = data;
        last.next = newNode; //Warning: this is broken if the list is empty
        last = newNode;
        //current.next = newNode;
    }
}

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
public class App {
    public static void main(String[] args) {
        SinglyLinkedList mylist = new SinglyLinkedList();
        mylist.insertFirst(100);
        mylist.insertFirst(50);
        mylist.insertFirst(99);
        mylist.insertFirst(88);
        
        mylist.displayList();
    }
}

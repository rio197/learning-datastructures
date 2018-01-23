/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.LinkedList;

/**
 *
 * @author rio197
 */
public class App {
    
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 4;
        
        Node nodeB = new Node();
        nodeB.data = 3;
        
        Node nodeC = new Node();
        nodeC.data = 7;
        
        Node nodeD = new Node();
        nodeD.data = 8;
        
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        
        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
    }
    
    public static int listLength(Node aNode) {
        
        int length = 0;
        Node currentNode = aNode;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }
}

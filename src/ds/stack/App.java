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
public class App {

    public static void main(String[] args) {

        System.out.println(reverseString("HELLO"));

    }
     
    public static String reverseString(String str) {
        
        int stackSize = str.length();
        Stack theStack = new Stack(stackSize);
        
        for (int ii = 0; ii < stackSize; ii++ ) {
            char ch = str.charAt(ii);
            theStack.push(ch);
        }
        
        String result = "";
        while(!theStack.isEmpty()) {
            char ch = theStack.pop();
            result = result + ch;
        }
               
        return result;
    }
}

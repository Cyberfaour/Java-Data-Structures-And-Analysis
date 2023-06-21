/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author CLICK ONCE
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SLL<Integer> linkedList = new SLL<>();
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast(4);
        linkedList.addLast(5);

        // // System.out.println("Size: " + linkedList.size()); // Output: 5
        // // System.out.println("First: " + linkedList.first()); // Output: 1
        // // System.out.println("Last: " + linkedList.last()); // Output: 5

        // // linkedList.print(); // Output: 1 --> 2 --> 3 --> 4 --> 5 -->

        // linkedList.removeEvery(); // Removes every second element

        // // linkedList.print(); // Output: 1 --> 3 --> 5 -->

        // linkedList.removeFirst();
        // linkedList.removeLast();

        // // linkedList.print(); // Output: 3 -->

        // System.out.println("Size: " + linkedList.size()); // Output: 1
        // System.out.println("First: " + linkedList.first()); // Output: 3
        // System.out.println("Last: " + linkedList.last()); // Output: 3
        // DLL<Integer> doublyLinkedList = new DLL<>();

        // doublyLinkedList.addFirst(3);
        // doublyLinkedList.addFirst(2);
        // doublyLinkedList.addFirst(1);
        // doublyLinkedList.addLast(4);
        // doublyLinkedList.addLast(5);

        // System.out.println("Size: " + doublyLinkedList.size()); // Output: 5
        // System.out.println("First: " + doublyLinkedList.first()); // Output: 1
        // System.out.println("Last: " + doublyLinkedList.last()); // Output: 5

        // doublyLinkedList.print(); // Output: 1 --> 2 --> 3 --> 4 --> 5 -->

        // doublyLinkedList.removeFirst();
        // doublyLinkedList.removeLast();

        // doublyLinkedList.print(); // Output: 2 --> 3 --> 4 -->

        // System.out.println("Size: " + doublyLinkedList.size()); // Output: 3
        // System.out.println("First: " + doublyLinkedList.first()); // Output: 2
        // System.out.println("Last: " + doublyLinkedList.last()); // Output: 4
        
        CLL<Integer> circularLinkedList = new CLL<>();

        circularLinkedList.addFirst(3);
        circularLinkedList.addFirst(2);
        circularLinkedList.addFirst(1);
        circularLinkedList.addLast(4);
        circularLinkedList.addLast(5);

        System.out.println("Size: " + circularLinkedList.size()); // Output: 5
        System.out.println("First: " + circularLinkedList.first()); // Output: 1
        System.out.println("Last: " + circularLinkedList.last()); // Output: 5

        circularLinkedList.print(); // Output: 1 --> 2 --> 3 --> 4 --> 5 -->

        circularLinkedList.rotate();

        System.out.println("First after rotate: " + circularLinkedList.first()); // Output: 2

        circularLinkedList.removefirst();

        System.out.println("Size: " + circularLinkedList.size()); // Output: 4

        circularLinkedList.print(); // Output: 2 --> 3 --> 4 --> 5 -->
    }
    
}

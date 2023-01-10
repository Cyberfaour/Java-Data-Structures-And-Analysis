/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author Cyberfaour
 */
public class LinkedPositionalList<E>implements PositionList<E> {
    //nested node
    private static class Node<E>implements Position<E>{
        private E element;
        private Node<E> prev;
        private Node<E>next;
        private Node(E e,Node<E>p,Node<E>n){
            element=e;
            prev=p;
            next=n;
        }
        @Override
        public E getElement()throws IllegalStateException{
            if(next==null) throw new IllegalStateException("Position not available");
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> p) {
            this.prev = p;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            this.next = n;
        }
        
    }//end of nested node class
    private Node<E>header;
    private Node<E>trailer;
    private int size=0;

    public LinkedPositionalList() {
        this.header = new Node<E>(null,null,null);
        this.trailer = new Node<E>(null,header,null);
        header.setNext(trailer);
    }
    /** Validates the position and returns it as a node. */
        private Node<E> validate(Position<E> p) throws IllegalArgumentException { 
            if (!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");
            Node<E> node = (Node<E>) p; // safe cast
            if (node.getNext( ) == null) // convention for defunct node
                throw new IllegalArgumentException("p is no longer in the list");
            return node;
}
        
    /** Returns the given node as a Position (or null, if it is a sentinel). */
        private Position<E> position(Node<E> node) {
             if (node == header || node == trailer)
                  return null; // do not expose user to the sentinels
        return node;
 }
    
}

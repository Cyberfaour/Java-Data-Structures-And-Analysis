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
public interface PriorityQueue<K,V>{
    int size();
    boolean isEmpty();
    Entry<K, V> insert(K key,V value) throws IllegalArgumentException;
    Entry<K,V>min();
    Entry<K,V>removeMin();
    
}

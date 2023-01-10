/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

import java.util.Comparator;

/**
 *
 * @author Cyberfaour
 */
public abstract class AbstractPriorityQueue<K,V> implements PriorityQueue<K, V>{
    //nested class of PQEnty implementing the Entry intereface
    protected static class PQEntry<K,V>implements Entry<K,V>{
        private K k;
        private V v;
        public PQEntry(K key,V value){
            k=key;
            v=value;
        }

        @Override
        public K getKey() {
           return k;
        }

        @Override
        public V getValue() {
          return v;
        }
        protected void setKey(K key){
            k=key;
        }
        protected void setValue(V value){
            v=value;
        }
       }
    //instacne of the AbstractPQ 
    /**
     * comparator defining the order of the keys in the priority queue 
     */
    private Comparator<K> comp;
    /**
     * construct an empty PQ using the given comparator to order keys
     */
    protected AbstractPriorityQueue(Comparator<K>c){
        comp=c;
    
    }
    //create an empty PQ based on natural ordering of its keys
    protected AbstractPriorityQueue(){
        this(new DefaultComparator<K>());
    }
    //method for comparing two entries according to key
    protected int compare(Entry<K,V>a,Entry<K,V>b){
        return comp.compare(a.getKey(),b.getKey());
    }
    //determines wether a key is valid
    protected boolean checkKey(K key) throws IllegalArgumentException{
        try{
            return (comp.compare(key, key)==0);
        }catch(ClassCastException ex){
            throw new  IllegalArgumentException("Incompatible key");
        }
        
    }
    @Override
    public boolean isEmpty(){
        return size()==0;
    }
    
    
    
}

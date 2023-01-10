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
public class DefaultComparator<E> implements Comparator<E> {
    @Override
    public int compare(E a,E b)throws ClassCastException{
        return((Comparable<E>)a).compareTo(b);
    }
    
}

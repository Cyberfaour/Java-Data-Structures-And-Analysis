/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Cyberfaour
 * @param <E>
 */
public abstract class AbstractTree<E> implements Tree<E>{
    @Override
    public boolean isInternal(Position<E>p) {return (numChildren(p)>0);}
    @Override
    public boolean isExternal(Position<E>p){return numChildren(p)==0;}
    @Override
    public boolean isRoot(Position<E>p){return p==root();}
    @Override
    public boolean isEmpty(){return size()==0;}
    /** Returns the number of levels separating Position p from the root.
     * @param p
     * @return  */
    public int depth(Position<E>p){
        if(isRoot(p))
            return 0;
        else 
            return 1+depth(parent(p));
    }
    private int heightBad(){ //bad method due to high complexity quadratic notation
        int h=0;
        for(Position<E>p:positons())
            if(isExternal(p))
                h=Math.max(h, depth(p));
        return h;
    }
    public int  height(Position<E>p){ // n complexity 
        int h=0;
        for(Position<E>c:children(p))
            h=Math.max(h, 1+height(c));
        return h;
    }
    
}

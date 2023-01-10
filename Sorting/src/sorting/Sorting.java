/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Comparator;

/**
 *
 * @author Cyberfaour
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]data={43,6,83,11,90,12,55,77};
        insertionSort(data);
        for(int i=0;i<data.length;i++)
            System.out.println(data[i]);
    }
    public static  void insertionSort(int[] data){
        int n=data.length;
        for(int i=1;i<n;i++){
            int temp=data[i];
            int j=i;
            while(j>0 && data[j-1]>temp){
                data[j]=data[j-1];
                j--;
            }
            data[j]=temp;
        }
        
    }
    
    //iterable version of Merge Sort
    public static <K>void merge(K[] S1,K[]S2,K[]S,Comparator<K>comp){
        int i=0,j=0;
        while(i+j<S.length){
            if(j==S2.length||(i<S1.length&&comp.compare(S1[i], S2[j])>0))
                S[i+j]=S1[i++];
            else S[i+j]=S2[j++];
    }
    }
    
}

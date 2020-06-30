/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator;

/**
 *
 * @author quang
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] ar = {2,5,6,7,9,11,13,14,15,17};
        Aggregate arr = new ConcreteAggregate(ar);
        Iterator i = arr.CreateIterator();
        
        System.out.println(i.First());
        System.out.println(i.Next());
        System.out.println(i.Next());
        System.out.println(i.isDone());
        i.Next();
        System.out.println(i.CurrentItem());
        
    }
    
}

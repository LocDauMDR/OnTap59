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
public class ConcreteAggregate extends Aggregate{

    int[] arr;
    
    public ConcreteAggregate(int[] arr) {
        this.arr = arr;
    }
    
    public int Count() {
        return arr.length;
    }
    
    public int getItem(int i) {
         return arr[i];
    }
    
    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }
    
}

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
public class ConcreteIterator extends Iterator{
    ConcreteAggregate t;
    int current;

    public ConcreteIterator(ConcreteAggregate t) {
        this.t = t;
        current = 0;
    }
    
    @Override
    public int First() {
        current = 0;
        return t.getItem(current);
    }

    @Override
    public int Next() {
        if(!isDone()) {
            current += 1;
            return t.getItem(current);
        }
        return First();
    }

    @Override
    public boolean isDone() {
        return (current == t.Count()-1);
    }

    @Override
    public int CurrentItem() {
        return t.getItem(current);
    }
    
}

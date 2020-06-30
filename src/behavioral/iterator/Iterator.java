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
public abstract class Iterator {
    public abstract int First();
    public abstract int Next();
    public abstract boolean isDone();
    public abstract int CurrentItem();
}

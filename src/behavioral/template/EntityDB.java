/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.template;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quang
 * @param <T>
 */
public abstract class EntityDB<T> {

    protected List<T> list;

    public EntityDB() {
        list = new ArrayList<>();
    }
    
    public boolean add(T t){
        int key = getKey(t);
        T destination = findByID(key);
        if(destination != null)
            return false;
        list.add(t);
        return true;
    }
    
    public int update(T t){
        int key = getKey(t);
        T destination = findByID(key);
        if(destination != null){
            int index  = list.indexOf(destination);
            list.set(list.indexOf(index), t);
            return 1;
        }
        return 0;
    }
    
    public int delete(T t){
	int key = getKey(t);
	T destination = findByID(key);
	if(destination != null){
            list.remove(destination);
            return 1;
	}
	return 0;
    }
    
    public int deleteByKey(int id){
        T destination = findByID(id);
        if(destination != null){
            list.remove(destination);
            return 1;
        }
        return 0;
    }
    
    protected abstract T findByID(int id);
    protected abstract int getKey(T t);
}

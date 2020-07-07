/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite2;

/**
 *
 * @author quang
 */
public abstract class AbsKhoa {
    String Ten;
    String path;

    public AbsKhoa(String Ten) {
        this.Ten = Ten;
        this.path = Ten;
    }
    
    public abstract void add(AbsKhoa f);
    public abstract void remove(AbsKhoa f);
    public abstract String gettreefolder();
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite;

/**
 *
 * @author quang
 */
public class File extends AbstractFile{
    
    public File(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile f) { }

    @Override
    public void remove(AbstractFile f) {
        //files.remove(f);
    }

    @Override
    public String getFreeFolder() {
        return name;
    } 
    
}

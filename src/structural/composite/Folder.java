/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quang
 */
public class Folder extends AbstractFile {
    
    List<AbstractFile> files = new ArrayList<>();
    
    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile f) {
        if (files.contains(f))
            return;
        files.add(f);
        f.path = getPath() + "\\" + f.path;
        f.prefix = this.prefix + "   ";
    }

    @Override
    public void remove(AbstractFile f) {
        if (files.contains(f)) {
            files.remove(f);
            return;
        }
        for (AbstractFile folder: files)
            folder.remove(f);
    }

    @Override
    public String getFreeFolder() {
        StringBuilder builder = new StringBuilder();
            builder.append(name);
            for (AbstractFile f: files) {
                builder.append("\n")
                        .append(f.prefix)
                        .append(f.getFreeFolder());
            }
       return builder.toString();
    }
    
}

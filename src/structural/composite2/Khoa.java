/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite2;

import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class Khoa extends AbsKhoa{
    ArrayList<AbsKhoa> ListBM = new ArrayList<>();

    public Khoa(String Ten) {
        super(Ten);
    }

    @Override
    public void add(AbsKhoa f) {
        if(ListBM.contains(f))
            return;
        if(f instanceof BoMon)
        {
             ListBM.add((BoMon)f);
            f.setPath(this.path + "/" + f.path);
        }
        else
            System.out.println("Không thêm được! ");
        return;
    }

    @Override
    public void remove(AbsKhoa f) {
        if(ListBM.contains(f))
        {
            ListBM.remove(f);
            return;
        }
        for(AbsKhoa BoMon: ListBM)
            BoMon.remove(f);
    }

    @Override
    public String gettreefolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(Ten).append(":\n");
        for(AbsKhoa f: ListBM)
        {
            if(f instanceof BoMon)
                builder.append("\n").append(f.gettreefolder());
            else
                builder.append("\n").append(f.gettreefolder());
        }
        return builder.append("\n").toString();
    }
}

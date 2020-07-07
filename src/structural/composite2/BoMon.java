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
public class BoMon extends AbsKhoa{
    ArrayList<AbsKhoa> ListGV = new ArrayList<>();

    public BoMon(String Ten) {
        super(Ten);
    }

    @Override
    public void add(AbsKhoa f) {
        if(ListGV.contains(f))
            return;
        if(f instanceof GiangVien)
        {
            ListGV.add(f);
            f.setPath(this.path + "/" + f.path);
        }
        else
            System.out.println("Không thêm được!");
        return;
    }

    @Override
    public void remove(AbsKhoa f) {
        if(ListGV.contains(f))
        {
            ListGV.remove(f);
            return;
        }
        for(AbsKhoa BoMon: ListGV)
            BoMon.remove(f);
    }

    @Override
    public String gettreefolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(Ten).append(":\n");
        for(AbsKhoa f: ListGV)
        {
            if(f instanceof GiangVien)
                builder.append("\n").append(f.gettreefolder());
            else
                builder.append("\n").append(f.gettreefolder());
        }
        return builder.append("\n").toString();
    }

}

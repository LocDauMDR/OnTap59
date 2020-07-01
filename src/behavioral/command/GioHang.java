/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command;

import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class GioHang {
    ArrayList<Command> gdmhs = new ArrayList<>();
    Store store = new Store();
    
    public void themVaoGioHang(Command gdmh){
        if(gdmhs.indexOf(gdmh)==-1) 
            gdmhs.add(gdmh);
    }
    
    public void xoaGioHang(Command ctgh){
        gdmhs.remove(ctgh);
    }
    
    public void mua() {
        System.out.println("Sản phẩm" + "\t\t" + "Đơn giá");
        for (int i = 0; i < gdmhs.size(); i++) {
            store.muaHang(gdmhs.get(i));
        }
        System.out.println("Tổng: " + store.tongTien(gdmhs));
    }
}

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
public class Store {
    public void muaHang(Command gdmh){
        gdmh.getInfo();
    }
    
    public int tongTien(ArrayList<Command> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getCost();
        }
        return sum;
    }
}

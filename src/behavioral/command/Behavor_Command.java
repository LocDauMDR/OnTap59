/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command;

/**
 *
 * @author quang
 */
public class Behavor_Command {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang gh = new GioHang();
        Command c1 = new ChiTietGioHang("Quần áo", 1, 15000);
        Command c2 = new ChiTietGioHang("Lon sữa", 2, 2400);
        
        gh.themVaoGioHang(c1);
        gh.themVaoGioHang(c2);
        gh.mua();
    }
    
}

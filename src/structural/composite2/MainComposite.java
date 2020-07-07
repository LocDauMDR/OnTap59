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
public class MainComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Khoa CNTT = new Khoa("CNTT");
        BoMon boMon1 = new BoMon("Mạng máy tính");
        BoMon boMon2 = new BoMon("Hệ thống thông tin quản lý");
        BoMon boMon3 = new BoMon("Kĩ thuật phần mềm");
        
        CNTT.add(boMon1);
        CNTT.add(boMon2);
        CNTT.add(boMon3);
        
        GiangVien gv1 = new GiangVien("Hoàng Nam");
        GiangVien gv2 = new GiangVien("Văn Tuấn");
        GiangVien gv3 = new GiangVien("Khắc Huy");
        
        boMon1.add(gv1);
        boMon1.add(gv2);
        boMon2.add(gv3);
        
        System.out.println(gv2.getPath());
        
        System.out.println("\nKiểm tra: ");
        boMon3.add(boMon1);
    }
    
}

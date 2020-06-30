package behavioral.chain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quang
 */
public class ChainMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv1 = new NhanVien("Hoàng", "Trưởng phòng", 2000000);
        NhanVien nv2 = new NhanVien("Quyền", "Giám đốc", 10000000);
        NhanVien nv3 = new NhanVien("Nhân", "Chủ tịch", 20000000);
        
        nv2.setCapTren(nv3);
        nv1.setCapTren(nv2);
        
        System.out.println(nv1.duyetVay(1000000));
    }
    
}

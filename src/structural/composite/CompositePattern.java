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
public class CompositePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFile root = new Folder("Data");
        AbstractFile toan = new Folder("Toan");
        AbstractFile ly = new Folder("Ly");
        AbstractFile hoa = new Folder("Hoa");
        AbstractFile giaiTich = new Folder("GiaiTich");
        AbstractFile toanA = new File("ToanA.pdf");
        AbstractFile daiSo = new Folder("DaiSo");
        AbstractFile daiSoTT = new File("DaiSoTT.pdf");
        
        root.add(toan);
        root.add(ly);
        root.add(hoa);
        toan.add(giaiTich);
        giaiTich.add(toanA);
        toan.add(daiSo);
        daiSo.add(daiSoTT);
        //root.remove(daiSoTT);
        
        System.out.println(root.getFreeFolder());
        System.out.println(giaiTich.getPath());
        System.out.println(daiSoTT.getPath());
    }
    
}

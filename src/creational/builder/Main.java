/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author quang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yy");
        HoaDonHeader hd = new HoaDonHeader("HD01", "Nguyễn Hoàng Nam", d.parse("23/5/2020"));
        CTHD ct1 = new CTHD("OPPO", 1, 5000000, (float) 0.5);
        CTHD ct2 = new CTHD("Xiaomi", 1, 8000000, (float) 0.8);
        CTHD ct3 = new CTHD("SamSung", 1, 10000000, (float) 0.6);
        
        HoaDon hdon = new HoaDon.Builder()
                .addHeader(hd)
                .addCTHD(ct1)
                .addCTHD(ct2)
                .addCTHD(ct3)
                .build();
            System.out.println(hdon.toString());
        }
    
}

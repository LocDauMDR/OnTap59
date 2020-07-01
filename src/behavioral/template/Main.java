/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author quang
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        EntityDB sv = new SinhVienDB();
        EntityDB mh = new MonHocDB();
        SinhVien s1 = new SinhVien(59131345, "Nguyễn Hoàng Nam", d.parse("02/10/1999"), "Khánh Hòa");
        SinhVien s2 = new SinhVien(59134525, "Nguyễn Ngọc Hoa", d.parse("16/05/1999"), "Đắk Lắk");
        MonHoc m3 = new MonHoc(1234, "Mẫu Thiết Kế", 4);
        MonHoc m4 = new MonHoc(3456, "Cơ sở dữ liệu", 3);
        
        System.out.println(sv.add(s1));
        System.out.println(sv.add(s2));
        System.out.println(mh.add(m3));
        System.out.println(mh.add(m4));
//        mh.update(d);
    }
    
}

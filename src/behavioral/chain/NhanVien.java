/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain;

/**
 *
 * @author quang
 */
public class NhanVien {
    String ten, chucVu;
    int hanMucDuyetVay;
    NhanVien capTren;

    public NhanVien(String ten, String chucVu, int hanMucDuyetVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucDuyetVay = hanMucDuyetVay;
    }

    public void setCapTren(NhanVien capTren) {
        this.capTren = capTren;
    }
    
    public String duyetVay(int soTienVay)
    {
        if(soTienVay <= hanMucDuyetVay)
        {
            StringBuilder builder = new StringBuilder();
            builder.append(chucVu).append(" ")
                    .append(ten).append(" ")
                    .append("Duyệt số tiền vay: ")
                    .append(soTienVay);
            return builder.toString();
        }
        else 
            return capTren.duyetVay(soTienVay);
    }
}

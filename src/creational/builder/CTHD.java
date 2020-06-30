/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

/**
 *
 * @author quang
 */
public class CTHD {
    String SP;
    int SoLuong, DonGia;
    float ChietKhau;

    public CTHD() {
    }

    public CTHD(String SP, int SoLuong, int DonGia, float ChietKhau) {
        this.SP = SP;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ChietKhau = ChietKhau;
    }

    public String getSP() {
        return SP;
    }

    public void setSP(String SP) {
        this.SP = SP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public float getChietKhau() {
        return ChietKhau;
    }

    public void setChietKhau(float ChietKhau) {
        this.ChietKhau = ChietKhau;
    }

    @Override
    public String toString() {
        return "Sản phẩm = " + SP + ", Số lượng = " + SoLuong + ", Đơn giá = " + DonGia + ", Chiết khấu = " + ChietKhau + "\n";
    }
}

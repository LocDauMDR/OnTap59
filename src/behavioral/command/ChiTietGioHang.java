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
public class ChiTietGioHang extends Command{
    String sanPham;
    int soLuong;
    int donGia;

    public ChiTietGioHang(String sanPham, int soLuong, int donGia) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getSanPham() {
        return sanPham;
    }

    @Override
    public void getInfo() {
        System.out.println(toString());
    }

    @Override
    public int getCost() {
        return donGia*soLuong;
    }

    @Override
    public String toString() {
        return sanPham + "\t\t" + soLuong + "\t\t" + donGia;
    }
}

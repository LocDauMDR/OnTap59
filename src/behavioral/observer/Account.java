/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer;

/**
 *
 * @author quang
 */
public class Account implements ATM.ATM_Observer{
    int soDu;

    public Account(int soDu) {
        this.soDu = soDu;
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if(this.soDu >= soTienRut) {
            this.soDu -= soTienRut;
            return true;
        }
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, String thongBao) {
        System.out.println("Số tiền rút: " + soTienRut + " VND (" + thongBao + "!)"+ "\n" +
                            "Số dư TK: " + soDu + " VND");
    }
    
    
}

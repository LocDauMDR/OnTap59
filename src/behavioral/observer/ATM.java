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
public class ATM {
    ATM_Observer observer;
    
    public void thietLapTK(ATM_Observer observer)
    {
        this.observer = observer;
    }
    
    private boolean kiemTraTienRut(int soTienRut)
    {
        return observer.kiemTraSoDu(soTienRut);
    }
    
    public void rutTien(int soTien) 
    {
        if(kiemTraTienRut(soTien))
            observer.nhanThongBao(soTien, "Giao dịch thành công");
        else
            observer.nhanThongBao(0, "Không đủ số dư");
    }
    public static interface ATM_Observer
    {
        boolean kiemTraSoDu(int soTienRut);
        void nhanThongBao(int soTienRut, String thongBao);
    }
}

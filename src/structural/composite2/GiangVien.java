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
public class GiangVien extends AbsKhoa{
    public GiangVien(String Ten) {
        super(Ten);
    }
    
    @Override
    public void add(AbsKhoa f) {
    }

    @Override
    public void remove(AbsKhoa f) {
    }

    @Override
    public String gettreefolder() {
        return Ten;
    }
}

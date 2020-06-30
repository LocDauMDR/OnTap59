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
public class Observer_ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account account = new Account(5000000);
        ATM atm = new ATM();
        atm.thietLapTK(account);
        atm.rutTien(500000);
        atm.rutTien(1000000);
        atm.rutTien(5000000);        
    }
    
}

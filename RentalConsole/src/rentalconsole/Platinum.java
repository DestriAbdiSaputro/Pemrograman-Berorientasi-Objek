/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

/**
 *
 * @author Lenovo
 */
public class Platinum extends Member  {
    int diskon = 3;
    int poin;
    int totalSewa;
    int cashback =  10000;
    int bonusPulsa = 5000;
    
    
    public Platinum(DataMember member) {
        super.member = member;
        super.biayaSewa = 45000;
        super.inputPeminjaman();
    }
    
    public void hitung() {
        this.poin = 10 * selisihHari;
        this.totalSewa = this.biayaSewa * this.selisihHari;
        int diskon = this.totalSewa * this.diskon/100;
        this.totalSewa -= diskon;
    }
    
    protected void output() {
        super.output();
        System.out.println("Total Sewa		: " + this.totalSewa);
        System.out.println("Jumlah Poin		: " + this.poin);
        System.out.println("Jumlah Cashback     : " + this.cashback);
        System.out.println("Bonus Pulsa         : " + this.bonusPulsa);
    }
}

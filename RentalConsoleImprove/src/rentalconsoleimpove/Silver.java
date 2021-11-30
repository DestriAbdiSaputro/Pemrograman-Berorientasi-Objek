/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsoleimpove;

/**
 *
 * @author Lenovo
 */
public class Silver extends Member {
    int diskon = 1;
    int poin;
    int totalSewa;
    
    
    public Silver(DataMember member) {
        super.member = member;
        super.biayaSewa = 25000;
        super.inputPeminjaman();
    }
    
    public void hitung() {
        this.poin = 1 * selisihHari;
        this.totalSewa = this.biayaSewa * this.selisihHari;
        int diskon = this.totalSewa * this.diskon/100;
        this.totalSewa -= diskon;
    }
    @Override
    protected void output() {
        super.output();
        System.out.println("Total Sewa		: " + this.totalSewa);
        System.out.println("Jumlah Poin		: " + this.poin);
    }
}
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
public class Silver extends Member {
    int diskon = 1;
    int poin;
    int totalSewa;
    
    
    public Silver(DataMember member) {
        super.member = member;
        super.biayaSewa = 25000;
        super.inputPeminjaman();
    }
    
    public void calculatedServices() {
        this.poin = 1 * banyakHari;
        this.totalSewa = this.biayaSewa * this.banyakHari;
        int diskon = this.totalSewa * this.diskon/100;
        this.totalSewa -= diskon;
    }
    protected void output() {
        super.output();
        System.out.println("Total Sewa		: " + this.totalSewa);
        System.out.println("Jumlah Poin		: " + this.poin);
    }
}
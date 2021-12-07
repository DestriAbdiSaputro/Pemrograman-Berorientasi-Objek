/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author Lenovo
 */
public abstract class hitungPerjalanan {
    public String nama;
    public double jarak, kecepatan;
    protected abstract double bahanBakar();
    
    protected double perkiraanBbm(){
        return this.jarak/this.bahanBakar();
    }
    
    protected double perkiraanWaktu(){
        return this.jarak/this.kecepatan;
    }
    
    public void tampilHasil(){
        System.out.println("Mobil " + this.nama + " menggunakan bahan bakar : " + this.perkiraanBbm() + " liter");
        System.out.println("Waktu perjalanan yang ditempuh mobil " + this.nama + " untuk sampai tujuan yaitu : " + this.perkiraanWaktu() + " jam");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Lenovo
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Luas dan Keliling Persegi Panjang
        System.out.println("Luas dan Keliling Persegi Panjang :");
        PersegiPanjang pp = new PersegiPanjang();
        pp.PPanjang(10,5);
        pp.PPanjang(3.6,8);
        pp.PPanjang(6,8.3);
        pp.PPanjang(5.6,8.8);
        System.out.println("------------------------------------------------------");
        //Luas dan Keliling Persegi
        System.out.println("Luas dan Keliling Persegi :");
        Persegi p = new Persegi();
        p.Persegi(4.5);
        p.Persegi(7);
        System.out.println("------------------------------------------------------");
        //Luas dan Keliling Lingkaran
        System.out.println("Luas dan Keliling Lingkaran :");
        Lingkaran l = new Lingkaran();
        l.Lingkaran(5);
        l.Lingkaran(7.4);
        System.out.println("------------------------------------------------------");
        //Luas dan Keliling Segitiga
        System.out.println("Luas dan Keliling Segitiga :");
        Segitiga s = new Segitiga();
        s.Segitiga(8, 10);
        s.Segitiga(8, 11.5);
        s.Segitiga(12.2, 9);
        s.Segitiga(13.9, 20.7);
    }
    
}

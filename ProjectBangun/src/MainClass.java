/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bangundatar.*;
/**
 *
 * @author Lenovo
 */
public class MainClass {
    public static void main(String[] args){
        Persegi p1 = new Persegi();
        p1.sisi = 10;
        p1.tampilHasil();
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.p = 20;
        pp1.l = 10;
        pp1.tampilHasil();
        
        Lingkaran l1 = new Lingkaran();
        l1.jari = 10;
        l1.tampilHasil();
    }
}

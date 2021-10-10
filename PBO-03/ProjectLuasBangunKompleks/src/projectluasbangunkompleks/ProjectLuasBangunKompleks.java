/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Lenovo
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lingkaran Project1
        Lingkaran lp1 = new Lingkaran();
        lp1.r = 21;
        double luasLingkaran = lp1.hitungLuas()*2;
        
        //Persegi Project 1
        Persegi pp1 = new Persegi();
        pp1.s = 42;
        int luasPersegi = pp1.hitungLuas();
        
        double hasil = luasLingkaran + luasPersegi;
        System.out.println("Luas Bangun Kompleks Project 1 : " + hasil);
        
    }
    
}

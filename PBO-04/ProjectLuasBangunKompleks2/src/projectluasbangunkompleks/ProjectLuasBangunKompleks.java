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
        //Lingkaran Project 2
        Lingkaran lp2 = new Lingkaran();
        lp2.r = 14;
        double luasLingkaran = lp2.hitungLuas()*2;
        
        Lingkaran lp3 = new Lingkaran();
        lp3.r = 7;
        int luasLingkaran2 = lp3.hitungLuas();
        
        double hasil = luasLingkaran + luasLingkaran2;
        System.out.println("Luas Bangun Kompleks Project 1 : " + hasil);
        
    }
    
}

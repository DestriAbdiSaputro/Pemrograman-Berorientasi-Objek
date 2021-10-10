/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author Lenovo
 */
public class ProjectPengubinan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hitung luas setiap ruang
        
        Ruang A = new Ruang();
        A.panjang = 3;
        A.lebar = 3;
        
        Ruang B = new Ruang();
        A.panjang = 5;
        A.lebar = 2;
        
        Ruang C = new Ruang();
        A.panjang = 4;
        A.lebar = 3;
        
        // hitung luas total ruang dalam m2
        int totalLuasRuang = A.hitungLuas() + B.hitungLuas() + C.hitungLuas();
        
        // hitung luas ubin
        Ubin X = new Ubin();
        X.panjang = 40;
        X.lebar = 40;
        
        //nyatakan luas ubin ke m2
        double luasUbin =X.hitungLuas()/100000.;
        
        //hitung jumlah ubin
        double jumlahUbin = totalLuasRuang/luasUbin;
        System.out.println("Banyaknya ubin yang diperlukan: " + jumlahUbin);
    }
    
}

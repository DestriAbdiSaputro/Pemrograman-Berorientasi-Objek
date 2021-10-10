/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Lenovo
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // kegiatan 2
        Operasi k2 = new Operasi();
        
        //menampilkan hasil penjumlahan
        System.out.println("Hasil 3 + 4 : " + k2.jumlahkan(3, 4));
        System.out.println("Hasil 4 + 7 + (-9) : " + k2.jumlahkan(4, 7, -9));
        System.out.println("Hasil 3.4 + (-0.002) + 0.12313 : " + k2.jumlahkan(3.4, -0.002, 0.12313));
        
        //menampilkan hasil perkalian
        System.out.println("Hasil 3 x 4 : " + k2.kalikan(3, 4));
        System.out.println("Hasil 4 x 7 x (-9) : " + k2.kalikan(4, 7, -9));
        System.out.println("Hasil 3.4 x (-0.002) x 0.12313 : " + k2.kalikan(3.4, -0.002, 0.12313));
    }
    
}

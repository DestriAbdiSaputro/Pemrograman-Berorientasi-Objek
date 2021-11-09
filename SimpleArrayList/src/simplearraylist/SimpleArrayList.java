/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        
        PilihanMenu menu = new PilihanMenu ();
        while(i != 5){
            System.out.println("Menu data array list ");
            System.out.println("1. Tambah data");
            System.out.println("2. Cari data");
            System.out.println("3. Hapus data");
            System.out.println("4. Tampilkan semua data");
            System.out.println("5. Keluar");
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.print("Pilih nomor berapa: ");
            i = input.nextInt();
            switch (i) {
                case 1:
                    menu.tambahData();
                    input.nextLine();
                    break;
                case 2:
                    menu.cariData();
                    input.nextLine();
                    break;
                case 3:
                    menu.hapusData();
                    input.nextLine();
                    break;
                case 4:
                    menu.tampilData();
                    break;
                default:
                    break;
            }
        }
    }
}
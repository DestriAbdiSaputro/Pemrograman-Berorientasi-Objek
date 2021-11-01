/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;
/**
 *
 * @author Destri Abdi
 */
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true){
            System.out.println("MENU");
            System.out.println("1. Cek Triple Pythagoras");
            System.out.println("2. Menentukan Sisi Miring Segitiga");
            System.out.println("3. Menentukan Sisi Siku-Siku Segitiga");
            System.out.println("4. Exit");
            Scanner input = new Scanner(System.in);
            System.out.print("Pilih : ");
            int select = input.nextInt();
            
            switch (select){
                case 1:
                    CekTriple cekTriple = new CekTriple();
                    cekTriple.cek();
                    break;
                case 2:
                    SisiMiring miring = new SisiMiring();
                    miring.hasil();
                    break;
                case 3:
                    SisiSiku siku = new SisiSiku();
                    siku.hasil();
                    break;
                case 4:
                    System.out.println("Program Selesai. Terima Kasih..");
                    System.exit(0);
                default:
                    System.out.println("Nomor Menu Tidak Ada!\n");
                    
            }
        }
    }
}

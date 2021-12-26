/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataankaryawan;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class PendataanKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        DataKaryawan data = new DataKaryawan();
        
        while(true) {
            System.out.print("Menu Utama:\n");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            System.out.print("Menu Plilihan   : ");
            int pilih = input.nextInt();
            input.nextLine();
        
            switch (pilih) {
                case 1:
                    data.tambahData();
                    break;
                case 2:
                    data.hapusData();
                    break;
                case 3:
                    System.out.println("=====================================================");
                    System.out.println("DATA PROFILE KARYAWAN");
                    System.out.println("-----------------------------------------------------");
                    data.cariData();
                    break;
                case 4:
                    System.out.println("=====================================================");
                    System.out.println("DATA KARYAWAN");
                    data.lihatData();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Masukan pilihan menu!");
                    break;
            }
        }
    }
}

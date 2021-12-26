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
public class DataKaryawan {
    Scanner input = new Scanner(System.in);
    Setter setter = new Setter();
    OlahData data = new OlahData(); 
   
     public void tambahData(){
         while (true){
             setter.settambahData();
             data.tambahKaryawan(new Karyawan(setter.getKode(), setter.getNama(), setter.getGolongan(), setter.getUsia(), setter.getStatus(), setter.getAnak()));
             System.out.println("-------------");
             System.out.println("1. Kembali ke menu utama");
             System.out.println("2. Tambah data kembali");
             System.out.println("Menu Pilihan    : ");
             int inputan = input.nextInt();
             input.nextLine();
             if (inputan == 1){
                 System.out.println("");
                 break;
             } else {
                 System.out.println("");
             }
         }
     }
     
     public void hapusData(){
         while (true){
            String kode;
            while (true){
                System.out.println("Masukan kode karyawan           : ");
                String inputkode = input.nextLine();
                boolean cek = data.kodeDicari(inputkode);
                if (cek == true){
                    kode = inputkode;
                    break;
                } else {
                    System.out.println("Kode karyawan tidak ditemukan!");
                }
            }
            data.hapusKaryawan(kode);
            System.out.println("-------------");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. Hapus data kembali");
            System.out.println("Menu Pilihan    : ");
            int inputan = input.nextInt();
            input.nextLine();
            if (inputan == 1){
                System.out.println("");
                break;
            } else {
                System.out.println("");
            }
         }
     }
     
     public void cariData(){
         while (true){
            String kode;
            while (true){
                System.out.println("Masukan kode karyawan           : ");
                String inputkode = input.nextLine();
                boolean cek = data.kodeDicari(inputkode);
                if (cek == true){
                    kode = inputkode;
                    break;
                } else {
                    System.out.println("Kode karyawan tidak ditemukan!");
                }
            }
            data.cariKaryawan(kode);
            System.out.println("-------------");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. Cari data lagi");
            System.out.print("Menu Pilihan    : ");
            int inputan = input.nextInt();
            input.nextLine();
            if (inputan == 1){
                System.out.println("");
                break;
            } else {
                System.out.println("");
            }
         }
     }
     
     public void lihatData(){
         while (true){
            data.lihatData();
            System.out.println("-------------");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("Menu Pilihan    : ");
            int inputan = input.nextInt();
            input.nextLine();
            if (inputan == 1){
                System.out.println("");
                break;
            } else {
                System.out.println("");
                break;
            }
         }
     }
}
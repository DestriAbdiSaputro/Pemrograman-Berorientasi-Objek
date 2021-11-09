/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PilihanMenu {
    ArrayList<String> data;

    public PilihanMenu() {
        this.data = new ArrayList<>();
    }
    
    // method tambah
    void tambahData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data string: ");
        data.add(input.next());
        System.out.println("Daftar string dalam array list: "+ data);
        System.out.println("");
    }
    
    void cariData(){
        Scanner input = new Scanner(System.in);
        System.out.print("String yang ingin dicari: ");
        String cari = input.next();
        boolean ans = data.contains(cari);
        if (ans) {
            System.out.println("String "+ cari+ " ada di index ke "+ data.indexOf(cari)+" di dalam data");
        }
        else {
            System.out.println("String "+ cari+ " tidak ada dalam data");
        }
        System.out.println("");
    }
    
    void hapusData(){
        Scanner input = new Scanner(System.in);
        System.out.print("String yang ingin dihapus: ");
        String hapus = input.next();
        boolean ans = data.contains(hapus);
        if (ans) {
            data.remove(data.indexOf(hapus));
            System.out.println("String "+hapus +" sudah dihapus di dalam data");
            System.out.println("Daftar string dalam array list: "+ data);
        }
        else {
            System.out.println("String "+ hapus+ " tidak ada dalam data");
        }
        System.out.println("");
    }
    
    void tampilData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar string dalam array list: "+ data);
        System.out.println("");
    }
}


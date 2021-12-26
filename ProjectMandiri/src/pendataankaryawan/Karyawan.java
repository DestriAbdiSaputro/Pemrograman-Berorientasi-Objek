/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataankaryawan;
import java.time.LocalDate;
/**
 *
 * @author Lenovo
 */
public class Karyawan{
    String Kode, Nama, Alamat, Status;
    LocalDate tglLahir;
    char Golongan;
    int Anak, Usia;
    
    //konstruktor
    public Karyawan (String kode, String nama, char golongan, int usia ,String status, int anak){
        this.Kode = kode;
        this.Nama = nama;
        this.Golongan = golongan;
        this.Usia = usia;
        this.Status = status;
        this.Anak = anak;
    }    
    
    public void print(){
        System.out.println("Kode Karyawan           : "+this.Kode);
        System.out.println("Nama Karyawan           : "+this.Nama);
        System.out.println("Golongan                : "+this.Golongan);
        System.out.println("Usia                    : "+this.Usia);
        System.out.println("Status Menikah          : "+this.Status);
        if (this.Status.equals("Menikah")){
            System.out.println("Jumlah Anak             : "+this.Anak);
        }
    }
    
    public void printTabel(){
        System.out.format("%15s%15s%15s%15s%15s%15s", this.Kode, this.Nama, this.Golongan, this.Usia, this.Status, this.Anak);
        System.out.println("");
    }
}
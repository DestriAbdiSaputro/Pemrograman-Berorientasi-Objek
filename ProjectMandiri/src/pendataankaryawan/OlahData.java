/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataankaryawan;
import golongan.*;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class OlahData {
    ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
    
    public void tambahKaryawan(Karyawan data){
        this.dataKaryawan.add(data);
    }
    
    public boolean kodeDicari(String kode){
        boolean founded = false;
        int index = -1;
        for (int i=0; i<this.dataKaryawan.size();i++){
            if (this.dataKaryawan.get(i).Kode.equals(kode)){
                index = i;
                founded = true;
            }
        }
        return founded;
    }
    
    public void hapusKaryawan(String kode){
        this.dataKaryawan.removeIf(item -> item.Kode.equals(kode));
    }
      
    public void cariKaryawan(String kode){
        boolean ketemu = false;
        int index = -1;
        for (int i = 0; i < this.dataKaryawan.size(); i++){
            if(this.dataKaryawan.get(i).Kode.equals(kode)){
                index = i;
                ketemu = true;
            }
        }
        if (ketemu == true){
            System.out.println("------------------------------------------------------------------");
            this.dataKaryawan.get(index).print();
            //perhitungan gaji
            char gol = this.dataKaryawan.get(index).Golongan;
            String status = this.dataKaryawan.get(index).Status;
            int usia = this.dataKaryawan.get(index).Usia;
            int anak = this.dataKaryawan.get(index).Anak;
            switch (gol) {
                case 'A':
                    A a = new A(status, usia, anak);
                    a.Gaji();
                    break;
                case 'B':
                    B b = new B(status, usia, anak);
                    b.Gaji();
                    break;
                case 'C':
                    C c = new C(status, usia, anak);
                    c.Gaji();
                    break;
            }
        }
    }
    
    public void lihatData(){
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.format("%15s%15s%15s%15s%15s%15s","KODE KARY", "NAMA KARY", "GOL", "USIA", "STATUS NIKAH", "JUMLAH ANAK");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------");
        for(Karyawan item: this.dataKaryawan){
            item.printTabel();
        }
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Jumlah Data: " + this.dataKaryawan.size());
        
    }
}
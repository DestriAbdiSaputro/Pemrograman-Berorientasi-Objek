/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsoleimpove;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Lenovo
 */
public class Member {
    public DataMember member;
    protected int biayaSewa; 
    protected LocalDate tglPinjam;
    protected LocalDate tglKembali;
    protected int selisihHari;
    ArrayList<DataMember> dataMember = new ArrayList<>();
    
    public void tambahMember(DataMember data) {
        this.dataMember.add(data);
    }
    
    void setMember(String id){
        boolean finded = false;
        int index = -1;
        for(int i=0; i<this.dataMember.size(); i++){
            if (this.dataMember.get(i).getid().equals(id)){
                index = i;
                finded = true;
            }
        }
         
        if (finded == true){
            this.member = this.dataMember.get(index);
        } else {
            System.out.println("Data member tidak ditemukan");
            System.exit(0);
            
        }
    }
    
    public DataMember inputMember() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member                  : ");
        this.setMember(input.nextLine());
        
        return this.member;
    }
    
    void inputPeminjaman() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Pinjam (1-31)      : ");
        int tglPinjam = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam (1-12)        : ");
        int blnPinjam = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam               : ");
        int thnPinjam = input.nextInt();
        System.out.print("Masukkan Tanggal Kembali (1-31)     : ");
        int tglKembali = input.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12)       : ");
        int blnKembali = input.nextInt();
        System.out.print("Masukkan Tahun Kembali              : ");
        int thnKembali = input.nextInt();
        this.tglPinjam = LocalDate.of(thnPinjam, blnPinjam, tglPinjam);
        this.tglKembali = LocalDate.of(thnKembali, blnKembali, tglKembali);
        
        this.selisihHari = (int) ChronoUnit.DAYS.between(this.tglPinjam, this.tglKembali);
        System.out.println();
        if(this.selisihHari < 0) {
            System.out.println("Tanggal Pinjam Salah!");
            System.exit(0);
        }
    }
    
    protected void output() {
        this.member.print();
        System.out.println("Tanggal Pinjam      : " + this.tglPinjam);
        System.out.println("Tanggal Kembali     : " + this.tglKembali);
        System.out.println("Lama Sewa           : " + this.selisihHari + " hari");
        System.out.println();
    }
}
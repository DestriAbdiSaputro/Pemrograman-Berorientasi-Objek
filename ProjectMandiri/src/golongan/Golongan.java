/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golongan;

/**
 *
 * @author Lenovo
 */
public abstract class Golongan {
    double gjPokok, tjMenikah, tjPegawai, tjAnak, gjKotor, potongan, gjBersih;
    String status;
    int usia, anak;
    
    public Golongan(String status, int usia, int anak){
        this.status = status;
        this.usia   = usia;
        this.anak   = anak;
    }
    
    protected abstract double gajiPokok();
    
    protected double tunjanganMenikah(){
        return this.tjMenikah = (10./100.) * this.gjPokok;
    }
    
    protected double tunjanganPegawai(){
        return this.tjPegawai = (15./100.) * this.gjPokok;
    }
    
    protected double tunjanganAnak(){
        return this.tjAnak = (5./100.) * this.gjPokok * this.anak;
    }
    
    protected double gajiKotor(){
        return this.gjKotor = this.gjPokok + this.tjMenikah + this.tjPegawai + this.tjAnak;
    }
    
    protected double potongan(){
        return this.potongan = (2.5/100.) * this.gjKotor;
    }
    
    protected double gajiBersih(){
        return this.gjBersih = this.gjKotor - this.potongan;
    }
    
    public void Gaji(){
        System.out.println("Gaji Pokok              : Rp "+this.gajiPokok());
        if(this.status.equals("Menikah")){
            System.out.println("Tunjangan Istr/Suami    : Rp "+this.tunjanganMenikah());
        } else {
            this.tjMenikah = 0;
        }
        if(this.usia > 30){
            System.out.println("Tunjangan Pegawai       : Rp "+this.tunjanganPegawai());
        }else {
            this.tjPegawai = 0;
        }
        if (this.status.equals("Menikah") && this.anak > 0){
            System.out.println("Tunjangan Anak          : Rp "+this.tunjanganAnak());
        } else {
            this.tjAnak = 0;
        }
        System.out.println("---------------------------------------------------- +");
        System.out.println("Gaji Kotor              : Rp "+this.gajiKotor());
        System.out.println("Potongan                : Rp "+this.potongan());
        System.out.println("---------------------------------------------------- -");
        System.out.println("Gaji Bersih             : Rp "+this.gajiBersih());   
    }   
}

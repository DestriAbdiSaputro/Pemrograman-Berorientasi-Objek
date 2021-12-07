/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Lenovo
 */
public class Lingkaran extends BangunDatar {
    public double jari;
    
    @Override
    public double hitungLuas(){
        return Math.PI * this.jari*this.jari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*Math.PI*this.jari;
    }
}

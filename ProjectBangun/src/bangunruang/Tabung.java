/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Lenovo
 */
public class Tabung extends BangunRuang {
    public double jari;
    public double tinggi;
    
    @Override
    public double hitungVolume(){
        return Math.PI*this.jari*this.jari*this.tinggi;
    }
    
    @Override
    public double hitungLuas(){
        return 2*Math.PI*this.jari*this.jari;
    }
}

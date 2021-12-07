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
public class Balok extends BangunRuang {
    public double p;
    public double l;
    public double t;
    
    @Override
    public double hitungVolume(){
        return this.p*this.l*this.t;
    }
    
    @Override
    public double hitungLuas(){
        return 2*this.p*this.l + 2*this.l*this.t + 2*this.p*this.t;
    }
}

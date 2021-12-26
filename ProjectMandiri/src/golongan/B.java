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
public class B extends Golongan {
    
    public B(String status, int usia, int anak) {
        super(status, usia, anak);
    }
    @Override
    protected double gajiPokok(){
        return this.gjPokok = 7000000.;
    } 
}

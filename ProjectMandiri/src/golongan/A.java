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
public class A extends Golongan {

    public A(String status, int usia, int anak) {
        super(status, usia, anak);
    }
    @Override
    protected double gajiPokok(){
        return this.gjPokok = 5000000.;
    }
}

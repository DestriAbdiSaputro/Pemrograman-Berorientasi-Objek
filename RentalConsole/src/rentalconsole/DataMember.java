/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

/**
 *
 * @author Lenovo
 */
public class DataMember {
    String id;
    String nama;
    String jenis;
    
    public DataMember(String id, String nama, String jenis) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
    }
    
    void print() {
        System.out.println("ID Member       : " + this.id);
        System.out.println("Nama Member     : " + this.nama);
        System.out.println("Jenis Member    : " + this.jenis);
        System.out.println();
    }
}

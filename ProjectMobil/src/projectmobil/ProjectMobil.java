/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmobil;
import mobil.*;
/**
 *
 * @author Lenovo
 */
public class ProjectMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("                                 Solo - Kudus");
        System.out.println("                              ------------------");
        Sedan A = new Sedan();
        A.nama = "A";
        A.jarak = 108;
        A.kecepatan = 60;
        A.tampilHasil();
        System.out.println("");
        System.out.println("                                Solo - Jakarta");
        System.out.println("                              ------------------");
        Sedan B = new Sedan();
        B.nama = "B";
        B.jarak = 536;
        B.kecepatan = 65;
        B.tampilHasil();
        System.out.println("");
        System.out.println("                                 Solo - Banten");
        System.out.println("                              -------------------");
        SUV C = new SUV();
        C.nama = "C";
        C.jarak = 659;
        C.kecepatan = 57;
        C.tampilHasil();
        System.out.println("");
        System.out.println("                                Solo - Bandung");
        System.out.println("                              ------------------");
        SUV D = new SUV();
        D.nama = "D";
        D.jarak = 530;
        D.kecepatan = 62;
        D.tampilHasil();
        System.out.println("");
        System.out.println("                               Solo - Banyuwangi");
        System.out.println("                              -------------------");
        MPV E = new MPV();
        E.nama = "E";
        E.jarak = 539;
        E.kecepatan = 64;
        E.tampilHasil();
        System.out.println("");
        System.out.println("                                 Solo - Jember");
        System.out.println("                              -------------------");
        MPV F = new MPV();
        F.nama = "F";
        F.jarak = 431;
        F.kecepatan = 53;
        F.tampilHasil();
    }
    
}

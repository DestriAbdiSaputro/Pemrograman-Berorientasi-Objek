/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bangunruang.*;
/**
 *
 * @author Lenovo
 */
public class MainClassRuang {
    public static void main(String[] args){
        Tabung t1 = new Tabung();
        t1.jari = 10;
        t1.tinggi = 5;
        t1.tampilHasil();
        
        Balok bk1 = new Balok();
        bk1.p = 20;
        bk1.l = 10;
        bk1.t = 5;
        bk1.tampilHasil();
        
        Bola bl1 = new Bola();
        bl1.jari = 10;
        bl1.tampilHasil();
    }
}

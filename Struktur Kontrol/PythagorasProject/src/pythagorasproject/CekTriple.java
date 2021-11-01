/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;
/**
 *
 * @author Destri Abdi
 */
public class CekTriple {
    void cek(){
        System.out.println("Cek Triple Pythagoras");
        System.out.println("Masukan Angka : ");
        Scanner input = new Scanner(System.in);
        System.out.print("A : ");
        double a = input.nextDouble();
        System.out.print("B : ");
        double b = input.nextDouble();
        System.out.print("C : ");
        double c = input.nextDouble();
        if (Math.sqrt((a*a) + (b*b)) % (c) == 0){
            System.out.println("\nTriple Pythagoras\n");
        }
        else {
            System.out.println("\nBukan Triple Pythagoras\n");
        }
    }
}
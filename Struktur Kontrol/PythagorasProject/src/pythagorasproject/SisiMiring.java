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
public class SisiMiring {
    void hasil(){
        System.out.println("Menghitung Sisi Miring Segitiga");
        System.out.println("Masukan Angka : ");
        Scanner input = new Scanner(System.in);
        System.out.print("A : ");
        double a = input.nextDouble();
        System.out.print("B : ");
        double b = input.nextDouble();
        double c = Math.sqrt((a*a) + (b*b));
        System.out.println("\nnilai C : "+ c +"\n");
    }
}
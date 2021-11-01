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
public class SisiSiku {
    void hasil(){
        System.out.println("Menghitung Sisi Siku-Siku Segitiga");
        System.out.println("Masukan");
        Scanner input = new Scanner(System.in);
        System.out.print("A : ");
        double a = input.nextDouble();
        System.out.print("C : ");
        double c = input.nextDouble();
        if (a < c){
            double b = Math.sqrt((c*c) - (a*a));
            System.out.println("\nnilai B : "+ b + "\n");
        } else if (a > c){
            double b = Math.sqrt((a*a) - (c*c));
            System.out.println("\nnilai B : "+ b + "\n");
        }
    }
}

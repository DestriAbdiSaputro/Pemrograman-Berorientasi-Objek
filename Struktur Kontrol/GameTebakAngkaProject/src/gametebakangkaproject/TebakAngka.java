/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.Scanner;
/**
 *
 * @author Destri Abdi
 */
public class TebakAngka {
    static int random;
    TebakAngka (int random){
        random = random;
    }
    void tebak(){
        Scanner masukan = new Scanner(System.in);
        while (true){
            System.out.print("Masukan Tebakan Anda: ");
            int tebak = masukan.nextInt();
            
            if (tebak == random) {
                System.out.println("\nYeeee... Bilangan tebakan anda BENAR :-)");
                break;
            }
            else if (tebak > random && tebak <= 100) {
                System.out.println("\nHehehe. Bilangan tebakan anda terlalu besar\n");
            }
            else if (tebak < random && tebak >= 0 ) {
                System.out.println("\nHehehe. Bilangan tebakan anda terlalu kecil\n");
            }
            else if (tebak < 0 || tebak > 100){
                System.out.println("\nBilangan random antara 0 s/d 100.\n");
            }
        }
    }
}

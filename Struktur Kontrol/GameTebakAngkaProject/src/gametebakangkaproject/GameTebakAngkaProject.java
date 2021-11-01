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
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BilRandom rn = new BilRandom();
        int random = rn.random();
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100.\nSilahkan tebak ya!\n");
        TebakAngka start = new TebakAngka(random);
        start.tebak();
    }
    
}

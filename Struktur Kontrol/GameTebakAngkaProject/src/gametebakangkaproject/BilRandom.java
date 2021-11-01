/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.Random;
/**
 *
 * @author Destri Abdi
 */
public class BilRandom {
    int random(){
        Random rn = new Random();
        int range = 100 - 0 + 1;
        int random = rn.nextInt(range) + 0;
        return random;
    }
}

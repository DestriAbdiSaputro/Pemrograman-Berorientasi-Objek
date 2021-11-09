/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Rerata {
    // data
    int[] dataBil = new int[100];
    
    // jumlah data
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Masukkan bil ke-"+(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }

    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    void output(){
        System.out.println("Rerata: "+ this.hitungRerata(this.dataBil));
    }
}

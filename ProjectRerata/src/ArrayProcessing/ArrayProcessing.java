/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayProcessing;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ArrayProcessing {
    int[] data = new int[100];
    int n;
    int max;
    int min;
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya bilangan : ");
        this.n = input.nextInt();
        for(int i=0; i < n; i++){
            System.out.println("Masukkan bilangan ke "+ (i+1)+" :");
            this.data[i] = input.nextInt();
        }
    }
    int cariMax(){
        this.max = this.data[0];
        for (int j=0; j<this.n; j++){
            if(data[j] >= max){
                max = data[j];
            }
        }
        return max;
    }
    int cariMin(){
        this.min = this.data[0];
        for (int k=0; k<this.n; k++){
            if(data[k] <= min){
                min = data[k];
            }
        }
        return min;
    }
    int[] urutkan() {
        int[] urut = this.data;
        for (int i = 0; i <this.n; i++) {
            for (int j = 0; j < this.n-i-1; j++) {
                if (urut[j] > urut[j+1]) {
                    int baru = urut[j];
                    urut[j] = urut[j+1];
                    urut[j+1] = baru;
                }
            }
        }
        
        return urut;
    }
    
    void output() { 
        System.out.println("Nilai maximum dari data array : "+ this.cariMax());
        System.out.println("Nilai minimum dari data array : "+ this.cariMin());
        int[] urut = this.urutkan();
        System.out.print("Urutan Ascending:");
        for (int i=0; i<this.n; i++) {
            System.out.print(urut[i] + " ");
        }
        System.out.println();
    }
}
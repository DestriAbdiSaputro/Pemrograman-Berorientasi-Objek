/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Lenovo
 */
public class Segitiga {
    static double Miring(double a, double b){
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
    void Segitiga(int a, int t){
        double luas;
        double keliling;
        double s = Miring(a, t);
        luas = a*t/2;
        keliling = a + t + s;
        System.out.println("Luas Segitiga : "+luas);
        System.out.println("Keliling Segitiga : "+keliling);
    }
    
    void Segitiga(double a, int t){
        double luas;
        double keliling;
        double s = Miring(a, t);
        luas = a*t/2;
        keliling = a + t + s;
        System.out.println("Luas Segitiga : "+luas);
        System.out.println("Keliling Segitiga : "+keliling);
    }
    
    void Segitiga(int a, double t){
        double luas;
        double keliling;
        double s = Miring(a, t);
        luas = a*t/2;
        keliling = a + t + s;
        System.out.println("Luas Segitiga : "+luas);
        System.out.println("Keliling Segitiga : "+keliling);
    }
    
    void Segitiga(double a, double t){
        double luas;
        double keliling;
        double s = Miring(a, t);
        luas = a*t/2;
        keliling = a + t + s;
        System.out.println("Luas Segitiga : "+luas);
        System.out.println("Keliling Segitiga : "+keliling);
    }
}

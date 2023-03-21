/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2_a1;

/**
 *
 * @author polri
 */
public class ProvaMetodes {
    public static void main(String[] args) {
        double a = 3;
        double b = 5;
        double c = muti(a,b);
        
        System.out.printf("La mutiplicació de %.1f i %.1f és %.1f\n",a,b,c);
        
        int d = 1;
        int e = 3;
        int f = 14;
        int maxim = maxima(d,e,f);
        
        System.out.println(maxim);
    }
    public static double muti(double x, double y) {
        return x*y;
    }
        public static int suma(int x, int y) {
        return x+y;
    }
        public static int maxima(int x, int y, int z){
            if (x>y&&x>z) {
                return x;
            } else if (y>x&&y>z){
                return y;
            } else{
                return z;
            }
            
        
        }
}

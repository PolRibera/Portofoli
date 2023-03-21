/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uf2_a1;
import java.util.Scanner;


/**
 *
 * @author polri
 */


public class Ex_Temperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        num = sc.nextInt();
        double[] temperatures = new double [num];
        for (int i = 0; i < num; i++) {
            temperatures[i] = sc.nextDouble();
        }
        ordenaSeleccio(temperatures);
    }
    static void ordenaSeleccio(double[] temperatures) {
    int pasades = 0;
    for (int i = 0; i < temperatures.length; i++) {
        for (int j = i + 1; j < temperatures.length; j++) {
            if (temperatures[j] < temperatures[i]) {
                double aux = temperatures[i];
                temperatures[i] = temperatures[j];
                temperatures[j] = aux;
            }
            pasades++;
        }
    }
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i]+" ");
            
        }
        System.out.println(" ");
        System.out.println("Total passades: "+pasades);
    }
}
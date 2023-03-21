/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2_a1;

/**
 *
 * @author polri
 */
import java.util.Scanner;

public class Ex05_GeneraPrimers {
   public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        int contadorprimer=0;
        int total = sc.nextInt();
        int [] primers = new int[total];
        for (int i = 2; contadorprimer < total; i++) {
            if (esNombrePrimer(i)) {
                primers[contadorprimer]=i;
                contadorprimer++;
            }
        }
        mostrarVector(primers);
     
    }
    
    static boolean esNombrePrimer(int nombre){
            boolean esprimer = true;
            for (int i = 2; i <nombre && esprimer== true; i++) {
                if (nombre %i==0) {
                    esprimer=false;
                }
            }
            return esprimer;
    }
    
    static void mostrarVector(int[] primers){
        int contador = 0;
        for (int i = 0; i < primers.length; i++) {
                if (contador >= 10) {
                    System.out.println("");
                    contador =0;
                }
                if (i==primers.length-1) {
                    System.out.print(" "+primers[i]+".");
                } else if (contador ==0){
                    System.out.print(primers[i]+",");
                   contador++;
                } else {
                System.out.print(" "+primers[i]+",");
                contador++;
                }

            
        }
    }
}


    



    
    



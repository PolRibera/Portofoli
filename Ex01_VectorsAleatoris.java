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
 
public class Ex01_VectorsAleatoris {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;

       
        num1 = sc.nextInt();

        int[] primers = generarNombresPrimers(num1);
        mostrarVector(primers);
    }

    public static boolean esNombrePrimer(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    static int[] generarNombresPrimers(int n) {
        int[] primers = new int[n];
        int y = 0;
        int i = 2;
        while (y < n) {
            if (esNombrePrimer(i)) {
                primers[y] = i;
                y++;
            }
            i++;
        }
        return primers;
    }

    public static void mostrarVector(int[] primers) {
        for (int i = 0; i < primers.length; i++) {
            System.out.print(primers[i]);
            if (i != primers.length - 1) {
                System.out.print(", ");
                if ((i+1) % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.print(".");
    }
}
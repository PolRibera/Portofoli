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

public class Ex02_Figures2_en {
   public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char figura;
        do {
            figura=sc.next().toLowerCase().charAt(0);
            switch (figura) {
                case 'q':
                    calcularQuadrat(sc);
                    break;
                case 'r':
                    calcularRectangle(sc);
                    break;
                case 't':
                    calcularTriangle(sc);
                    break;
                case 'c':
                    calcularCercle(sc);
                    break;
                case 's':
                    break;
                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }
        } while (figura!='s');
    }

    public static void calcularQuadrat(Scanner sc) {
        System.out.println("==Quadrat==");
        double cos = sc.nextDouble();
        double per = cos * 4;
        double ar = cos * cos;
        mostrarResultats(per, ar);
    }

    public static void calcularRectangle(Scanner sc) {
        System.out.println("==Rectangle==");
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double per = (c1 + c2) * 2;
        double ar = c1 * c2;
        mostrarResultats(per, ar);
    }

    public static void calcularTriangle(Scanner sc) {
        System.out.println("==Triangle isòsceles==");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double per = (a * 2) + b;
        double ar = (b * (Math.sqrt(Math.pow(a, 2) - (Math.pow(b, 2) / 4)))) / 2;
        mostrarResultats(per, ar);
    }

    public static void calcularCercle(Scanner sc) {
        System.out.println("==Cercle==");
        double r = sc.nextDouble();
        double per = 2 * Math.PI * r;
        double ar = Math.PI * r * r;
        mostrarResultats(per, ar);
    }

    public static void mostrarResultats(double per, double ar) {
        System.out.print("Perímetre : ");
        System.out.printf("%.2f \n",per);
        System.out.print("Superfície: ");
        System.out.printf("%.2f \n",ar);
    }
}


    
    



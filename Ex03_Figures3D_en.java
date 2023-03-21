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

public class Ex03_Figures3D_en {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char figura;

        do {
            figura=sc.next().toLowerCase().charAt(0);
            switch (figura) {
                case 'c':
                    calcularCilindre(sc);
                    break;
                case 'h':
                    calcularHexaedre(sc);
                    break;
                case 't':
                    calcularTetraedre(sc);
                    break;
                case 'e':
                    calcularEsfera(sc);
                    break;
                case 's':
                    break;
                default:
            }
        } while (figura!='s');
    }

    public static void calcularCilindre(Scanner in) {
        System.out.println("==Cilindre==");
        double r = in.nextDouble();
        double a = in.nextDouble();
        
        double sup = 2 * Math.PI * r * (r + a);
        double vol = Math.PI * Math.pow(r, 2) * a;
        mostrarResultats( sup, vol);
    }

    public static void calcularHexaedre(Scanner in) {
        System.out.println("==Hexaedre==");
        double c = in.nextDouble();
        double sup = 6 * Math.pow(c, 2);
        double vol = Math.pow(c, 3);
        
        mostrarResultats( sup, vol);
    }

    public static void calcularTetraedre(Scanner in) {
        System.out.println("==Tetraedre==");
        double ar = in.nextDouble();
        double sup = Math.pow(ar, 2) * Math.sqrt(3);
        double vol = Math.pow(ar, 3);
        mostrarResultats( sup, vol);
    }

    public static void calcularEsfera(Scanner in) {
        System.out.println("==Esfera==");
        double r = in.nextDouble();
        double sup = 4 * Math.PI * Math.pow(r, 2);
        double vol = (4 * Math.PI * Math.pow(r, 3)) / 3;
        mostrarResultats( sup, vol);
    }

    public static void mostrarResultats(double superficie, double volum) {
        System.out.print("Superfície: ");
        System.out.printf("%.2f \n",superficie);
        System.out.print("Volum: ");
        System.out.printf("%.2f \n",volum);
    }    
}

    
    



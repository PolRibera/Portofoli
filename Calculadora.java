/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uf2_a1;
import java.util.Scanner;

/**
 * @author polri
 */

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        char operacio;
        boolean sortir= false;

        do {
            a = 0;
            boolean sortir2=false;
            do {
                if (sc.hasNextInt()) {
                    a = sc.nextInt();
                    break;
                } else{
                    String resposta = sc.next();
                    if (resposta.equals("s")) {
                        sortir =true;
                        sortir2 =true;
                        break;
                    } else {
                        System.out.println("Introdueix un numero o una S per sortir");

                    }
                }
                
            } while (!sortir2);

            b = 0;
            do {
               if (sc.hasNextInt()) {
               b = sc.nextInt();
               } else {
               
                   sc.nextLine();
               } 
                
            } while (sc.hasNextInt());




            operacio = sc.next().charAt(0);

            switch (operacio) {
                case '+':
                    sumar(a, b);
                    break;
                case '-':
                    restar(a, b);
                    break;
                case 'x':
                    multiplicar(a, b);
                    break;
                case '/':
                    dividir(a, b);
                    break;
                default:
                    System.out.println("Operació invàlida!");
            }

        }
        while (!sortir);
    }

    public static void sumar(int a, int b) {
        int resultat = a + b;
        System.out.println(a + " + " + b + " = " + resultat);
    }

    public static void restar(int a, int b) {
        int resultat = a - b;
        System.out.println(a + " - " + b + " = " + resultat);
    }

    public static void multiplicar(int a, int b) {
        int resultat = a * b;
        System.out.println(a + " x " + b + " = " + resultat);
    }

    public static void dividir(int a, int b) {
        if (b == 0 || a == 0) {
            System.out.println("No es pot dividir per 0.");
            return;
        }
        int resultat = a / b;
        System.out.println(a + " / " + b + " = " + resultat);

    }
}
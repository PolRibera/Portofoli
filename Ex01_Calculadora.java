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
public class Ex01_Calculadora {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Introdueix un valor: ");
        int valor1=entrada.nextInt();
        System.out.print("Introdueix un altre valor: ");
        int valor2=entrada.nextInt();
        System.out.print("Quina operació vols fer? (+,-,x,/): ");
        char operacio = entrada.next().charAt(0);
        System.out.println("El resultat de la operacio es: "+calcularResultat(valor1,valor2,operacio));
        }
    public static int calcularResultat(int primerValor,int segonValor, char op){
        
        int resultat=0;
        switch (op){
            case '+':
                resultat=primerValor+segonValor;
                break;
            case '-':
                resultat=primerValor-segonValor;
                break;
            case '*':
                resultat=primerValor*segonValor;
                break;
            case '/':
                resultat=primerValor/segonValor;
                break;
            default:
                System.out.println("Operació incorrecte");
        }
        return resultat;
    }
}

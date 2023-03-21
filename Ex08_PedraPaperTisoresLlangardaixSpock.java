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
public class Ex08_PedraPaperTisoresLlangardaixSpock {
    public static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
          int[][] resultatJugada = {{0,-1,1,1,-1},
                                    {1,0,-1,-1,1},
                                    {-1,1,0,1,-1},
                                    {-1,1,-1,0,1},
                                    {1,-1,1,-1,0}};
          boolean SortirPrograma = false;
          do {
            int ronda = 1;
            int marcadorHuma=0,marcadorOrdinador=0;
            String [] Element = {"Pedra","Paper","Tisores","Llangardaix","Spock"};
            do {
            System.out.println("Ronda: "+ronda+" [Jugador: "+marcadorHuma+" - Ordinador: "+marcadorOrdinador+"]");
            System.out.print("pedra(0), paper(1), tisores(2), llangardaix(3), Spock(4):");
            int jugadaHuma = jugadaHuma();
            int jugadaOrdinador = (int)(Math.random()*5);
            System.out.print("El jugador ha tret "+Element[jugadaHuma]+". L'ordinador ha tret "+Element[jugadaOrdinador]+".");
            if (resultatJugada[jugadaHuma][jugadaOrdinador]==1) {
                marcadorHuma++;
                System.out.println(" Guanya el jugador!!");
            } else if (resultatJugada[jugadaHuma][jugadaOrdinador]==-1){
                marcadorOrdinador++;
                System.out.println(" Guanya l'ordinador!!");
            } else {
                System.out.println(" Empat.");
            }
                System.out.println("");

            if (marcadorHuma>=3||marcadorOrdinador>=3) {
                System.out.println("La partida ha acabat en "+ronda+" rondes.");
                System.out.println("El marcador ha estat:");
                System.out.println("Jugador: "+marcadorHuma+" - Ordinador: "+marcadorOrdinador);
                boolean SortirPregunta = false;
                do {
                    sc.nextLine();
                    System.out.print("Vols fer una nova partida? [S/N]:");
                    char resposta = sc.nextLine().toLowerCase().charAt(0);
                    if (resposta=='n') {
                        SortirPrograma=true;
                        SortirPregunta=true;
                    } else if (resposta=='s') {
                        SortirPrograma=false;
                        SortirPregunta=true;
                    } 
                } while (!SortirPregunta);


            }
                      ronda++;
            } while (marcadorHuma<3&&marcadorOrdinador<3);
          } while (!SortirPrograma);
  
    }
       public static int jugadaHuma(){
           boolean entradaCorrecte = false;
           int resultat=0;
           do {
                if (sc.hasNextInt()) {
                    resultat = sc.nextInt();
                    if (resultat >=0&& resultat <=4) {
                        entradaCorrecte = true;
                    }
                }
                if (!entradaCorrecte) {
                   System.out.print("pedra(0), paper(1), tisores(2), llangardaix(3), Spock(4):");
                   sc.nextLine();
               }
           } while (!entradaCorrecte);
          
           
           return resultat;
      }
       public static int jugadaOrdinador(){
           return (int)(Math.random()*5);
      }
}

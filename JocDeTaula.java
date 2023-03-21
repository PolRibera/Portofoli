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
public class JocDeTaula {
    static final int CASELLES=8;
    static final int TOTALFITXESBLANQUES=20;
    public static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
          int [][]tauler = creaTauler();
          final int MAXINTENTS = 10;
          final int MAXFITXESNEGRES=4;

          int intents =0;
          int totalFitxesNegres=0;
          do {
              System.out.println("Intent: "+(intents+1));
              System.out.print("Fila: ");
              int fila = sc.nextInt()-1;
              System.out.print("Columna: ");
              int columna = sc.nextInt()-1;
              if (tocaVora(fila,columna)) {
                  System.out.println("La posició NO es valida. Toca la vora.");
              } else if (posOcupada(tauler,fila,columna)) {
                    System.out.println("La posició NO es valida. Hi ha una fitxa.");
              } else {
                    System.out.println("La posició es valida.");
                    tauler[fila][columna]=2;
                    totalFitxesNegres++;
                    if (totalFitxesNegres==MAXFITXESNEGRES) {
                      break;
                  }
              }
              
              
              intents++;
          } while (intents<MAXINTENTS);
          if (totalFitxesNegres>=MAXFITXESNEGRES) {
              System.out.println("Has guanyat!!!");
          } else {
              System.out.println("Has perdut!!");
          }
          
          System.out.println("El Tauler");
          mostraTauler(tauler);
    }
       static int[][] creaTauler() {
           int[][] tauler = new int [CASELLES][CASELLES];
           int fitxesblanques=0;
           do {
               int fila =(int) (Math.random()*CASELLES);
               int columna =(int) (Math.random()*CASELLES);
               if (!posOcupada(tauler,fila,columna)) {
                   tauler[fila][columna]=1;
                   fitxesblanques++;
               }
           } while (fitxesblanques<TOTALFITXESBLANQUES);
           
           return tauler;
       }
       
       static boolean posOcupada(int[][]tauler,int fila, int columna){
           boolean estaOcupat = false;
           if (tauler[fila][columna]!=0) {
               estaOcupat=true;
           }
          return estaOcupat; 
       }
       
       static boolean tocaVora(int fila, int columna){
           boolean toca = false;
           if (fila==0||columna==0||fila==CASELLES-1||columna==CASELLES-1) {
               toca=true;
           }
          return toca; 
       }
       static void mostraTauler(int[][]tauler){
           for (int i = 0; i < tauler.length; i++) {
               for (int j = 0; j < tauler[0].length; j++) {
                   if (tauler[i][j]==1) {
                       System.out.print("B ");
                   } else if (tauler[i][j]==2){
                       System.out.print("n ");
                   } else{
                       System.out.print(tauler[i][j]+" ");
                   }
               }
               System.out.println("");
           }
       }
}

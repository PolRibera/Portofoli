/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uf2_a1;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author polri
 */
public class Ordenacio {
    public static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
//          int [] nombres = {8,5,2,9,3,14,19,10,7,6};
          int [] nombres = generarArray(10000);
          System.out.println("Valors Inicials: ");
          mostrarArray(nombres);
          
          long tempsInicial = System.currentTimeMillis();
          Arrays.sort(nombres);
          long tempsFinal = System.currentTimeMillis();
          
          mostrarArray(nombres);
          System.out.println(tempsFinal-tempsInicial+" ms");
    }
      
      
      static void ordenaSeleccio(int[] array){
          for (int i = 0; i < array.length-1; i++) {
              for (int j = i+1; j < array.length; j++) {
                  if (array[i]>array[j]) {
                      int aux =array[i];
                      array[i]=array[j];
                      array[j]=aux;        
                  }
              }
          }
      }
      static void ordenaBombolla(int[] array){
          for (int i = 0; i < array.length-1; i++) {
              for (int j = 0; j < array.length-i-1; j++) {
                  if (array[j]>array[j+1]) {
                      int aux = array[j];
                      array[j]=array[j+1];
                      array[j+1]=aux;
                  }
              }
          }
     }
      
      static void mostrarArray(int[] array){
          for (int i = 0; i < array.length; i++) {
              System.out.print(array[i]+" ");
              if ((i+1)%20==0) {
                  System.out.println("");
              }
          }
          System.out.println("");
      
      }
     
      static int[] generarArray(int num){
          int [] resultat = new int [num];
            for (int i = 0; i < num; i++) {
            boolean repetit = true;
                do {
                    repetit=false;
                    int valor=(int) (Math.random()*(2*num))+1;
                    for (int j = 0; j < i; j++) {
                    if (resultat[j]==valor) {
                        repetit = true;
                        break;
                    }
                }
                if (!repetit) {
                    resultat[i]=valor;
                }
                } while (repetit);
            
                
            }
      return resultat;
      }
}

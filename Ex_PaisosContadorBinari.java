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
public class Ex_PaisosContadorBinari {
    public static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
          int n = sc.nextInt();
          sc.nextLine();
          String[] llistaPaisos = new String [n];
          for (int i = 0; i < n; i++) {
              llistaPaisos[i]=sc.nextLine();
          }
          String paisEscollit = sc.nextLine();
          String[] paisosOrdenats = ordenaBombolla(n,llistaPaisos);
          int posicioPais=cercaBinaria(paisosOrdenats,paisEscollit);
          if (posicioPais==-1) {
              System.out.println("No trobat");
          } else {
              System.out.println("Trobat a la posició: "+posicioPais);
          }

    }
      static String[] ordenaBombolla(int paisos, String[] array){
          for (int i = 0; i < array.length-1; i++) {
              for (int j = 0; j < array.length-i-1; j++) {
                  if (array[j].compareToIgnoreCase(array[j+1])>0) {
                      String aux = array[j];
                      array[j]=array[j+1];
                      array[j+1]=aux;
                  }
              }
          }

          return array;
      }
    static int cercaBinaria(String[] paisosOrdenats, String paisEscollit) {
        int resultat = -1;
        int esquerra = 0;
        int dreta = paisosOrdenats.length - 1;
        int meitat;
        int passades = 0;

        while (esquerra <= dreta) {
            meitat = (esquerra + dreta) / 2;
            passades++;

            if (paisosOrdenats[meitat].equalsIgnoreCase(paisEscollit)) {
                resultat = meitat;
                break;
            } else if (paisosOrdenats[meitat].compareToIgnoreCase(paisEscollit) < 0) {
                esquerra = meitat + 1;
            } else {
                dreta = meitat - 1;
            }
        }

        System.out.println("Total passades: " + passades);
        return resultat;
    }
}

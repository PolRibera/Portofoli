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
public class Ex07_ComptaMines {
    public static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
                System.out.print("Files:");
            int totalfiles=sc.nextInt();
                System.out.print("Columnes:");
            int totalcolumnes=sc.nextInt();
            int[][] matriuintroduida = Ex06_Matrius.demanaMatriu(totalfiles,totalcolumnes);
            for (int i = 0; i < matriuintroduida.length; i++) {
                for (int j = 0; j < matriuintroduida[i].length; j++) {
                    if (comptaMina(matriuintroduida)[i][j]>=0) {
                        System.out.print(" ");
                    }
                    System.out.print(comptaMina(matriuintroduida)[i][j]+" ");
                }
                System.out.println("");
          }

    }
      
       public static int[][] comptaMina(int[][] matriu) {
        int[][] resultat = new int [matriu.length][matriu[0].length];
           for (int i = 0 ; i < matriu.length; i++) {
               for (int j = 0; j < matriu[i].length; j++) {
                   if (matriu[i][j]==0) {
                       int condiciocolumna=i;
                       int condiciocolumnafinal=i;
                       int contador=0;
                       if (i-1>=0) {
                           condiciocolumna=i-1;
                       }
                       if (i+1<matriu.length) {
                           condiciocolumnafinal=i+1;
                       }
                           for (int k = condiciocolumna; k <=condiciocolumnafinal; k++) {
                              int condiciofila=j;
                              int condiciofilafinal=j;
                                    if (j-1>=0) {
                                        condiciofila=j-1;
                                    }
                                    if (j+1<matriu[i].length) {
                                        condiciofilafinal=j+1;
                                    }
                                for (int l = condiciofila; l <= condiciofilafinal; l++) {
                                    if (matriu[k][l]==-1) {
                                        contador+=1;
                                    }
                                }
                        }
                       resultat[i][j]=contador;
                   } else if (matriu[i][j]==-1) {
                      resultat[i][j]=-1;
                   }
               }
           }
       return resultat;
    }
}

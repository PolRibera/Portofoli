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
public class Ex06_Matrius {
   public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        int[][] matriuTest = {{1,3,4,5},{5,6,3,2},{2,3,4,5},{2,3,23,10}};
        mostraMatriu(matriuTest);
                System.out.print("Files:");
            int totalfiles=sc.nextInt();
                System.out.print("Columnes:");
            int totalcolumnes=sc.nextInt();
                System.out.print("Num minim:");
            int nummin=sc.nextInt();
                System.out.print("Num maxim:");
            int nummax=sc.nextInt();
        int[][] matriuintroduida = demanaMatriu(totalfiles,totalcolumnes);
       System.out.println("Matriu amb dades introduides per teclat");
        mostraMatriu(matriuintroduida);
            int [][] matriurandom = generaMatriu
        (totalfiles,totalcolumnes,nummin,nummax);
            mostraMatriu(matriurandom);
    }
    public static void mostraMatriu(int[][] matriu) {
        for (int fila = 0; fila < matriu.length; fila++) {
            for (int columna = 0; columna < matriu[0].length; columna++) {
                System.out.print(matriu[fila][columna]+"\t ");
            }
            System.out.println("");
        }
                  System.out.println("");
    }
    public static int[][] demanaMatriu(int files, int columnes) {
        int [][] resultat = new int[files][columnes];
          for (int fila = 0; fila < files; fila++) {
              System.out.println("Dades de la fila "+(fila+1)+":");
            for (int columna = 0; columna < columnes; columna++) {
                System.out.print("Valor "+(columna+1)+":");
                int valor = sc.nextInt();
                resultat[fila][columna]=valor;           
            }
            System.out.println("");
        }
       return resultat;
    }
        public static int[][] generaMatriu(int files, int columnes,int min,int max) {
        int [][] resultat = new int[files][columnes];
          for (int fila = 0; fila < files; fila++) {
            for (int columna = 0; columna < columnes; columna++) {
                int valor  = (int)(Math.random()*(max+1-min)+min);
                resultat[fila][columna]=valor;
                
            }
        }
       return resultat;
    }
        public static int sumaMatriu(int[][] matriu) {
            int resultat=0;
            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                     resultat+=matriu[i][j];
                }
            }
       return resultat;
    }
}
    



    
    



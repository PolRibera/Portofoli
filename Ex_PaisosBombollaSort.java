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
public class Ex_PaisosBombollaSort {
    public static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
          int n = sc.nextInt();
          sc.nextLine();
          String[] llistaPaisos = new String [n];
          for (int i = 0; i < n; i++) {
              llistaPaisos[i]=sc.nextLine();
          }
          String[] paisosOrdenats = ordenaBombolla(n,llistaPaisos);   
          System.out.println("Països ordenats:");
          for (int i = 0; i < paisosOrdenats.length; i++) {
              System.out.println(paisosOrdenats[i]);
          }

    }
      static String[] ordenaBombolla(int paisos, String[] array){
          Arrays.sort(array);

          return array;
      } 
}

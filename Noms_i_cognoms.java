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
public class Noms_i_cognoms {
    public static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
          String [] llistaNoms = {"Torres Hernández, Pere","Majoral Gatell, Anna","Pérez Gomis, Josep","López López, Rosa","Camps García, Ricard","Sánchez Pasqual, Carles","Mengual Sánchez, Gemma","Puig Soler, Jordi"};
          String[] LlistaDef=OrdenaBombolla(llistaNoms);
          MostraNoms(LlistaDef);
    }
      static String[] OrdenaBombolla(String[] array){
           for (int i = 0; i < array.length-1; i++) {
              for (int j = 0; j < array.length-i-1; j++) {
                  String S1=array[j].split(",")[1].trim();
                  String S2=array[j+1].split(",")[1].trim();
                  if (S1.compareToIgnoreCase(S2)>0) {
                      String aux = array[j];
                      array[j]=array[j+1];
                      array[j+1]=aux;
                  }
              }
          }
       return array;
      }
      static void MostraNoms(String[] array){
          for (int i = 0; i < array.length; i++) {
              System.out.println(array[i]);
          }
      }
}

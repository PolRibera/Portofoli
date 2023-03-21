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
public class TestMatriu {
    public static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
        int[][] matriu = {{1,3,4,5},{5,6,3,2},};
        Ex06_Matrius.mostraMatriu(matriu);
          System.out.println(Ex06_Matrius.sumaMatriu(matriu));
    }
}

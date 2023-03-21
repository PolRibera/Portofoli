/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuf2_2023;

import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class TicTacToe {
    
    public static void main(String[] args) {
 
        final int DIMENSIONS = 3;
        
        Scanner sc = new Scanner(System.in);
        
        int[][] tauler = new int[DIMENSIONS][DIMENSIONS];
        int jugador = 1;
        
        while (true) {
                    
            mostraTauler(tauler);

            int posX, posY; 
            do {
                System.out.println("Jugador " + jugador);
                System.out.print("Posició: ");
                String posicio = sc.nextLine();
                posX = Integer.parseInt(posicio.split(",")[0].trim());
                posY = Integer.parseInt(posicio.split(",")[1].trim());            
            } while (!esPosicioValida(tauler,posX,posY));
            tauler[posX-1][posY-1] = jugador;

            if (tresEnRatlla(tauler,jugador)) {
                System.out.println("Guanya jugador " + jugador);
                break;
            } else if (casellesLliures(tauler) == 0) {
                System.out.println("Empat");
                break;
            }
            
            jugador = (jugador == 1) ? 2 : 1;
            System.out.println("");
            
        }
        
        mostraTauler(tauler);
        
    }
    
    
    static void mostraTauler(int[][] tauler) {
        
        for (int fila = 0; fila < tauler.length; ++fila) {
            for (int col = 0; col < tauler[0].length; ++col) {
                switch (tauler[fila][col]) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("X");
                        break;
                    case 2:
                        System.out.print("O");
                        break;                        
                }
                
                if (col < tauler[0].length-1)
                    System.out.print("|");
            }
            System.out.println("");
            for (int col = 0; col < tauler[0].length; ++col)
                System.out.print("- ");
            System.out.println("");
        }
    }
    

    
    
    static boolean esPosicioValida(int[][] tauler, int posX, int posY) {
         
        // Completar
        
        
        return true;
    }
    
    
    
    static boolean tresEnRatlla(int[][] tauler, int jugador) {
        
        
        for (int fila = 0; fila < tauler.length; ++fila) {
            if (tresEnRatllaHoritzontal(tauler,fila,jugador))
                return true;
        }
        for (int col = 0; col < tauler[0].length; ++col) {
            if (tresEnRatllaVertical(tauler,col,jugador))
                return true;
        }
        if (tresEnRatllaDiagonal(tauler,jugador))
            return true;
        
        return false;
    }
    
    static boolean tresEnRatllaHoritzontal(int[][] tauler, int fila, int jugador) {
        
        // Completar
        
        return false;
    }

    static boolean tresEnRatllaVertical(int[][] tauler, int columna, int jugador) {
        
       // Completar
        
        return false;
    }
    
    static boolean tresEnRatllaDiagonal(int[][] tauler, int jugador) {
        
        // Completar
        return false;
    }

    
    static int casellesLliures(int[][] tauler) {
        
        // Completar
        
        return 0;
    }
}

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
public class Ex03_Figures3D {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Selecciona figura 2D***");
        System.out.println("1. Quadrat");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Cercle");
        System.out.println("");
        System.out.print("Tria una Opcio [1-4]: ");
        int opcio = entrada.nextInt();
        
        switch (opcio){
            case 1:
                System.out.print("Costat: ");
                double costat = entrada.nextDouble();
                System.out.println("Perimetre: "+calcularQuadrat(costat,'p'));
                System.out.println("Superficie: "+calcularQuadrat(costat,'s'));
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            
        }
    }
    
    public static double calcularQuadrat(double costat, char calcul){
        double resultat = 0;
                switch (calcul){
                    case 'p':
                        resultat=costat*4;
                        break;
                    case 's':
                        resultat=costat*costat;
                        break;     
                }
        return resultat;
    }
}

    
    



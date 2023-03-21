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
public class Ex02_Figures2D {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        /** Menú **/
        System.out.println("** Selecciona figura 2D **");
        System.out.println("1.- Quadrat");
        System.out.println("2.- Rectangle");
        System.out.println("3.- Triangle isòsceles");
        System.out.println("4.- Cercle");
        System.out.println("");
        System.out.print("Tria opció [1-4]: ");
        int opcio = sc.nextInt();
        
        double perimetre = 0.0, superficie = 0.0;
        switch (opcio) {
            case 1:
                System.out.print("Costat: ");
                double costat = sc.nextDouble();
                double[] resultat = calculaQuadrat(costat);
                perimetre = resultat[0];
                superficie = resultat[1];
                break;
            case 2:
                System.out.print("Costat llarg: ");
                double costatLlarg = sc.nextDouble();
                System.out.print("Costat curt : ");
                double costatCurt = sc.nextDouble();
                
                perimetre  = calculaPerimetreRectangle(costatLlarg,costatCurt);
                superficie = calculaSuperficieRectangle(costatLlarg,costatCurt);                
                break;
            case 3:
                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Alçada: ");
                double alcada = sc.nextDouble();
                
                perimetre  = calculaPerimetreTriangle(base,alcada);
                superficie = calculaSuperficieTriangle(base,alcada);                                
                break;
            case 4:
                System.out.print("Radi:");
                double radi = sc.nextDouble();
                
                perimetre  = calculaPerimetreCercle(radi);
                superficie = calculaSuperficieCercle(radi);                
                break;            
        }
        
        System.out.printf("Perimetre: %.2f\n", perimetre);
        System.out.printf("Superfície: %.2f\n", superficie);
        
    }
    
    
    public static double calculaPerimetreQuadrat(double costat) {
        
        double resultat = costat*4;
        return resultat;
        
    }
    
    public static double calculaSuperficieQuadrat(double costat) {
        
        return costat*costat;
    }
    
    
    public static double[] calculaQuadrat(double costat) {
        double perimetre = costat*4;
        double superficie = costat*costat;
        
        double[] resultat = new double[2];
        resultat[0] = perimetre;
        resultat[1] = superficie;
        
        return resultat;
    }
    
    
    
    
    public static double calculaPerimetreRectangle(double c1,double c2) {
        
        return (c1+c2)*2;
        
    }
    
    public static double calculaSuperficieRectangle(double c1,double c2) {
        
        return c1*c2;
    }
    
    public static double calculaPerimetreTriangle(double base,double alcada) {
        
        return 2*Math.sqrt(base*base/4 + alcada*alcada) + base;
        
    } 
    
    public static double calculaSuperficieTriangle(double base,double alcada) {
        
        return base*alcada/2;
        
    } 
    
    public static double calculaPerimetreCercle(double radi) {
        
        return 2*Math.PI*radi;
    }    
    
    
    public static double calculaSuperficieCercle(double radi) {
        return Math.PI*radi*radi;
    }    
    
}


    
    



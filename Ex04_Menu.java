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

public class Ex04_Menu {
    
    
    public static Scanner sc = new Scanner(System.in); 
    
    public static void main(String[] args) {
        
        
        
        boolean sortir = false;
        do {
            System.out.println("* * * * * * M E N U * * * * * *");
            System.out.println("===============================");
            System.out.println("A - [Ex. 23] Taula divisió entera");
            System.out.println("B - [Ex. 26] Fibonacci");
            System.out.println("C - [Ex. 01] Compta vocals");
            System.out.println("X - SORTIR");
            System.out.print("Tria una opció: ");

            String entrada = sc.nextLine();
            char opcio = ' ';
            if (entrada.length() == 1) {
                opcio = entrada.charAt(0);
                switch (opcio) {
                    case 'a':
                    case 'A':
                        taulaDivisioEntera();                                                        
                        break;
                    case 'b':
                    case 'B':
                        fibonacci();
                        break;
                    case 'c':
                    case 'C':
                        comptaVocals();
                        break;
                    case 'x':
                    case 'X':
                        sortir = true;
                        break;
                    default:
                        System.out.println("Opció incorrecta!");
                }
            }
            else
                System.out.println("Opció incorrecta!");
            
            System.out.println("\n\n");
        
        } while (!sortir);
    }
    
    public static void taulaDivisioEntera() {
               
               

        boolean sortir = false;
        while(!sortir)
        {
            System.out.print("Introdueix un nombre natural: ");
            if (sc.hasNextInt())
            {
                int n = sc.nextInt();
                if (n > 0)
                {                
                    for (int i = 1; i <= 10; ++i)
                    {
                        System.out.println(n + " / " + i + ": quocient = " + 
                                (n / i) + " i residu = " + (n % i));
                    }
                    sortir = true;
                }
            }
        }
        sc.nextLine();
    }
    
    
    public static void fibonacci() {

        

        System.out.print("Introdueix un nombre natural: ");
        int n = sc.nextInt();

        System.out.print("1 1 ");
        int total = 2;
        int fib = 1, fib_ant = 1;
        while (total < n)
        {
            int aux = fib;
            fib += fib_ant;
            fib_ant = aux;
            System.out.print(fib + " ");
            ++total;
        }
        System.out.println();  
        sc.nextLine();
        
    }
    
    public static void comptaVocals() {

		System.out.print("Introdueix una frase: ");
		String frase = sc.nextLine();
		
		String vocals = "aeiouAEIOUÃ Ã©Ã¨Ã­Ã³Ã²ÃºÃ€ÃˆÃ‰Ã�Ã“Ã’ÃšÃ¯Ã¼Ã�Ãœ";
		int totalVocals = 0;
		for (int i = 0; i < frase.length(); ++i)
		{
			if (vocals.indexOf(frase.substring(i, i+1)) != -1)
				totalVocals++;
		}
		
		System.out.println("La frase conté " + totalVocals + " vocals.");
		
           
    }

}
    
    



    
    



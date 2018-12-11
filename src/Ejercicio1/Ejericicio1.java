/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Arturo Vinagre Muñoz
 */
public class Ejericicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float numero;
        float sumatoria = 0;    
        int contador1 = -1;
        int contador2 = 0;
        int contador3 = 0;
        
        
        
        do{
            System.out.println("Introduzca un número. Pulse cero para salir");
            numero = ES.leerReal(0, "Introduzca un número mayor que cero");            
            if (numero > 10) {
                sumatoria = sumatoria + numero;
                contador2++;
            }
            if (numero > 0 && numero <= 10){
                sumatoria = sumatoria * numero;
                contador3++;
            }
            contador1++;
            
        }
        while(numero != 0);
        System.out.println("El número total de números introducidos es: " +contador1);
        System.out.println("Las veces que se ha sumado ha sido: " +contador2);
        System.out.println("Las veces que se ha multiplicado han sido: " +contador3);
        System.out.println("El total es: " +sumatoria);
    }
    
}

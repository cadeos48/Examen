/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author yo
 */
public class ES {
   
    
    public static float leerReal(float valorMinimo, String mensaje){
        Scanner teclado = new Scanner(System.in);
        float numero = 0;
        boolean validacion = false;
        do{         
            
            try{
                numero = teclado.nextFloat();
                validacion = true;
            }
            catch(Exception e){
                System.out.println("Introduzca un numero");
                teclado.nextLine();
            }
            if (numero < valorMinimo) System.out.println(mensaje);
        }        
        while(numero < valorMinimo || validacion == false);
        return numero;
    }
}

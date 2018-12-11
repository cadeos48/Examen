/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author yo
 */
public class ClasePrincipal {
    public static void main(String[] args){
        Vehiculo[] taller = new Vehiculo[10];
        int opcion;
        for(int contador = 0; contador<taller.length; contador++){
            taller[contador] = new Vehiculo("#","","","","",0f,0);
        }
     
        do{    
               System.out.println("Seleccione opción");
               System.out.println("1.Dar de alta un vehículo nuevo");
               System.out.println("2.Modificar un dato de un vehículo");
               System.out.println("3.Mostrar datos de un vehículo");
               System.out.println("4.Mostrar datos de un vehículo. Indicar número de vehículo");
               System.out.println("5.Mostrar los datos de todos los vehículos");
               System.out.println("6.Dar de baja un vehículo");               
               System.out.println("7.Salir");
               opcion = ES.leerEntero();
               switch(opcion){
                   case 1:
                       System.out.println("Introduzca matricula del vehículo");                       
                       taller[0].setMatricula(ES.leerCadena());
                       for (int contador = 0; contador <taller.length, contador++){
                           if(!taller[contador].getMatricula().equals("#")) System.out.println("No se pueden introducir más vehículos");
                           else{}
                       }
                       System.out.println("Introduzca marca del vehículo");
                       taller[0].setMarca(ES.leerCadena());
                       System.out.println("Introduzca modelo del vehículo");
                       taller[0].setModelo(ES.leerCadena());
                       System.out.println("Introduzca descripcion del vehículo");
                       taller[0].setDescripcion(ES.leerCadena());
                       System.out.println("Introduzca propietario del vehículo");
                       taller[0].setPropietario(ES.leerCadena());
                       System.out.println("Introduzca teléfono del propietario");
                       taller[0].setTelefono(ES.leerEntero());                   
                       break;
                    case 2:
                        System.out.println("Opción aún no disponible");                     
                        break;
                    case 3:
                        System.out.println("Opción aún no disponible");                
                        break;
                    case 4:
                        System.out.println("Introduzca número de vehículo");                        
                        System.out.println(taller[ES.leerEntero()].toString());
                        break;
                    case 5:
                        for(int contador = 0; contador<taller.length; contador++){
                            System.out.println(taller[contador].toString());
                        }                   
                       break;
                    case 6:
                        System.out.println("Dar de baja un vehículo");
                        break;
               }
        }
        while(opcion !=7);
    }
}
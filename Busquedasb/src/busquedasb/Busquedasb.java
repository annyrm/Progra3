/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasb;

import java.util.Scanner;

/**
 *
 * Ana Teresa Ramírez Morones
 * 512873
 *  * Josue Alexis Ramírez 513622
 * Jose María de la Garza 513097
 * Luis Iván García 1410530
 * 3er Semestre ITIC
 */
public class Busquedasb implements MOrdenamiento{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
       int [] vector1;
       int num, r, opcion;
       Scanner sc = new Scanner (System.in);
       menu();
       
       System.out.print("OPCION ==> ");

			      opcion = sc.nextInt();/*La variable opcion toma el valor
                              e la variable tipo Scanner (int) que contiene el número de la
                              opción deseada por el usuario
                              */
                              
			      switch(opcion){
			                    case 1: 
                                                Secuencia buscarS = new Secuencia();
                                                vector1 = buscarS.crearVector();
                                                buscarS.mostrarArreglo(vector1);
                                                num = buscarS.solicitarElemento();
                                                r = buscarS.buscar(vector1, num);
                                                buscarS.mostrarResultado(r);
                                                System.out.println("¿Deseas ordenar el arreglo? Presiona 1 para sí y 0 para no");
                                                int o = sc.nextInt();
                                                if(o == 1){
                                                    buscarS.ordenamientoSeleccion(vector1);
                                                   
                                                    buscarS.mostrarArreglo(vector1);
                                                    break;//Termina acción y sale del método
                                                }else{
                                                    break;//Termina acción y sale del método 
                                                }
                                                    
                                                
			                    case 2: 
                                                Binaria buscarB = new Binaria();
                                                vector1 = buscarB.crearVector();
                                                buscarB.mostrarArreglo(vector1); 
                                                num = buscarB.solicitarElemento();
                                                r = buscarB.buscar(vector1, num);
                                                buscarB.mostrarResultado(r);
                                                break;//Termina acción y sale del método
                                            
			                    case 3:  break;/*Si el usuario acciona 
                                            el 4 significa que saldrá de la aplicación*/

			      }//fin del switch
        
        
       
            
            
            
            
            
            
                        
           
            
           
      
    
}
    public static void menu(){/*Método encargado de desplegar las posibles opciones del menú
       Este método solo muestra en pantalla que acciones pueden hacerse en cada una de las 
        opciones del menú. 
        */

	     System.out.println("     M   E   N    U");
	     System.out.println("1.- Arreglo Secuencial");
	     System.out.println("2.- Arreglo Binario");
             System.out.println("3.- S  A  L  I  R");
	    }// fin del método menu
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasb;

import java.util.Scanner;

/**
 *Jumpstarters
 * "Saltaremos hasta llegar a la cima"
 * Ana Teresa Ramírez Morones 512873
 * Josue Alexis Ramírez 513622
 * Jose María de la Garza 513097
 * Luis Iván García 1410530
 * 3er Semestre ITIC
 */
public class Busquedasb{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
        //Estos son los vectores.
        int[] vec1;
        int[] vec2;
        int b;
        System.out.println("---------------------- Esta es la prueba del objeto Binario ----------------------");
        //Primero instanciamos el Objeto
        Binaria OBinario = new Binaria();
        //Luego creamos el vector
        vec1=OBinario.CrearVector();
        //Después lo guardamos en el atributo del objeto con SetVector
        OBinario.SetVector(vec1); //Al hacer esto el vector se referencía y cualquier cambio que hagamos en vec,
                                  //se reflejará en el vector del objeto.
        //Mostramos el vector, que guardamos
        OBinario.MostrarVector(OBinario.GetVector());
        menu(OBinario,vec1);//Ordenamos el vector eligiendo un método del menú.
        //Mostramos el vector ya ordenado
        OBinario.MostrarVector(OBinario.GetVector());
        //Solicitamos la búsqueda de algún elemento, lo buscamos, y mostramos el resultado.
        OBinario.MostrarResultado(OBinario.Busqueda(vec1, OBinario.QueBusco()));
        //Concluye la prueba del método binario.
        
        System.out.println("---------------------- Esta es la prueba del objeto Secuencial ----------------------");
        Secuencia OSecuencial = new Secuencia();
        vec2=OSecuencial.CrearVector();
        OSecuencial.SetVector(vec2);
        OSecuencial.MostrarVector(vec2); //Aquí mostramos el vector de la variable.
        //Solicitamos al usuario el número a buscar
        b=OSecuencial.QueBusco();
        //Buscamos en el vector del objeto, y no en vec 2, para demostrar que es posible buscar con lo que devuelve
        //un método.
        b=OSecuencial.Busqueda(OSecuencial.GetVector(),b);
        //Se muestra el resultado.
        OSecuencial.MostrarResultado(b);
    }
    public static void menu(Binaria OBinario,int[]v){/*Método encargado de desplegar las posibles opciones del menú
       Este método solo muestra en pantalla que acciones pueden hacerse en cada una de las 
        opciones del menú. 
        */
            int i = 0;
            int d = v.length -1;
            Scanner sc;
            sc = new Scanner(System.in);
	     System.out.println("     M   E   N    U");
	     System.out.println("1.- Método de Selección");
	     System.out.println("2.- Método Burbuja");
             System.out.println("3.- Método QuickSort"); //Con esto se le aparece las opciones del menu al usuario 
             
             System.out.print("OPCION ==> ");
			      int opcion = sc.nextInt(); // Se le pide al usuario que escoja unas de las opciones del menu
                              
                               switch(opcion) { //Inicio del switch
			                     case 1: 
                                                 OBinario.MSeleccion(v); // Escoge un uno, lo lleva al metodo de selección
			                            break;
			                     case 2: OBinario.MBurbuja(v); // Escoge un dos, lo lleva al metodo burbuja
			                            break;
			                     case 3: OBinario.MQSort(v, d, i); // Escoge un tres, lo lleva al metodo Quicksort
			                            break;
			                     case 4: 
			                            break;
			      }//fin del switch

             
             
             
	    }// fin del método menu
}

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
public class Busquedasb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        
       int vector1[] = new int [1000];
       int vector2[] = new int [1000];
       int num;
       
       
        
        
       
            Secuencia buscarS = new Secuencia();
            vector1 = buscarS.crearVector();
            
            buscarS.mostrarArreglo(vector1);
            num = buscarS.solicitarElemento();
            int r = buscarS.buscar();
            buscarS.mostrarResultado(r);
            
            
            
            
            
                        
           
            Binaria buscarB = new Binaria();
           
      
    
}
}

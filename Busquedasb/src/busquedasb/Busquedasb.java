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
        Menu menu = new Menu(a);
       int vector1[] = new int [1000];
       int vector2[] = new int [1000];
       int num;
       
       
        
        if (a == 1){
            Secuencia buscarS = new Secuencia();
            buscarS.crearVector(1);
            vector1 = buscarS.getVector(1);
            
            
            
            
            
            
                        
            }
        else{
            Binaria buscarB = new Binaria();
            vector2 = buscarB.getVector(0);
            num = buscarB.solicitarElemento();
        }
    }
    
}

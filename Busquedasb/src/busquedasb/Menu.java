/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasb;

import java.util.Scanner;

/**
 *
 * @author LuisIván
 */
public class Menu {

    Menu(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opción de las siguientes: ");
        System.out.println("1.- Busqueda secuencial");
        System.out.println("2.- Busqueda Binaria");
        System.out.print("==> ");
        a = sc.nextInt();
        System.out.println("");
        if(a==1){
            System.out.println("**__Busqueda Secuencial__**");
            System.out.println("");
        }
        else{
            System.out.println("**_Busqueda Binario__**");
            System.out.println("");
        }
    }

    
    
    
}

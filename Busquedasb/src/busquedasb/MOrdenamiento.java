/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasb;

/*Jumpstarter
 *"Vamos a brincar hasta la cima"
 * Ana Teresa Ramírez Morones 512873
 * Josue Alexis Ramírez 513622
 * Jose María de la Garza 513097
 * Luis Iván García A01410530
 * 3er Semestre ITIC
 */
public interface MOrdenamiento { //Se crea una clase interfase donde estaran los metodos de ordenamiento
    public void MSeleccion(int V[]);//Metodo de ordenamiento de selección
    public void MBurbuja(int V[]); //Metodo de ordenamiento Burbuja
    public void MQSort (int V[], int der,int izq); //Metodo de ordenamiento Quick Sort
}
   
   


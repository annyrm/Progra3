/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasb;

/**
 *
 * @author LuisIván
 */
public interface MOrdenamiento {

    public static void MSeleccion(int V[]){ 
        int i, j, menor, pos, tmp;
          for (i = 0; i < V.length - 1; i++) { // tomamos como menor el primero
                menor = V[i]; // de los elementos que quedan por ordenar
                pos = i; // y guardamos su posición
                for (j = i + 1; j < V.length; j++){ // buscamos en el resto
                      if (V[j] < menor) { // del array algún elemento
                          menor = V[j]; // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){ // si hay alguno menor se intercambia
                    tmp = V[i];
                    V[i] = V[pos];
                    V[pos] = tmp;
                }
          }
    }
    
    public static void MBurbuja(int V[]){
         int i, j, aux;
         for(i=0;i<V.length-1;i++)
              for(j=0;j<V.length-i-1;j++)
                   if(V[j+1]<V[j]){
                      aux=V[j+1];
                      V[j+1]=V[j];
                      V[j]=aux;
                   }
    }
    
    public static void MQSort(int V[],int der,int izq){
         int pivote=V[izq]; // tomamos primer elemento como pivote
            int i=izq; // i realiza la búsqueda de izquierda a derecha
            int j=der; // j realiza la búsqueda de derecha a izquierda
            int aux;

            while(i<j){            // mientras no se crucen las búsquedas
               while(V[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
               while(V[j]>pivote) j--;         // busca elemento menor que pivote
               if (i<j) {                      // si no se han cruzado                      
                   aux= V[i];                  // los intercambia
                   V[i]=V[j];
                   V[j]=aux;
               }
             }
             V[izq]=V[j]; // se coloca el pivote en su lugar de forma que tendremos
             V[j]=pivote; // los menores a su izquierda y los mayores a su derecha
             if(izq<j-1)
                MQSort(V,izq,j-1); // ordenamos subarray izquierdo
             if(j+1 <der)
                MQSort(V,j+1,der); // ordenamos subarray derecho
          }
}


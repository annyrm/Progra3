/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasb;

/**
 * Jumpstarters
 * "Vamos a brincar hasta la cima"
 * Ana Teresa Ramírez Morones 512873
 * Josue Alexis Ramírez 513622
 * Jose María de la Garza 513097
 * Luis Iván García  A01410530
 * 3er Semestre ITIC
 */
public class Binaria extends Busqueda implements MOrdenamiento{/*Creación de la clase hija Binaria, la cual hereda de la Busqueda el método abstracto buscar,
    en esta clase se implementará dicho método, haciendo énfasis en el tipo de búsqueda binaria, 
    la cual puede ser realizada solamente en un arreglo ordenado, ademas de que implementa lo que esta en la clase MOrdenamiento
    */
    
    @Override//Se utiliza el comando override para indicar que esta es la implementación del método buscar en la clase padre
    public int Busqueda(int [] arr, int e) {/*
        Implementación del método abstracto buscar, para la clase Binaria, el cuál hará  una busqueda binaria
        de un determinado dato dentro de un arreglo
        */
        int inicio, fin, centro, valorCentro;//Declaracion de variables 
        
        inicio = 0;//inicializar inicio en 0
        fin = arr.length - 1;// el valor de fin sera igual a la longitud del vector menos 1
        while(inicio < fin){//Mientras el valor de inicio se menor que fin entonces 
          centro = (inicio + fin)/ 2;//Centro valdra (inicio + fin) entre dos
          valorCentro = arr[centro];// el valor del centro, tomará el valor de la posición centro dentro del arreglo
          if(valorCentro == e){//Si el valor del centro es igual al valor solicitado por el usuario, entonces
              return centro;//regresamos el valor de centro, pues es el que buscamos
          }else{//Sino 
              if(e < valorCentro){/*si el valor solicitado es menor a valor centro, entonces
                  el valor de fin tomara el valor de centro de -1, lo cual lo recorrera a un espacio antes de centro, sino
                  inicio tomaría el valor de cantro +1 recorriendole a un espacio delante de centro
                  
                  */
                  fin = centro - 1;
              }else{
                  inicio = centro +1;
              }
                  
          }
              
          
        }
        return -1;//Si el ciclo termina y no se encontro el elemento entonces se regresa -1
       
        
        
    }
    
    @Override
     public void MSeleccion(int V[]){ //Se inicia el metodo de ordenamiento Selección
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
    @Override
    public void MBurbuja(int V[]){ //Se inicia el metodo de ordenamiento Burbuja
         int i, j, aux;
         for(i=0;i<V.length-1;i++)//Se abre el primer ciclo para controlar el vector
              for(j=0;j<V.length-i-1;j++)//Se abre el segundo ciclo para ordenar
                   if(V[j+1]<V[j]){//Si un dato es menor que el anterior
                      aux=V[j+1];
                      V[j+1]=V[j];
                      V[j]=aux;//Se cambia los datos
                   }
    }
    @Override
    public void MQSort(int V[],int der,int izq){ //Se inicia el metodo de ordenamiento Quicksort
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
    
    
    


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
        int i,j,menor,pos = 0,aux;
        for(i=0;i<V.length;i++){
            menor=V[i];
            pos=i;
                for(j=i;j<V.length;j++){
                    if(V[j]<menor){
                        menor=V[j];
                        pos=j;
                    }
                }
            if(pos!=i){
                aux=V[i];
                V[i]=V[pos];
                V[pos]=aux;
            }
        }
    }
    
    public static
}


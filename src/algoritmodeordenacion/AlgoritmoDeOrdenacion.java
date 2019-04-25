/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmodeordenacion;

/**
 *
 * @author xp
 */
public class AlgoritmoDeOrdenacion {

        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     int[] celdas = {64,17,21,55};
    
       AlgoritmoDeOrdenacion ejercicios = new AlgoritmoDeOrdenacion();
       ejercicios.insercion(celdas);
       for(int i=0 ;i<celdas.length;i++){
           
           System.out.println(celdas[i]);
       }
       
    }
    
       public void ordenacionBurbuja( int [ ] celdas ){
            int aux;
             for (int j=1; j<celdas.length; j++){
                for(int i=0; i < celdas.length -j; i++ ){
                    if ( celdas[ i ] > celdas[i+1] ) {//intercambia los elementos
                      aux = celdas[ i ];
                     celdas[ i ] = celdas[ i+1 ];
                    celdas[ i+1 ] = aux;
                    }
                }
             }
        }
       
      //EJERCICIO2
       
       public void insercion (int[]celdas){
           for (int i=1;i<celdas.length;i++){
               int auxiliar =  celdas[i];
               
               for(int j=0;j<i;j++){
                   if(celdas[i]<=celdas[j])
                      
                       celdas[j+1] = celdas[j];
                    }  
               celdas[i]= auxiliar;
               }
           }
           
       
    
}

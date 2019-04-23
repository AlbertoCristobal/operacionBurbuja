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

        int[] celdas ={11,17,21,55};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     
    
       ordenacionBurbuja ejercicios = new ordenacionBurbuja();
       System.out.println(Arrays.toString(ordenacionBurbuja.celdas));

    }
       public void ordenacionBurbuja( int []celdas ){
            int aux;
                for (int j=1; j<celdas.length; j++){
                 for(int i=0; i < celdas.length -j; i++ ){
                     
                 if ( celdas[ i ] > celdas[i+1] ) {
                 aux = celdas[ i ];
                 celdas[ i ] = celdas[ i+1 ];
                 celdas[ i+1 ] = aux;
                     }
                 }
            }
        } 
    
}

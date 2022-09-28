/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumdiagonalmatriz;

/**
 *
 * @author ronc
 */
public class SumDiagonalMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
  	System.out.println("**************************************************");	
	
        int i, j, sum = 0, sum2 =0, sum3 = 0;	
	int[][] matriz = {
            {49, 25, 51}, 
            {25, 50, 25}, 
            {50, 25, 50}};
	
		for(i = 0; i < matriz.length ; i++){//Suma Diagonales 0,0 + 1,1 + 2,2
				sum+= matriz[i][i];
		}
                
                for( i=0; i<matriz.length; i++){// Suma Diagonales 0,2 + 1,1 + 2,0
                    for( j=matriz[i].length-1; j>=0; j--){              
                        sum2+= matriz[i][j];
                        i++;
                }
                }
                
                
                
                for( i=0; i<matriz.length; i++){// Suma todas Filas Izq a Derecha
                    for( j=0; j<matriz[i].length; j++){              
                        sum3+= matriz[i][j];
                }
                }
		
                
	System.out.println("La Suma de las Diagonales Arriba hacia abajo = " + sum);
        System.out.println("La Suma de las Diagonales Abajo hacia Arriba = " + sum2);
        System.out.println("La Suma de las Filas  = " + sum3);
        
       
    }
    
}

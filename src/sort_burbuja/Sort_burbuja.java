/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort_burbuja;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JENG-PC
 */
public class Sort_burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño;
     float arreglo[];
     Scanner entrada = new Scanner(System.in);
     System.out.print("Digite la cantidad de datos a adicionar: ");
     tamaño = entrada.nextInt();
     arreglo = new float[tamaño];
     
     for(int i=0;i<=arreglo.length-1;i++){
     System.out.print("Digite el valor para la posicion: " + i + " :");
     arreglo[i]=entrada.nextFloat();
     }
    /*impresion de los resultados*/
    Sort_burbuja burbuja = new Sort_burbuja();
    System.out.println(Arrays.toString(burbuja.burbuja(arreglo)));
    
    
    
    }  
    
    
    public float[] burbuja(float arreglo[]){
    float intercambio;
        for(int rec=0;rec<arreglo.length-1;rec++){
            for(int pos=0;pos<arreglo.length-1;pos++){
                if(arreglo[pos]>arreglo[pos+1]){
                    intercambio = arreglo[pos];
                    arreglo[pos]= arreglo[pos+1];
                    arreglo[pos+1]=intercambio;
                }        
             }
        }        
    return arreglo;
    }
 
    
}

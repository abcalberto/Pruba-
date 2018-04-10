package burbuja;

import java.util.Scanner;

/**
 *
 * @author José Miguel Llanos M
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        // Defino e instancio el vector
        int vector[] = new int[5];
        int auxiliar;
        
        // Cargue
        for(int i=0; i<5; i++){
            System.out.println("Digite un número en la posición ["+ i +"]:" );
            auxiliar = captura.nextInt();
            
            if(auxiliar % 2 == 0){
                vector[i] = auxiliar;                
            }
            else{
                i = i - 1;
            }            
        }
        
        // Recorrido y la impresión
        for(int i=0; i<5; i++){
            System.out.println(vector[i]);
        }
    }
    
}

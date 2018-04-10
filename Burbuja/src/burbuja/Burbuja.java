package burbuja;

import java.util.Scanner;
/**
 *
 * 
 */
public class Burbuja {   
    public static void main(String[] args) {        
        Scanner captura = new Scanner(System.in);
        // 1.Defino e instancio el vector
        int vector[] = new int[3];
        int auxiliar;
        
        // 2. Cargo el vector
        for(int i=0; i<3; i++){
            System.out.println("Digite un número:");
            vector[i] = captura.nextInt();
        }
        
        // 3. Método de ordenamiento - Burbuja
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(vector[i] < vector[j]){
                    auxiliar = vector[i];
                    vector[i] = vector[j];
                    vector[j] = auxiliar;                    
                }                
            }
        }
        
        // 4. Recorrido e impresión del vector
        System.out.println("----------------------");
        for(int i=0; i<3; i++){
            System.out.println(vector[i]);
        }
    }
    
}

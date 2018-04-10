package burbuja;

import java.util.Scanner;

/**
 *
 * @author José Miguel Llanos M
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int tam;
        int sumatoria = 0;
        
        // Indicar al usuario cuantos elementos debe tener el vector
        System.out.println("Digite el tamaño del vector:");
        tam = captura.nextInt();
        
        // Defino e instancio el vector
         int vector[] = new int[tam]; 
         
        // Cargar el vector
        for(int i=0; i<tam; i++){
            System.out.println("Digite un valor para el vector");
            vector[i] = captura.nextInt();
            
            sumatoria = sumatoria + vector[i];            
        } 
        
        // Impresión de la suma
        System.out.println("Suma = "+ sumatoria);    
    }
}

package SRC.streams.Parallel;

import java.util.Arrays;


public class Paralle {
    public static void main(String[] args) {
        
        int []numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        // Stream secuencial
        long tiempoInicio = System.nanoTime(); // para ver cuanto se demora en nano segundos
        long tiempoFinal = System.currentTimeMillis(); // para ver cuantos mili segundos tarda 
        Arrays.stream(numeros).forEach(n-> System.out.println("Secuencia " + n)); 
        System.out.println("Tiempo de secuencia " + tiempoInicio );
        System.out.println("Tiempo Final " + tiempoFinal);
        System.out.println("Tiempo secuencial " + (tiempoInicio - tiempoFinal) + " nanoSegundos");


        // pallel Stream



    }
    
}

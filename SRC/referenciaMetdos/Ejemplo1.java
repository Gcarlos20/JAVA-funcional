package SRC.referenciaMetdos;

import java.util.function.Function;

public class Ejemplo1 {
    public static void main(String[] args) {
        Function<Integer, String> convertidor = String::valueOf;
        String resultado = convertidor.apply(123);

        System.out.println("Resultado: " + resultado);
    }
}

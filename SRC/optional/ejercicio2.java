package SRC.optional;
import java.util.Optional;
public class ejercicio2 {
    
    public static void main(String[] args) {
        Optional<String> Cadena = Optional.of("GAMBITO"); // el of no admite los nulls
    if (Cadena.isEmpty()){
        System.out.println("El valor es vacio");
    }

    else {
        System.out.println("tiene un valor ");
    }
}
}

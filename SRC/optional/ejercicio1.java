package SRC.optional;
import java.util.Optional;
public class ejercicio1 {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable(null); // Se crea un Optional con un valor nulo 
        
        if (optionalString.isEmpty()){ // Se verifica si el Optional está vacío IsEmpty() devuelve true si el Optional no contiene un valor, y false si contiene un valor.
            System.out.println("El valor es vacio");
        }
        if (optionalString == null){ 
            System.out.println("El valor es nulo");
        }
        
    




    }
    
}

package SRC.optional;
import java.util.Optional;
public class ejercicio1 {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable(null);
        
        if (optionalString.isEmpty()){
            System.out.println("El valor es nulo");
        }
        if (optionalString == null){
            System.out.println("El valor es nulo");
        };

        
    




    }
    
}

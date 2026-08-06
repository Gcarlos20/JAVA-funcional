package SRC.referenciaMetdos;
import java.util.function.Function;
public class ejemplo1 {
    public static void main(String[]args){
        // se crea una referencia a un metodo estatico de la clase String
        // se crea un objeto de la interfaz funcional Function que toma un Integer y devuelve un String
        
        Function<Integer, String> convertidor = String::valueOf;
        String resultado = convertidor.apply(123);
        System.out.println("Resultado: " + resultado);





    }
    
}

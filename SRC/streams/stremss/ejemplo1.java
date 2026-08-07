package SRC.streams.stremss;
import java.util.ArrayList;
import java.util.List;
public class ejemplo1 {
    public static void main(String[] args) {
       
        // ejemplo de uso de streams en Java   operacion terminales y operaciones intermedias
        List<String> nombres = new ArrayList<>();
        nombres.add("Gabriel");
        nombres.add("Beto");
        nombres.add("Juan");
        nombres.add("Pedro");
        // se utiliza el metodo stream() para crear un flujo de datos a partir de la lista
        nombres.stream().forEach(System.out::println); // se utiliza el metodo forEach()



    }
    
}

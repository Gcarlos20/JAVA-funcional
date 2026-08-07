package SRC.streams.stremss;
import java.util.Arrays;
import java.util.List;
public class ejemplo2 {
    public static void main(String[] args) {
      // operacion intermedias ejemplo 2 

      List<String> Paises = Arrays .asList("Mexico", "Colombia", "Peru", "Argentina", "Chile", "Brasil",
                                            "Nueva Zelanda", "Australia", "Canada", "Estados Unidos"
      );
        
       Paises.stream() // aqui empiza la operacion intermedia de stream
                .filter(pais -> pais.toLowerCase().contains("a")) // se filtra los paises que contienen la letra "a"
        .forEach(System.out::println); // se imprime los paises que contienen la letra "a"

    }
    
}

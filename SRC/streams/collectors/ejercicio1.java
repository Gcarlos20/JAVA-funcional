 package SRC.streams.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class ejercicio1 {
public static void main(String[] args) {
    
    // collector.toList
    List<String> nombres = List.of( "hola", "alejo", "venavides", "caraxes", "vermithor");

    List<String> filtrados = nombres.stream()
        .filter(n -> n.contains("a"))
        .collect(Collectors.toList());

    System.out.println("Filtrados: " + filtrados);
    



}
    
}
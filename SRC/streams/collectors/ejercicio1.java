package SRC.streams.collectors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ejercicio1 {
    public static void main(String[] args) {
        // Ejemplo 1: Collectors.toList()
        List<String> nombres = List.of("hola", "alejo", "venavides", "caraxes", "vermithor");

        List<String> filtrados = nombres.stream()
            .filter(n -> n.contains("a"))
            .collect(Collectors.toList());

        System.out.println("Filtrados (toList): " + filtrados);

        // Ejemplo 2: Collectors.toSet()
        List<String> paises = List.of("Colombia", "Argentina", "Panama", "Puerto Rico", "Tunez");
        Set<String> filtrados2 = paises.stream()
            .filter(s -> s.toLowerCase().contains("a"))
            .collect(Collectors.toSet());

        System.out.println("Filtrados2 (toSet): " + filtrados2);

        // Ejemplo 3: Collectors.joining()
        String joined = filtrados.stream().collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);
    }
}


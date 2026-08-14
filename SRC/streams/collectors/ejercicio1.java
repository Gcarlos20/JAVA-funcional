package SRC.streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
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
            .filter(s -> s.toLowerCase().startsWith("p"))
            .collect(Collectors.toSet());

        System.out.println("Filtrados2 (toSet, startsWith 'p'): " + filtrados2);

        // Ejemplo 3: Collectors.joining()
        String joined = filtrados.stream()
            .collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);


        // Ejemplo 4: counting (uso correcto)
        List<String> estados = List.of("Dinamarca", "israel", "Checo", "Rusia", "Tunez");
        long cantidadPais = estados.stream()
            .filter(n -> n.startsWith("T"))
            .count();

        System.out.println("cantidad de paises con T: " + cantidadPais);


        // ejemplo 5 Collectors.PartitioningBy()7
        // partition sirve para separar grupos mediante una condicon
        List<Integer> numero = List.of(13,12,11,10,9,8,7,6,5,4,3,2,1,22);
        Map<Boolean,List<Integer>> mayoresEdada= numero.stream() 
        .collect(Collectors.partitioningBy(n -> n >= 19)); // condicion mas expresion lambda 
        System.out.println(mayoresEdada);

    }
}

         
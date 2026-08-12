package GestionAutosVentas;
import GestionAutosVentas.logica.auto;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class Main {
public static void main(String[]args){
    List<auto> ListaAutos = Arrays.asList(
        new auto("Toyota", "Corolla", 20000),
        new auto("Honda", "Civic", 22000),
        new auto("Ford", "Mustang", 30000),
        new auto("Chevrolet", "Camaro", 35000),
        new auto("Nissan", "Altima", 25000),
        new auto("Mazda", "3", 21000),
        new auto("Hyundai", "Elantra", 23000),
        new auto("Kia", "Optima", 24000),
        new auto("Volkswagen", "Jetta", 26000),
        new auto("Subaru", "Impreza", 27000),
        new auto("Tesla", "Model 3", 40000),
        new auto("BMW", "3 Series", 45000),
        new auto("Mercedes-Benz", "C-Class", 50000),
        new auto("Audi", "A4", 48000),
        new auto("Lexus", "IS", 47000),
        new auto("Jaguar", "XE", 52000),
        new auto("Porsche", "911", 90000),
        new auto("Ferrari","488", 250000),
        new auto("Lamborghtini", "Huracan", 300000)
    );

     // 1 ordenar de mayor a menor por costo
     List<auto> autosOrdenadosPorCosto = new ArrayList<auto>(ListaAutos);
     autosOrdenadosPorCosto.sort(Comparator.comparing(auto::getCosto));
     autosOrdenadosPorCosto.forEach( System.out::println); // se imprime la lista de autos ordenados por costo de mayor a menor
     
     // 2 Ordenar por marca y luego por precio utilizando sorted 
     ListaAutos.stream()
        .sorted(Comparator.comparing(auto::getMarca)
        .thenComparing(auto::getCosto))
        .forEach(System.out::println); // se imprime la lista de autos ordenados por
    
    // 3 Filtrar autos cuyo precio no supere los 30000 y mostrar solo la marca y el modelo
    ListaAutos.stream()
        .filter(auto -> auto.getCosto() <= 30000)
        .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo()));
    
    // 4 autos de marca "Tesla" o "BMW"
    ListaAutos.stream()
        .filter(auto->auto.getMarca().equals("Tesla") || auto.getMarca().equals("BMW"))
        .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getCosto()));
}


    
}

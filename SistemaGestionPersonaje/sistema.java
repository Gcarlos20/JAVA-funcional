package SistemaGestionPersonaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import SRC.clases.personaje;

public class sistema {
    
public static void main(String[] args) {
    
    // Lista de personajes - CREAR PRIMERO
    List<personaje> personajes = new ArrayList<>();
    personajes.add(new personaje("Thor", "dios trueno", 12, true));
    personajes.add(new personaje("Odin", "padre de todo", 13, false));
    personajes.add(new personaje("Zeus", "dios del rayo", 14, false));
    personajes.add(new personaje("Gea", "Titanide", 15, false));
    personajes.add(new personaje("Tifon", "divinidad", 16, true));
    personajes.add(new personaje("Cronos", "dios del tiempo", 17, true));
    personajes.add(new personaje("Hercule", "semi dios ", 3, true));
    personajes.add(new personaje("Akiles", "semi dios", 12, true));
    
    Scanner scanner = new Scanner(System.in);
    int opcion;

    // menu de personajes 
    do {
    System.out.println("==========Gestion de perosonajes =========");
    System.out.println("1. Mostrar todos");
    System.out.println("2. Mostrar personajes vivos");
    System.out.println("3. Mostrar personajes muertos");
    System.out.println("4. Buscar por tipo");
    System.out.println("5. Mostrar nombres");
    System.out.println("6. Ordenar por nombre");
    System.out.println("7. Contar personajes vivos");
    System.out.println("0. Salir");
    System.out.print("Seleccione una opción: ");

    opcion = scanner.nextInt();

        switch (opcion) {
            case 1: 
            System.out.println("Todos los Personajes");
                personajes.stream()
                .forEach(System.out::println);
                break;
            case 2:
            System.out.println("Personajes  vivos");
            personajes.stream()
            .filter(personaje -> personaje.getVivo())
            .forEach(System.out::println);
            break;

            case 3: 
            System.out.println("Personajes  Muertos");
            personajes.stream()
            .filter(personaje -> !personaje.getVivo())
            .forEach(System.out::println);
            break;
            
            case 4:
                System.out.println("Ingrese el Tipo De Personaje");
                scanner.nextLine(); // limpiar el bufer 
                  String tipo = scanner.nextLine();
                  personajes.parallelStream()
                  .filter(personaje-> personaje.getTipo().equalsIgnoreCase(tipo))
                  .forEach(System.out::println);
            break;

            case 5:
                System.out.println("Mostrando nombres nombres");
                personajes.stream()
                .map(personaje-> personaje.getNombre())
                .forEach(System.out::println);
            break;
            

            case 6:
                System.out.println("ordenar por nombres");
            break;
            case 7:
                System.out.println("contar personajes vivos");
                break;        
            default:
                System.out.println("Operacion no valida");
                break;
        }
    } while(opcion !=0);

 












    }


}

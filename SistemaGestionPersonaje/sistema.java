package SistemaGestionPersonaje;

import java.util.List;
import java.util.Scanner;

import SRC.clases.personaje;

public class sistema {
    
public static void main(String[] args) {
    
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
            System.out.println("Mostrar Todos los Personajes");
                
                break;
            case 2:
            System.out.println("Mostrar vivos");
            break;

            case 3: 
            System.out.println("Mostrar Muertos");
            break;
            
            case 4:
                System.out.println("Buscar Por tipos ");
            break;

            case 5:
                System.out.println("Mostrar nombres");

            case 6:
                System.out.println("ordenar por nombres");

            case 7:
                System.out.println("contar personajes vivos");        
            default:
                System.out.println("Operacion no valida");
                break;
        }
    




    } while(opcion !=0);


    // Lista de personajes 

    List <personaje> personajes = List.of();
    
     new personaje("Thor", "dios trueno", 12, true);
      new personaje("Odin", "padre de todo", 13, false);
       new personaje("Zeus", "dios del rayo", 14, false);
        new personaje("Gea", "Titanide", 15, false);
         new personaje("Tifon", "divinidad", 16, true);
          new personaje("Cronos", "dios del tiempo", 17, true);
           new personaje("Hercule", "semi dios ", 3, true);
            new personaje("Akiles", "semi dios", 12, true);

 












    }


}

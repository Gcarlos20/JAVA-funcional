package SRC.referenciaMetdos;

import java.util.function.BiFunction;

import SRC.clases.Animal;

public class Ejemplo2Constructor {
    public static void main(String[] args) {
        BiFunction<String, String, Animal> crearAnimal = Animal::new;

        Animal animal = crearAnimal.apply("Beto", "Perro");
        animal.mostrarInformacion();
    }
}

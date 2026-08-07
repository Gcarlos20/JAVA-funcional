package SRC.clases;

public class Animal {
    private final String nombre;
    private final String tipo;

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void mostrarInformacion() {
        System.out.println("Animal: " + nombre + ", tipo: " + tipo);
    }
}

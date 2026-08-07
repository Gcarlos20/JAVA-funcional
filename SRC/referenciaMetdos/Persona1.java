package SRC.referenciaMetdos;

import SRC.clases.Persona;

public class Persona1 {
    public static void main(String[] args) {
        Persona persona = new Persona("Gabriel", 25);
       Runnable saludo = persona::saludar; // referencia al metodo saludar de la clase Persona
        saludo.run(); // se llama al metodo saludar de la clase Persona
    }
}

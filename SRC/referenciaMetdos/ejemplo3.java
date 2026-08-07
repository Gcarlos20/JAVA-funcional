package SRC.referenciaMetdos;

import java.util.ArrayList;

public class ejemplo3 {

    public static void main(String[] args) {
    
        // referencia a un metodo de instancia de un objeto arbitrario de un tipo particular

        ArrayList<String> listaPersonas = new ArrayList<>();
        listaPersonas.add("Gabriel");
        listaPersonas.add("Beto");
        listaPersonas.add("Juan");
        listaPersonas.add("Pedro");        
        listaPersonas.forEach(System.out::println); // referencia al metodo println de la clase System


    }
    
}

package SRC.ClasesAnonimas;

import SRC.interfaceFuncionales.Carro;

public class ClaseCarro {
    public static void main(String[] args) {
        Carro carroAnonimo = new Carro() {
            @Override
            public void encender(String mensaje) {
                System.out.println("Clase anonima: " + mensaje);
            }
        };

        Carro carroLambda = mensaje -> System.out.println("Lambda: " + mensaje);

        carroAnonimo.encender("El carro esta encendido");
        carroLambda.encender("El carro esta encendido");
    }
}

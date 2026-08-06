package SRC.interfaceFuncionales;

// se crea una interfaz funcional que tiene un metodo abstracto llamado encender
@FunctionalInterface
public interface Carro {
    void encender(String mensaje); // metodo abstracto que recibe un mensaje y no devuelve nada
}

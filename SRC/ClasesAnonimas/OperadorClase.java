package SRC.ClasesAnonimas;

import SRC.interfaceFuncionales.Operador;

public class OperadorClase {
    public static void main(String[] args) {
        // se crea una clase anonima que implementa la interfaz Operador  y luego se crea el objeto
        Operador suma = new Operador() {
            @Override // se implementa el metodo operar de la interfaz Operador
            public int operar(int numero1, int numero2) {
                return numero1 + numero2;
            }
        };

        // se llama a la interfaz Operador y se implementa el metodo operar con una expresion lambda
        Operador multiplicacion = (numero1, numero2) -> numero1 * numero2;

        System.out.println("Suma: " + suma.operar(5, 3));
        System.out.println("Multiplicacion: " + multiplicacion.operar(5, 3));
    }
}

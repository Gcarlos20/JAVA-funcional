package SRC.ClasesAnonimas;

import SRC.interfaceFuncionales.Operador;

public class OperadorClase {
    public static void main(String[] args) {
        Operador suma = new Operador() {
            @Override
            public int operar(int numero1, int numero2) {
                return numero1 + numero2;
            }
        };

        Operador multiplicacion = (numero1, numero2) -> numero1 * numero2;

        System.out.println("Suma: " + suma.operar(5, 3));
        System.out.println("Multiplicacion: " + multiplicacion.operar(5, 3));
    }
}

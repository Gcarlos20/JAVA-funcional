package SRC.lambdas;

import SRC.interfaceFuncionales.Operador;

public class OpeLam {
    public static void main(String[] args) {
        // se llama a la interfaz Operador y se implementa el metodo operar con una expresion lambda
        Operador resta = (numero1, numero2) -> numero1 - numero2;
        Operador division = (numero1, numero2) -> numero1 / numero2;

        System.out.println("Resta: " + resta.operar(10, 4));
        System.out.println("Division: " + division.operar(20, 5));
    }
}

package GestionPaqueteria.logica;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import GestionPaqueteria.clases.Cliente;

public class Main {
    public static void main(String[] args) {
        List<Cliente> listaClientes = obtenerClientes();

        System.out.println("---------- bienvenido al sistema----------------------");
        System.out.println("Ingrese el numero de cliente a enviar un paquete");
        Scanner teclado = new Scanner(System.in);
        long numero = teclado.nextLong();

        Cliente cliente = buscarCliente(listaClientes, numero);

        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente.getNombre() + " " + cliente.getApellido());
        } else {
            System.out.println("Cliente no encontrado.");
        }
        teclado.close();
    }

    private static List<Cliente> obtenerClientes() {
        return Arrays.asList(
            new Cliente(1, "Juan", "Perez", "Calle 10", "3001234567"),
            new Cliente(2, "Ana", "Gomez", null, "3107654321"),
            new Cliente(3, "Luis", "Martinez", "Avenida 30", "3209876543"),
            new Cliente(4, "Pedro", "Lopez", "Calle 20", "3211111111"),
            new Cliente(5, "Sofia", "Diaz", null, "3222222222")
        );
    }

    private static Cliente buscarCliente(List<Cliente> lista, long numero) {
        for (Cliente c : lista) {
            if (c.getNro_cliente() == numero) {
                return c;
            }
        }
        return null;
    }
}

package inventario;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * Sistema de Inventario - Programación Funcional en Java
 * Demuestra operaciones intermedias de Streams: filter, map, sorted, peek
 * y operaciones terminales: reduce, collect, findFirst, anyMatch, allMatch
 */
public class sistemaFuncional {

    // ----- Record (dato inmutable) -----
    record Producto(int id, String nombre, String categoria, double precio, int stock) {
        Producto conDescuento(double pct) {
            return new Producto(id, nombre, categoria, precio * (1 - pct), stock);
        }
    }

    public static void main(String[] args) {

        List<Producto> productos = List.of(
            new Producto(1, "Laptop",     "Tecnología", 1200, 5),
            new Producto(2, "Mouse",      "Tecnología", 25,   50),
            new Producto(3, "Silla",      "Muebles",    150,  0),
            new Producto(4, "Escritorio", "Muebles",    300,  8),
            new Producto(5, "Monitor",    "Tecnología", 220,  12),
            new Producto(6, "Lámpara",    "Hogar",      35,   20)
        );

        // ----- Predicados y funciones reutilizables -----
        Predicate<Producto> conStock = p -> p.stock() > 0;
        Function<String, Predicate<Producto>> porCategoria =
            cat -> p -> p.categoria().equals(cat);

        // 1) filter -> filter -> map -> sorted: tecnología con stock, 10% dcto, ordenado por precio
        List<Producto> tecnologiaConDescuento = productos.stream()
            .filter(conStock)
            .filter(porCategoria.apply("Tecnología"))
            .map(p -> p.conDescuento(0.10))
            .sorted(Comparator.comparingDouble(Producto::precio))
            .collect(Collectors.toList());

        // 2) reduce: valor total del inventario
        double valorTotalInventario = productos.stream()
            .reduce(0.0, (acc, p) -> acc + p.precio() * p.stock(), Double::sum);

        // 3) findFirst: primer producto sin stock
        Optional<Producto> primerAgotado = productos.stream()
            .filter(p -> p.stock() == 0)
            .findFirst();

        // 4) anyMatch / allMatch: condiciones globales
        boolean hayProductosCaros = productos.stream()
            .anyMatch(p -> p.precio() > 1000);

        boolean todosTienenNombre = productos.stream()
            .allMatch(p -> !p.nombre().isEmpty());

        // 5) groupingBy + summingDouble: total por categoría (collector)
        Map<String, Double> totalPorCategoria = productos.stream()
            .collect(Collectors.groupingBy(
                Producto::categoria,
                Collectors.summingDouble(p -> p.precio() * p.stock())
            ));

        // ----- Salida -----
        System.out.println("Tecnología con descuento (ordenado):");
        tecnologiaConDescuento.forEach(p ->
            System.out.printf("  %s -> $%.2f%n", p.nombre(), p.precio()));

        System.out.printf("Valor total del inventario: $%.2f%n", valorTotalInventario);
        System.out.println("Primer producto agotado: " +
            primerAgotado.map(Producto::nombre).orElse("Ninguno"));
        System.out.println("¿Hay productos caros (>1000)?: " + hayProductosCaros);
        System.out.println("¿Todos tienen nombre?: " + todosTienenNombre);
        System.out.println("Total por categoría: " + totalPorCategoria);
    }
}

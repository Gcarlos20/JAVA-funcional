package SistemaNominas;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
 
/**
 * Sistema de Nómina - Programación Funcional en Java
 * Demuestra operaciones intermedias de Streams: filter, map, sorted, distinct
 * y operaciones terminales: reduce, collect, findFirst, anyMatch, allMatch,
 * groupingBy, partitioningBy, averagingDouble
 */
class SistemaDeNomina {
 
    // ----- Record (dato inmutable) -----
    record Empleado(int id, String nombre, String departamento, double salario, int antiguedad) {
        Empleado conAumento(double pct) {
            return new Empleado(id, nombre, departamento, salario * (1 + pct), antiguedad);
        }
    }
 
    public static void main(String[] args) {
 
        List<Empleado> empleados = List.of(
            new Empleado(1, "Ana Torres",   "Tecnología", 2800, 4),
            new Empleado(2, "Luis Pérez",   "Ventas",     1800, 1),
            new Empleado(3, "Marta Ruiz",   "Tecnología", 3200, 7),
            new Empleado(4, "Carlos Díaz",  "Recursos Humanos", 2100, 3),
            new Empleado(5, "Elena Gómez",  "Ventas",     1950, 6),
            new Empleado(6, "Jorge Salas",  "Tecnología", 2600, 2)
        );
 
        // ----- Predicados y funciones reutilizables -----
        Predicate<Empleado> senior = e -> e.antiguedad() >= 5;
        Function<String, Predicate<Empleado>> porDepartamento =
            dep -> e -> e.departamento().equals(dep);
 
        // 1) filter -> map -> sorted: empleados senior de Tecnología con 8% de aumento, ordenados por salario
        List<Empleado> senioresConAumento = empleados.stream()
            .filter(senior)
            .filter(porDepartamento.apply("Tecnología"))
            .map(e -> e.conAumento(0.08))
            .sorted(Comparator.comparingDouble(Empleado::salario).reversed())
            .collect(Collectors.toList());
 
        // 2) reduce: costo total de nómina
        double costoTotalNomina = empleados.stream()
            .reduce(0.0, (acc, e) -> acc + e.salario(), Double::sum);
 
        // 3) findFirst: primer empleado con menos de 2 años de antigüedad
        Optional<Empleado> primerNuevo = empleados.stream()
            .filter(e -> e.antiguedad() < 2)
            .findFirst();
 
        // 4) anyMatch / allMatch: condiciones globales
        boolean haySalariosAltos = empleados.stream()
            .anyMatch(e -> e.salario() > 3000);
 
        boolean todosSuperanMinimo = empleados.stream()
            .allMatch(e -> e.salario() >= 1500);
 
        // 5) groupingBy + averagingDouble: salario promedio por departamento
        Map<String, Double> salarioPromedioPorDepto = empleados.stream()
            .collect(Collectors.groupingBy(
                Empleado::departamento,
                Collectors.averagingDouble(Empleado::salario)
            ));
 
        // 6) partitioningBy: separa empleados en senior / junior
        Map<Boolean, List<Empleado>> senioresYJuniors = empleados.stream()
            .collect(Collectors.partitioningBy(senior));
 
        // 7) distinct + map: lista de departamentos únicos
        List<String> departamentos = empleados.stream()
            .map(Empleado::departamento)
            .distinct()
            .sorted()
            .collect(Collectors.toList());
 
        // ----- Salida -----
        System.out.println("Senior de Tecnología con aumento (por salario desc):");
        senioresConAumento.forEach(e ->
            System.out.printf("  %s -> $%.2f%n", e.nombre(), e.salario()));
 
        System.out.printf("Costo total de nómina: $%.2f%n", costoTotalNomina);
        System.out.println("Primer empleado nuevo (<2 años): " +
            primerNuevo.map(Empleado::nombre).orElse("Ninguno"));
        System.out.println("¿Hay salarios altos (>3000)?: " + haySalariosAltos);
        System.out.println("¿Todos superan el mínimo (1500)?: " + todosSuperanMinimo);
        System.out.println("Salario promedio por departamento: " + salarioPromedioPorDepto);
        System.out.println("Cantidad senior: " + senioresYJuniors.get(true).size());
        System.out.println("Cantidad junior: " + senioresYJuniors.get(false).size());
        System.out.println("Departamentos: " + departamentos);
    }
}
 

    

 package GestorProdutosSuperMar.Logica;
import GestorProdutosSuperMar.clase.ProductoA1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



public class Productos {
    public static void main(String[] args) {
    List<ProductoA1> productos = Arrays.asList(
        new ProductoA1("Manzana", "Fruta", 10, 2500),
        new ProductoA1("Plátano", "Fruta", 15, 1500),
        new ProductoA1("Leche", "Lácteos", 20, 3000),
        new ProductoA1("Pan", "Panadería", 30, 2000),
        new ProductoA1("Huevos", "Lácteos", 25, 4000),
        new ProductoA1("Arroz", "Granos", 50, 1800),
        new ProductoA1("Aceite", "Aceites", 12, 5000),
        new ProductoA1("Sal", "Condimentos", 40, 800),
        new ProductoA1("Azúcar", "Condimentos", 35, 2200),
        new ProductoA1("Café", "Bebidas", 18, 8000)
    );

    // filtrar productos de la categoria frutas 
    List<ProductoA1> frutas = productos.stream()
        .filter(p -> p.getCategoria().equals("Fruta"))
        .collect(Collectors.toList());
        System.out.println("Productos que son Frutas  " + frutas);
    
    // calcular el precio de productos en lacteos 
    int lacteosTotal = productos.stream()
        .filter(p -> p.getCategoria().equals("Lácteos"))
        .mapToInt(ProductoA1::getPrecio)
        .sum();
    System.out.println("Total precio de Lácteos: " + lacteosTotal);

    // obtener precio mas bajo 
    Optional<ProductoA1> productoMasBajo = productos.stream()
        .min(Comparator.comparing(ProductoA1::getPrecio));   
         System.out.println("Producto más barato: " + productoMasBajo);

    // agrupar productos por categoria 
     
    Map<String, List<ProductoA1>> productosPorCategoria = productos.stream()
    .collect(Collectors.groupingBy(ProductoA1::getCategoria));
    System.out.println("\n Productos Agrupados Por Categoria " + productosPorCategoria);
     
    // calcular es precio promedio de los productos por categoria
    Map<String, Double> promedioPorCategoria = productos.parallelStream()
    .collect(Collectors.groupingBy(
        ProductoA1::getCategoria,
        Collectors.averagingDouble(ProductoA1::getPrecio)));
    System.out.println("Promedio por categoria: " + promedioPorCategoria);

    
    // obtener la categoria con el precio promedio mas alto 
    String categoriaMasCara = promedioPorCategoria.entrySet().parallelStream()
    .max(Comparator.comparingDouble(Map.Entry::getValue))
    .map(Map.Entry::getKey)
    .orElse("no disponible");
    System.out.println("Categoría con el precio promedio más alto: " + categoriaMasCara);
    
        
    }
}


    


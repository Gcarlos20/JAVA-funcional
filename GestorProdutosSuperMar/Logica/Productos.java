package GestorProdutosSuperMar.Logica;
import GestorProdutosSuperMar.clase.ProductoA1;
import java.util.Arrays;
import java.util.List;
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
    
    
        
    }
}


    


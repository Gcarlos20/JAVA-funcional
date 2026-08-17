package GestorProdutosSuperMar.clase;

public class ProductoA1 {
    private String nombre;
    private String categoria;
    private int cantidad;
    private int precio;
    
    public ProductoA1 (String nombre,String categoria,int cantidad,int precio)
    {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public String getNombre (){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getCategoria (){
        return categoria;
    }
      public void setCategoria (String categoria){
        this.nombre = categoria;
    }

    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public int getPrecio (){
        return precio;
    }
    public void setPrecio (int precio){
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "\n ProductoA1{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }







}

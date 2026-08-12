package GestionAutosVentas.logica;

public class auto {
    private String marca;
    private String modelo;
    private double costo;
    
    public auto(){

    }
    public auto (String marca, String modelo, double costo){
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
 // este metodo toString() se utiliza para mostrar la informacion del objeto auto en forma de cadena de texto
    @Override // para sobrescribir el metodo toString() de la clase Object
    public String toString() {
        return "auto [marca=" + marca + ", modelo=" + modelo + ", costo=" + costo + "]";
    }
}
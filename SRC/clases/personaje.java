package SRC.clases;
public class personaje{
    
    private String nombre;
    private String tipo;
    private int id;
    private boolean prestado;
    
public personaje(String nombre, String tipo, int id, boolean prestado){
    this.nombre = nombre;
    this.tipo = tipo;
    this.id =  id;
    this.prestado = prestado;
}

public String getNombre(){
    return nombre;
}

public void setNombre (String nombre){
    this.nombre = nombre;
} 

public String getTipo(){
    return tipo;
}

public void setTipo(String tipo){
    this.tipo = tipo;
}

public int getId(){
    return id;
}
public void setIt(int id){
    this.id = id;
}

public boolean getPrestado(){
    return prestado;
}
public void setPrestado(){
    this.prestado = prestado;
} 

 


}
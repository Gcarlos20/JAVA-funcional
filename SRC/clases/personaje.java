package SRC.clases;
public class personaje{
    
    private String nombre;
    private String tipo;
    private int id;
    private boolean vivo;
    
public personaje(String nombre, String tipo, int id, boolean vivo){
    this.nombre = nombre;
    this.tipo = tipo;
    this.id =  id;
    this.vivo = vivo;
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

public boolean getVivo(){
    return vivo;
}
public void setVivo(){
    this.vivo = vivo;
} 

@Override
public String toString(){

    return  "Nombre " + nombre  +
            "Tip" + tipo +
            "Id" + id +
            "Vivo " + vivo; 
}
 


}

package interfaces;


public class Empleadon {
    
    public int id=120;
    public int edad=34;
    String nombre="Oswaldo";
    
    public Empleadon(){
    
    }
    
    public Empleadon (int id,int edad,String nombre){
        this.id = id;
        this.edad=edad;
        this.nombre = nombre;
    }
    
    public int getId(){
    return id;
    }
    
    public int getEdad(){
    return edad;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    
}

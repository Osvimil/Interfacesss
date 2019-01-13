/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author oswaldosaldivar
 */
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

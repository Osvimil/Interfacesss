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
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gerenton gerente = new Gerenton(1200,22,"Alfonso");
        Empleadon empleado = new Empleadon();
        
        System.out.println(empleado.getEdad());
        System.out.println(empleado.getId());
        System.out.println(empleado.getNombre());
        
        gerente.diarrea();
        gerente.tos();
        
        System.out.println("La edad es: "+gerente.edad);
        System.out.println("El id es: "+gerente.id);
        System.out.println("El nombre es: "+gerente.nombre);
        
        
    }
    
}

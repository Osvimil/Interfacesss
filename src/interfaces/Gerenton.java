
package interfaces;


public class Gerenton extends Empleadon implements Enfermedad {
    
    public Gerenton(int id,int edad,String nombre){
    super(122,21,"Oswaldo");
    }
    
    
    public void tos(){
        System.out.println("tengo tos");
    }
    public void diarrea(){
        System.out.println("tengo diarrea");
    }
    
}

/*
 *USO BASICO DE LISTAS EN JAVA
 *https://www.youtube.com/watch?v=yHFacwFar0A
 */
package company_youtube;
import company_youtube.entity.Persona;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nefij
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
        List<Persona> lis_persona = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
        Persona per = new Persona();
        per.setCodigo(1);
        per.setNombre("Walter " + i);
        per.setApellido("Apellido " + i);
        per.setEdad(25 + i);
        lis_persona.add(per);
     } 
        System.out.println("Tamaño de Lista: " + lis_persona.size());
        
        for(Persona p: lis_persona){
            System.out.println("Codigo: " + p.getCodigo());
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido: " + p.getApellido());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("-----------------------------------------");
        }
    }
    
}

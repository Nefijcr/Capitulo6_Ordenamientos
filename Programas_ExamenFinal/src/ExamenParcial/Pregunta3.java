package ExamenParcial;
 
import java.util.Scanner;
/**
 *
 * @author nefij
 */
public class Pregunta3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
        System.out.print("PROGRAMA QUE CALCULA EL VOLUMEN DE UNA ESFERA \n");
        System.out.print("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
        Scanner sc = new Scanner(System.in);
        int radio;
        System.out.print("Introduzca el radio de la esfera: ");
        radio = sc.nextInt();
        System.out.println("El volumen de la esfera de radio " + radio + " es = " + (4.0/3)* Math.PI * Math.pow(radio, 3));  
    }
}
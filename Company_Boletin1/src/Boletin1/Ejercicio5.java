/*
 * Pedir un número e indicar si es positivo o negativo.
 */
package Boletin1;
import java.util.Scanner;
/**
 *
 * @author nefij
 */
public class Ejercicio5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS        
        int num;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num = Entrada.nextInt();
        if (num < 0) {
            System.out.println("Negativo");
        } else 
        {// suponemos que el 0 es positivo.
            System.out.println("Positivo");
        }
    }

}
    
    

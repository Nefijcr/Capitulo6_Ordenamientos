/*
 * Pedir el radio de una circunferencia y calcular su longitud.
 */
package Boletin1;
import java.util.Scanner;
/**
 *
 * @author nefij
 */
public class Ejercicio3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
        double l, r; // longitud y radio
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduce el radio de una circunferencia: ");
       
        r = Entrada.nextFloat();
        l = 2 * Math.PI * r;
        System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
    }

}


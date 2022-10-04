/*
 * Pedir dos numeros y decir si uno es multiplo del otro.  
 */
package Boletin1;
import java.util.Scanner;
/**
 *
 * @author nefij
 */
public class Ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n1 = Entrada.nextInt();
        System.out.print("Introduce otro numero: ");
        int n2 = Entrada.nextInt();
        if (n1 % n2==0) {
            System.out.println("Son multiplos");
        } else {
            System.out.println("No son multiplos");
        }
    }

}
/*
 *Pedir dos numeros y decir cual es el mayor o si son iguales.
 */
package Boletin1;
import java.util.Scanner;
/**
 *
 * @author nefij
 */
public class Ejercicio8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
        int n1, n2;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        n1 = Entrada.nextInt();
        System.out.print("Introduce otro numero: ");
        n2 = Entrada.nextInt();
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " es mayor que " + n2);
            } else {
                System.out.println(n2 + " es mayor que " + n1);
            }
        }

    }
}
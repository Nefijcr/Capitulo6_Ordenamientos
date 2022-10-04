/*
 * Pedir dos numeros y decir cual es el mayor.
 */
package Boletin1;
import java.util.Scanner;
/**
 *
 * @author nefij
 */
public class Ejercicio7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
        Scanner Entrada = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduce un numero: ");
        n1 = Entrada.nextInt();
        System.out.print("Introduce otro numero: ");
        n2 = Entrada.nextInt();
        // si ambos números son iguales diría que n2 es mayor que n1
        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else {
            System.out.println(n2 + " es mayor que " + n1);
        }
    }

}
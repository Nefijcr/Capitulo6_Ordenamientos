/*
 * Pedir tres numeros y mostrarlos ordenados de mayor a menor  
 */
package Boletin1;
import java.util.Scanner;
/**
 *
 * @author nefij
 */
public class Ejercicio_10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
    int a, b, c;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduzca primer numero: ");
        a = Entrada.nextInt();
        System.out.print("Introduzca segundo numero: ");
        b = Entrada.nextInt();
        System.out.print("Introduzca tercer numero: ");
        c = Entrada.nextInt();
        if (a > b && b > c) {
            System.out.println(a + ", " + b + ", " + c);
        } else {
            if (a > c && c > b) {
                System.out.println(a + ", " + c + ", " + b);
            } else {
                if (b > a && a > c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    if (b > c && c > a) {
                        System.out.println(b + ", " + c + ", " + a);
                    } else {
                        if (c > a && a > b) {
                            System.out.println(c + ", " + a + ", " + b);
                        } else {
                            if (c > b && b > a) {
                                System.out.println(c + ", " + b + ", " + a);
                            }
                        }

                    }
                }
            }
        }
    }
}

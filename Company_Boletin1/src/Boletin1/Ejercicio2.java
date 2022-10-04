/*
 * Pedir el radio de un circulo y calcular su area. 
    A=PI*r^2.
 */
package Boletin1;
import java.util.Scanner;
/**
 *
 * @author nefij
 */
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       // NEFI JORGE CRUZADO CHUCOS
        double a, r; // area y radio
        Scanner Entrada = new Scanner(System.in);
     try{
        System.out.print("Introduce el radio de un circulo: ");
        r = Entrada.nextFloat();
        a = Math.PI*(r*r);//para elevar al cuadrado otra opcion es:math.pow(r,2)
        System.out.println("El area de una circunferencia de radio " + r + " es: " + a);
    }catch(Exception e){
        System.out.println("Error:"+e);
    }
   }
}

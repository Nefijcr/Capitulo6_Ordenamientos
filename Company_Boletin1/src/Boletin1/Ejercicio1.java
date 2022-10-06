/*
 * Pedir los coeficientes de una ecuacion de 2° grado, y muestre sus soluciones reales. 
Si no existen, debe indicarlo.
 */
package Boletin1;
import java.util.Scanner;
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
        double a, b, c; // coeficientes ax^2+bx+c=0
        double x1, x2, d; // soluciones y determinante
        Scanner Entrada = new Scanner(System.in);
        do{
        System.out.println("Introduzca primer coeficiente (a):");
        a = Entrada.nextInt();
        if(a==0){
        System.out.println("A no puede ser cero");
        }
        }while(a==0);
        System.out.println("Introduzca segundo coeficiente: (b):");
        b = Entrada.nextInt();
        System.out.println("Introduzca tercer coeficiente: (c):");
        c = Entrada.nextInt();
// calculamos el determinante
     d=((b*b)-4*a*c);            
     if(d<0){
           System.out.println("no existen soluciones reales");
       }else{       
// queda confirmar que a sea distinto de 0.
// si a=0 nos encontramos una división por cero.
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 Solucion: " + x1);
            System.out.println("x2 Solucion: " + x2);
        }
         
     }
}


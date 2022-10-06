/*
 * Ingresar por teclado 5 notas y mostrar el promedio.
 */
package Practica;
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
        Scanner dato=new Scanner(System.in);
        float notas[]=new float[6]; int con=1;
        float promedio,sum=0;
        while(con<6) {
        System.out.println("Ingrese la " + con + "° nota : "); 
        notas[con]=dato.nextFloat();
        sum=sum+notas[con]; con++;
        }
        promedio=sum/5;
        System.out.println("El promedio es : "+promedio );
        }
    }
    


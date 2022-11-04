package ExamenParcial;

import java.util.Scanner;

/**
 *
 * @author nefij
 */
public class Pregunta2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
    System.out.println("PROGRAMA QUE CALCULA EL AREA DE UN TRIANGULO ISOSCELES");
    Scanner objeto =new Scanner (System.in);
    //AREA
    System.out.println("_-_-_-_-_-_-_-_-_-_");
    System.out.println("       AREA");
    System.out.println("_-_-_-_-_-_-_-_-_-_");
    //VARIABLES
    int b,h,A;
    System.out.print("ingrese la Base: ");
    b=objeto.nextInt();
    System.out.print("ingrese la Altura: ");
    h=objeto.nextInt();
    //PROCESO
    A=(b*h)/2;
    //SALIDA
    System.out.println("\n"+"EL AREA DEL TRIANGULO ISOSCELES ES: "+A);
    }
}

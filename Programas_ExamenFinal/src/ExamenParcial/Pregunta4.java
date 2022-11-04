package ExamenParcial;

import java.util.Scanner;

/**
 *
 * @author nefij
 */
public class Pregunta4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
       float n,s=0,x;
        float p;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros desea promediar?");
        n=teclado.nextFloat();
   
        for(int i=1;i<=n;i++)
        { 
        System.out.println("Numero["+i+"]= ");
         x=teclado.nextFloat();
         s=s+x;                
        }   
        p= s/n;
        System.out.println("El Promedio es: " +p);                               
    }   
}
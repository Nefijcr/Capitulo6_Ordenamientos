/*
 *  Ingresar 10 nÃºmeros enteros y mostrar los nÃºmeros pares.
 */
package Practica;
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
        Scanner dato=new Scanner(System.in);
        int par[]=new int[10];
        int valor[]=new int[10];
        int contador=0;
        int i;
        System.out.println("Ingrese los 10 numeros a evaluar");
        for( i=0;i<10;i++){
        par[i]=dato.nextInt();
        if(par[i]%2==0) {
        valor[contador]=par[i];  
        contador++;
        }    
        }
        System.out.println("los numeros pares son : " );
        for( i=0;i<contador;i++) {
            System.out.println(valor[i]);
        }
        }
    }
    


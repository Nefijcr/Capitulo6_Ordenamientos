/*
 *Ingresar por teclado n cantidad de números y ordenarlos en forma ascendente. 
 */
package Practica;
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
    Scanner dato = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de numeros : "); 
    int elementos = dato.nextInt(); 
    int[] n = new int[elementos];
    System.out.println("Ingrese los numeros a ordenar : ");
    for(int a = 0; a < n.length; a++) { 
    n[a] = dato.nextInt();
    } 
    int orden = 0; for(int b = 1; b < n.length; b++) {
    for(int c = 0; c < n.length - b; c++) {
    if(n[c] > n[c+1]) {
    orden = n[c]; n[c] = n[c+1]; n[c+1] = orden;
        } 
    } 
} 
    System.out.print("Ordenados de forma ascendente: ");
    System.out.print("\n");
    for(int i = 0; i <n.length; i++) { 
    
    System.out.print( n[i] + ", ");
        } 
    }
 }
    


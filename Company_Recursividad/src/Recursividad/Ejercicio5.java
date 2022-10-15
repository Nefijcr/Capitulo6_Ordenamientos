/*
 *Crea un método que obtenga el factorial de un número N. Se debe pasar como parámetro el número N 
 */
package Recursividad;
/**
 *
 * @author nefij
 */
public class Ejercicio5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
        //obtier factorial de n
    int n = 4;
    System.out.println(n+"! = "+fact(n));
}
//método que devuelve el factorial de n
//ejemplo: n = 4 -> 4x3x2x1
static int fact(int n)
{
    if(n>1) return n * fact(n-1);
    else return 1;
}
        
    }     
        


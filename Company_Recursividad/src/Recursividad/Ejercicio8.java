/*
 * Crea un método que dado un número, lo imprima invertido por pantalla
 */
package Recursividad;
/**
 *
 * @author nefij
 */
public class Ejercicio8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
     //numero a invertir
    int n = 1234;
    inv(n);
}
//método que dado un número, lo imprime por pantalla invertido
//ejemplo: n = 1234 -> 4321
static void inv(int n)
{
    if(n<10) System.out.print(n);
    else
    {
        System.out.print(n%10);
        inv(n/10);
            }
        }        
    }     
    
    


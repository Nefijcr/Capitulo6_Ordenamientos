/*
 *Crea un método que compruebe si un número es binario. Un número binario está formado únicamente por ceros y unos 
 */
package Recursividad;
/**
 *
 * @author nefij
 */
public class Ejercicio_14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
  //valor del número analizado
    int num = 1001010;
    if(enBinario(num)) System.out.println("El número está en binario");
    else System.out.println("El número no está en binario");
}
//método que comprueba si n está en binario
//ejemplo: n = 101011 -> true
static boolean enBinario(int n)
{
    if(n>9)
    {
        if(n%10==0 || n%10==1) return enBinario(n/10);
        else return false;
    }
    else if(n==0 || n==1) return true;
    else return false;
}      
        
    }     
    
    


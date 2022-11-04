package ExamenParcial;

import java.util.Scanner;

/**
 *
 * @author nefij
 */
public class Pregunta1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
       Scanner sc = new Scanner(System.in);
       System.out.print("PROGRAMA QUE CALCULA LA SERIE DE FIBONACCI\n");
       System.out.print("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
        int numero,fibo1,fibo2,i;
          do{
            System.out.print("Cuanto numeros desea generar?\n");
            numero = sc.nextInt();
        }while(numero<=1);
  
        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + ", ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + ", ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
package ExamenParcial;
import java.util.Scanner;
/**
 *
 * @author nefij
 */
public class Pregunta5{
    /**
     * @param args the command line arguments
     */
public static double diferenciaKilovatios(double lecturaPresente, double lecturaPasada) {
return lecturaPresente - lecturaPasada;
} 
// NEFI JORGE CRUZADO CHUCOS
    public static double importeDeLuz(double lecturaPresente, double lecturaPasada) {
        double costoPorConsumo = diferenciaKilovatios(lecturaPresente, lecturaPasada) * 3.5;
        return costoPorConsumo + 100;
    }
    public static void main(String[] args) {
        System.out.println("PROGRAMA QUE REALICE UN RECIBO DE CONSUMO DE ELECTRICIDAD");
        System.out.print("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la lectura presente: ");
        double lecturaPresente = sc.nextDouble();
        System.out.println("Ingresa la lectura pasada: ");
        double lecturaPasada = sc.nextDouble();
        double consumo = diferenciaKilovatios(lecturaPresente, lecturaPasada);
        double importe = importeDeLuz(lecturaPresente, lecturaPasada);
        System.out.println("Consumo: " + consumo + " Kilovatios " + " Importe: " + importe);
    }
}

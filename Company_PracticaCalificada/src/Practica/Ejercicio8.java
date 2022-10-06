/*
 * Un cliente realiza la siguiente compra de artefactos, plancha,
licuadora, lavadora y cocina, si la compra supera los 1200, recibe un descuento
de 17 %, mostrar el precio de cada artefacto, así como el monto, el descuento y 
el pago total si le corresponde un descuento. 
 */
package Practica;
import java.util.Scanner;
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
Scanner lector=new Scanner(System.in);
        double descuento = 0;
        double montototal = 0;
        double venta = 0;    
        double compra;
        System.out.println("Ingrese el monto de la compra: ");
    venta = lector.nextDouble();
        if (venta >= 1200) {
            descuento = venta * 17 / 100;
        } else {
            if (venta >= 5000) {
                descuento = venta * .10;
            } else {
                if (venta < 5000) {
                    descuento = 0;
                }
            }
        }
    String productos[] = {"Artefactos   ", "Plancha      ", "Licuadora    ", "Lavadora     ", "Cocina       "};
        double precios[] = {240.0, 370.0, 180.0, 250.0, 165.0};
        System.out.println("\n"+"PRODUCTOS    PRECIOS");
        System.out.println("---------    ------- ");
        double pp=(precios[0]+precios[1]+precios[2])/3;
        for (int s=0;s<productos.length;s++){
            System.out.println(productos[s] + " "+precios[s]);  } 
                 
        System.out.println("\n"+"El monto de la compra es de: " + venta);
        System.out.println("El descuento es de: " + descuento);
        montototal = venta - descuento;
        System.out.println("El monto total a pagar es de: " + montototal);
    }
}

 
    
    
        

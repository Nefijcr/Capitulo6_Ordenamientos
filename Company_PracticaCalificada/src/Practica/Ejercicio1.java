/*
 * Empleando arreglos, mostrar n productos con sus respectivos precios.
 */
package Practica;
/**
 *
 * @author nefij
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
        String utiles []={"pelota", "zapatilla","mochila","polo"};
        double precios[]={35.5,89.60,45.99,25.70};
        System.out.println("Lista de Productos y sus precios");
        for (int u=0;u<utiles.length;u++){
        System.out.println(utiles[u]+ " "+ precios[u]);
        }
    }
    
}

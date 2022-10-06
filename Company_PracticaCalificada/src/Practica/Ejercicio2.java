/*
 * En un arreglo, mostrar los datos de un usuario (nombre, edad y sexo).
 */
package Practica;
/**
 *
 * @author nefij
 */
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEFI JORGE CRUZADO CHUCOS
        String nombres []={"Victor  ", "Ronald  ","Carolina","Paola   "};
        int edad []={25,30,19,22}; 
        char sexo []={'M','M','M','F'};
        System.out.println("Datos de los usuarios"); 
        System.out.println("NOMBRES EDAD SEXO");
        System.out.println("------- ---- ----");
        for (int u=0;u<nombres.length;u++){
        System.out.println(nombres[u]+ " "+ edad[u] + "   " + sexo[u]);
    }
        }
    }
    



package PracticaCalificada1;

/**
 *
 * @author nefij
 */
public class Alumno {
//NEFI JORGE CRUZADO CHUCOS
private String nombre;
private double nota;

public Alumno(String nombre, double nota) {
this.nombre = nombre;
this.nota = nota;
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public double getNota() {
return nota;
}

public void setNota(double nota) {
this.nota = nota;
}
}
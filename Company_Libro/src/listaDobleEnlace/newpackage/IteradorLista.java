package listaDobleEnlace.newpackage;
// archivo con la clase IteradorLista de visibilidad public
//NEFI JORGE CRUZADO CHUCOS
public class IteradorLista
{
private Nodo actual;
public IteradorLista(ListaDoble ld)
{
actual = ld.cabeza;
}
public Nodo siguiente()
{
Nodo a;
a = actual;
if (actual != null)
{
actual = actual.adelante;
}
return a;
}
}
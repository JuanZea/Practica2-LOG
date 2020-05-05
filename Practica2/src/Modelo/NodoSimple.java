package Modelo;

/**
 * Esta clase representa un nodo simple.
 * @author JuanZea
 * @version 1.0
 */
public class NodoSimple {
    private int dato;
    private NodoSimple liga;
    
    public NodoSimple(int pDato) {
        dato = pDato;
        liga = null;
    }

    public int retornaDato() {
        return dato;
    }

    public NodoSimple retornaLiga() {
        return liga;
    }

    public void asignaDato(int pDato) {
        dato = pDato;
    }

    public void asignaLiga(NodoSimple pLiga) {
        liga = pLiga;
    }
}

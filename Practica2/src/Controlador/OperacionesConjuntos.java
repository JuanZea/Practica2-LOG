/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.LSLC;
import Modelo.NodoSimple;

/**
 *
 * @author JuanZea
 */
public class OperacionesConjuntos {

    public static LSLC unir(LSLC a, LSLC b, LSLC c, LSLC d) {
        LSLC lslcZ = new LSLC();
        for (int i = 0; i < a.tamanno(); i++) {
                lslcZ.insertar(a.get(i), null);
        }
        for (int i = 0; i < b.tamanno(); i++) {
                lslcZ.insertar(b.get(i), null);
        }
        for (int i = 0; i < c.tamanno(); i++) {
            if (!pertenece(b, c.get(i))) {
                lslcZ.insertar(c.get(i), null);
            }
        }
        for (int i = 0; i < d.tamanno(); i++) {
            if (!pertenece(c, d.get(i)) && !pertenece(b, d.get(i))) {
                lslcZ.insertar(d.get(i), null);
            }
        }
        return lslcZ;
    }

    public static boolean pertenece(LSLC l, int dato) {
        NodoSimple x = l.buscarDato(dato, null);
        return x != null;
    }
    
    public static void diferencia(LSLC a,LSLC b) {
        
    }

    public static void intersectar(LSLC a, LSLC b) {
        LSLC x = new LSLC();
        System.out.println(a.tamanno() + " y " + b.tamanno());
        NodoSimple p, s;
        p = a.primerNodo();
        s = b.primerNodo();

    }

    public static void intersectar(LSLC a, LSLC b, LSLC c) {

    }
}

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

    public static LSLC unir(LSLC a, LSLC b) {
        LSLC lslcZ = new LSLC();
        for (int i = 0; i < a.tamanno(); i++) {
            lslcZ.insertar(a.get(i), null);
        }
        for (int i = 0; i < b.tamanno(); i++) {
            if (!pertenece(a, b.get(i))) {
                lslcZ.insertar(b.get(i), null);
            }
        }
        return lslcZ;
    }

    public static boolean pertenece(LSLC l, int dato) {
        NodoSimple x = l.buscarDato(dato, null);
        return x != null;
    }

    public static LSLC diferencia(LSLC a, LSLC b, LSLC c) {
        LSLC bc = unir(b, c);
        LSLC aD = new LSLC();
        for (int i = 0; i < a.tamanno(); i++) {
            if (!pertenece(bc, a.get(i))) {
                aD.insertar(a.get(i), null);
            }
        }
        return aD;
    }

    public static LSLC intersectar(int a, int b, int c, LSLC lslc2, LSLC lslc3, LSLC lslc5) {
        boolean l2 = false;
        boolean l3 = false;
        boolean l5 = false;
        LSLC lslcI = new LSLC();
        if (a == 1 || b == 1 || c == 1) {
            l2 = true;
        }
        if (a == 2 || b == 2 || c == 2) {
            l3 = true;
        }
        if (a == 3 || b == 3 || c == 3) {
            l5 = true;
        }
        if (l2 && l3 && l5) {
            for (int i = 0; i < lslc2.tamanno(); i++) {
                if (pertenece(lslc3, lslc2.get(i)) && pertenece(lslc5, lslc2.get(i))) {
                    lslcI.insertar(lslc2.get(i), null);
                }
            }
        } else {
            if (l2 && l3) {
                for (int i = 0; i < lslc2.tamanno(); i++) {
                    if (pertenece(lslc3, lslc2.get(i))) {
                        lslcI.insertar(lslc2.get(i), null);
                    }
                }
            }
            if (l2 && l5) {
                for (int i = 0; i < lslc2.tamanno(); i++) {
                    if (pertenece(lslc5, lslc2.get(i))) {
                        lslcI.insertar(lslc2.get(i), null);
                    }
                }
            }
            if (l3 && l5) {
                for (int i = 0; i < lslc3.tamanno(); i++) {
                    if (pertenece(lslc5, lslc3.get(i))) {
                        lslcI.insertar(lslc3.get(i), null);
                    }
                }
            }
        }
        if (l2 && !l3 && !l5) {
            return lslc2;
        }
        if (!l2 && l3 && !l5) {
            return lslc3;
        }
        if (!l2 && !l3 && l5) {
            return lslc5;
        }
        return lslcI;
    }
}

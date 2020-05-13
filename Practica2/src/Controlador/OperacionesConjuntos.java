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
        return null;
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

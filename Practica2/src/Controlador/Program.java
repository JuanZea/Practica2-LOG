package Controlador;

import Modelo.LSLC;
import Modelo.NodoSimple;
import Vista.Ventana;

/**
 *
 * @author JuanZea
 * @author FelipeGD
 */
public class Program {
    public static void main(String[] args) 
    {
       //testear();
       Ventana ventana = new Ventana();
       ventana.setVisible(true);
    }
    
    public static void testear() {
        LSLC l = new LSLC();
        NodoSimple y = null;
        l.insertar(3, y);
        y = l.ultimoNodo();
        l.insertar(4, y);
        y = l.ultimoNodo();
        l.insertar(5, y);
        l.insertar(2, null);
        l.insertar(1, null);
        l.insertar(0, null);
    }
    
}

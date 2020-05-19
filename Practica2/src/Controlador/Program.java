package Controlador;

import Modelo.LSLC;
import Modelo.NodoSimple;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanZea
 * @author FelipeGD
 */
public class Program {

    static LSLC lslc0 = new LSLC();
    static LSLC lslc2 = new LSLC();
    static LSLC lslc3 = new LSLC();
    static LSLC lslc5 = new LSLC();
    static LSLC lslcZ = new LSLC();
    static LSLC lslcI = new LSLC();
    static LSLC lslc2D = new LSLC();
    static LSLC lslc3D = new LSLC();
    static LSLC lslc5D = new LSLC();

    static DefaultListModel listaL0 = new DefaultListModel();
    static DefaultListModel listaL2 = new DefaultListModel();
    static DefaultListModel listaL3 = new DefaultListModel();
    static DefaultListModel listaL5 = new DefaultListModel();
    static DefaultListModel listaLZ = new DefaultListModel();
    static DefaultListModel listaI = new DefaultListModel();
    static DefaultListModel listaL2D = new DefaultListModel();
    static DefaultListModel listaL3D = new DefaultListModel();
    static DefaultListModel listaL5D = new DefaultListModel();

    public static void main(String[] args) {
        //testear();
        Ventana v = new Ventana();
        v.setVisible(true);
        oyteInicio(v);
        oyteL0(v);
        oyteL2(v);
        oyteL3(v);
        oyteL5(v);
        oyteLZ(v);
        oyteDiferencias(v);
    }

    public static void oyteInicio(Ventana v) {
        oyteBtnIngresar(v);
        oyteBtnLimpiarTodo(v);
        oyteTxtF(v);
    }

    public static void oyteBtnIngresar(Ventana v) {
        v.getBtnIngresar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ansS = v.getTexFIngresoDato().getText();
                Integer ansI = verificacion(ansS);
                if (v.getrBtnLimpiar().isSelected()) {
                    v.getTexFIngresoDato().setText("");
                }
                if (ansI != null) {
                    actualizarListas(ansI);
                }
            }
        });
    }

    public static Integer verificacion(String ansS) {
        int ansI;
        try {
            ansI = Integer.parseInt(ansS);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El dato ingresado no es numérico", "ERROR", 0, null);
            return null;
        }
        return ansI;
    }

    public static void oyteBtnLimpiarTodo(Ventana v) {
        v.getBtnLimpiarTodo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.getBtnEliminarTodoL0().doClick();
                v.getBtnEliminarTodoL2().doClick();
                v.getBtnEliminarTodoL3().doClick();
                v.getBtnEliminarTodoL5().doClick();
                v.getBtnLimpiarLZ().doClick();
            }
        });
    }

    public static void oyteTxtF(Ventana v) {
        v.getTexFIngresoDato().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.getBtnIngresar().doClick();
            }
        });
    }

    public static void oyteL0(Ventana v) {
        v.getLs0().setModel(listaL0);
        oyteBtnEliminarSeleccionL0(v);
        oyteBtnEliminarTodoL0(v);
    }

    public static void oyteBtnEliminarSeleccionL0(Ventana v) {
        v.getBtnEliminarSeleccionL0().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!v.getLs0().isSelectionEmpty()) {
                    int index = v.getLs0().getSelectedIndex();
                    NodoSimple x = lslc0.buscarDato((int) listaL0.get(index), null);
                    NodoSimple y = lslc0.anterior(x);
                    lslc0.borrar(x, y);
                    actualizarL0();
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL0(Ventana v) {
        v.getBtnEliminarTodoL0().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslc0 = new LSLC();
                actualizarL0();
            }
        });
    }

    public static void oyteL2(Ventana v) {
        v.getLs2().setModel(listaL2);
        oyteBtnEliminarSeleccionL2(v);
        oyteBtnEliminarTodoL2(v);
    }

    public static void oyteBtnEliminarSeleccionL2(Ventana v) {
        v.getBtnEliminarSeleccionL2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!v.getLs2().isSelectionEmpty()) {
                    int index = v.getLs2().getSelectedIndex();
                    NodoSimple y = new NodoSimple(29);
                    NodoSimple x = lslc2.buscarDato((int) listaL2.get(index), y);
                    y = lslc2.anterior(x);
                    lslc2.borrar(x, y);;
                    actualizarL2();
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL2(Ventana v) {
        v.getBtnEliminarTodoL2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslc2 = new LSLC();
                actualizarL2();
            }
        });
    }

    public static void oyteL3(Ventana v) {
        v.getLs3().setModel(listaL3);
        oyteBtnEliminarSeleccionL3(v);
        oyteBtnEliminarTodoL3(v);
    }

    public static void oyteBtnEliminarSeleccionL3(Ventana v) {
        v.getBtnEliminarSeleccionL3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!v.getLs3().isSelectionEmpty()) {
                    int index = v.getLs3().getSelectedIndex();
                    NodoSimple y = new NodoSimple(29);
                    NodoSimple x = lslc3.buscarDato((int) listaL3.get(index), y);
                    y = lslc3.anterior(x);
                    lslc3.borrar(x, y);;
                    actualizarL3();
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL3(Ventana v) {
        v.getBtnEliminarTodoL3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslc3 = new LSLC();
                actualizarL3();
            }
        });
    }

    public static void oyteL5(Ventana v) {
        v.getLs5().setModel(listaL5);
        oyteBtnEliminarSeleccionL5(v);
        oyteBtnEliminarTodoL5(v);
    }

    public static void oyteBtnEliminarSeleccionL5(Ventana v) {
        v.getBtnEliminarSeleccionL5().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!v.getLs5().isSelectionEmpty()) {
                    int index = v.getLs5().getSelectedIndex();
                    NodoSimple y = new NodoSimple(29);
                    NodoSimple x = lslc5.buscarDato((int) listaL5.get(index), y);
                    y = lslc5.anterior(x);
                    lslc5.borrar(x, y);;
                    actualizarL5();
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL5(Ventana v) {
        v.getBtnEliminarTodoL5().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslc5 = new LSLC();
                actualizarL5();
            }
        });
    }

    public static void oyteLZ(Ventana v) {
        v.getLsZ().setModel(listaLZ);
        oyteBtnGenerarLZ(v);
        oyteBtnOrdenarLZ(v);
        oyteBtnLimpiarLZ(v);
    }

    public static void oyteBtnGenerarLZ(Ventana v) {
        v.getBtnGenerarLZ().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslcZ = OperacionesConjuntos.unir(lslc0, lslc2, lslc3, lslc5);
                actualizarLZ();
            }
        });
    }

    public static void oyteBtnOrdenarLZ(Ventana v) {
        v.getBtnGenerarLZ().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ordenarLZ();
                actualizarLZ();
            }
        });
    }

    public static void oyteBtnLimpiarLZ(Ventana v) {
        v.getBtnLimpiarLZ().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslcZ = new LSLC();
                actualizarLZ();
            }
        });
    }

    public static void oyteDiferencias(Ventana v) {
        oyteBtnGenerarDiferencias(v);
    }

    public static void oyteBtnGenerarDiferencias(Ventana v) {
        v.getBtnGenerarDiferencias().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.getLs2Diferencia().setModel(listaL2D);
                v.getLs3Diferencia().setModel(listaL3D);
                v.getLs5Diferencia().setModel(listaL5D);
                lslc2D = OperacionesConjuntos.diferencia(lslc2, lslc3, lslc5);
                lslc3D = OperacionesConjuntos.diferencia(lslc3, lslc5, lslc2);
                lslc5D = OperacionesConjuntos.diferencia(lslc5, lslc2, lslc3);
                actualizarLD();
            }
        });
    }

    public static void oyteIntersecciones(Ventana v) {

    }

    public static void actualizarListas(int dato) {
        boolean added = false;
        if (dato % 2 == 0) {
            NodoSimple y = lslc2.ultimoNodo();
            lslc2.insertar(dato, y);
            added = true;
            actualizarL2();
        }
        if (dato % 3 == 0) {
            NodoSimple y = null;
            lslc3.insertar(dato, y);
            added = true;
            actualizarL3();
        }
        if (dato % 5 == 0) {
            NodoSimple y = lslc5.buscaDondeInsertarAscendente(dato);
            lslc5.insertar(dato, y);
            added = true;
            actualizarL5();
        }
        if (added == false) {
            NodoSimple y = lslc0.buscaDondeInsertarDescendente(dato);
            lslc0.insertar(dato, y);
            actualizarL0();
        }
    }

    public static void actualizarL2() {
        listaL2.clear();
        for (int i = 0; i < lslc2.tamanno(); i++) {
            listaL2.addElement(lslc2.get(i));
        }
    }

    public static void actualizarL3() {
        listaL3.clear();
        for (int i = 0; i < lslc3.tamanno(); i++) {
            listaL3.addElement(lslc3.get(i));
        }
    }

    public static void actualizarL5() {
        listaL5.clear();
        for (int i = 0; i < lslc5.tamanno(); i++) {
            listaL5.addElement(lslc5.get(i));
        }
    }

    public static void actualizarL0() {
        listaL0.clear();
        for (int i = 0; i < lslc0.tamanno(); i++) {
            listaL0.addElement(lslc0.get(i));
        }
    }

    public static void actualizarLZ() {
        listaLZ.clear();
        for (int i = 0; i < lslcZ.tamanno(); i++) {
            listaLZ.addElement(lslcZ.get(i));
        }
    }

    public static void actualizarLD() {
        listaL2D.clear();
        listaL3D.clear();
        listaL5D.clear();
        for (int i = 0; i < lslc2D.tamanno(); i++) {
            listaL2D.addElement(lslc2D.get(i));
        }
        for (int i = 0; i < lslc3D.tamanno(); i++) {
            listaL3D.addElement(lslc3D.get(i));
        }
        for (int i = 0; i < lslc5D.tamanno(); i++) {
            listaL5D.addElement(lslc5D.get(i));
        }
    }

    public static void ordenarLZ() {
        int tamaño = lslcZ.tamanno();
        listaLZ.clear();
        for (int i = 0; i < tamaño; i++) {
            listaLZ.addElement(lslcZ.get(i));
        }
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

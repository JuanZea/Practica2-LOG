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

    static boolean logica = false;

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
        Ventana v = new Ventana();
        v.setVisible(true);
        oyteInicio(v);
        oyteL0(v);
        oyteL2(v);
        oyteL3(v);
        oyteL5(v);
        oyteLZ(v);
        oyteDiferencias(v);
        oyteIntersecciones(v);
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
            JOptionPane.showMessageDialog(null, "El dato ingresado no es un número entero", "ERROR", 0, null);
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
                v.getBtnGenerarDiferencias().doClick();
                v.getBtnIntersectar().doClick();
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
                    actualizar(lslc0, listaL0);
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL0(Ventana v) {
        v.getBtnEliminarTodoL0().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslc0 = new LSLC();
                actualizar(lslc0, listaL0);
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
                    actualizar(lslc2, listaL2);
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL2(Ventana v) {
        v.getBtnEliminarTodoL2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslc2 = new LSLC();
                actualizar(lslc2, listaL2);
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
                    actualizar(lslc3, listaL3);
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL3(Ventana v) {
        v.getBtnEliminarTodoL3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslc3 = new LSLC();
                actualizar(lslc3, listaL3);
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
                    actualizar(lslc5, listaL5);
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL5(Ventana v) {
        v.getBtnEliminarTodoL5().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslc5 = new LSLC();
                actualizar(lslc5, listaL5);
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
                actualizar(lslcZ, listaLZ);
                logica = true;
            }
        });
    }

    public static void oyteBtnOrdenarLZ(Ventana v) {
        v.getBtnOrdenarLZ().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (logica && !lslcZ.esVacio()) {
                    ordenarLZ();
                    actualizar(lslcZ, listaLZ);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay nada que ordenar", "ERROR", 0, null);
                }
            }
        });
    }

    public static void oyteBtnLimpiarLZ(Ventana v) {
        v.getBtnLimpiarLZ().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslcZ = new LSLC();
                actualizar(lslcZ, listaLZ);
                logica = false;
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
                actualizar(lslc2D, listaL2D);
                actualizar(lslc3D, listaL3D);
                actualizar(lslc5D, listaL5D);
            }
        });
    }

    public static void oyteIntersecciones(Ventana v) {
        oyteBtnIntersectar(v);
    }

    public static void oyteBtnIntersectar(Ventana v) {
        v.getBtnIntersectar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a, b, c;
                a = v.getCombox1().getSelectedIndex();
                b = v.getCombox2().getSelectedIndex();
                c = v.getCombox3().getSelectedIndex();
                lslcI = OperacionesConjuntos.intersectar(a, b, c, lslc2, lslc3, lslc5);
                v.getLsInterseccion().setModel(listaI);
                actualizar(lslcI, listaI);
            }
        });
    }

    public static void actualizarListas(int dato) {
        boolean added = false;
        if (dato % 2 == 0) {
            NodoSimple y = lslc2.ultimoNodo();
            lslc2.insertar(dato, y);
            added = true;
            actualizar(lslc2, listaL2);
        }
        if (dato % 3 == 0) {
            NodoSimple y = null;
            lslc3.insertar(dato, y);
            added = true;
            actualizar(lslc3, listaL3);
        }
        if (dato % 5 == 0) {
            NodoSimple y = lslc5.buscaDondeInsertarAscendente(dato);
            lslc5.insertar(dato, y);
            added = true;
            actualizar(lslc5, listaL5);
        }
        if (added == false) {
            NodoSimple y = lslc0.buscaDondeInsertarDescendente(dato);
            lslc0.insertar(dato, y);
            actualizar(lslc0, listaL0);
        }
    }

    public static void actualizar(LSLC lslc, DefaultListModel lista) {
        lista.clear();
        for (int i = 0; i < lslc.tamanno(); i++) {
            lista.addElement(lslc.get(i));
        }
    }

    public static void ordenarLZ() {
        LSLC temp = new LSLC();
        NodoSimple y;
        NodoSimple p;
        NodoSimple x;
        for (int i = 0; i < lslcZ.tamanno(); i++) {
            y = temp.buscaDondeInsertarAscendente(lslcZ.get(i));
            temp.insertar(lslcZ.get(i), y);
        }
        y = temp.primerNodo();
        for (int i = 0; i < lslcZ.tamanno() / 2 - 1; i++) {
            y = y.retornaLiga();
        }
        p = y.retornaLiga();
        x = p.retornaLiga();
        p.asignaLiga(temp.primerNodo());
        int calibrador = (lslcZ.tamanno() % 2 == 0) ? 1 : 0;
        for (int i = 0; i < lslcZ.tamanno() / 2 - calibrador; i++) {
            p = x;
            x = x.retornaLiga();
            temp.insertar(p.retornaDato(), y);
        }

        lslcZ = temp;
    }
}

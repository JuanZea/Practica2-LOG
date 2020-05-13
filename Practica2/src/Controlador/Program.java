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

    static DefaultListModel listaL0 = new DefaultListModel();
    static DefaultListModel listaL2 = new DefaultListModel();
    static DefaultListModel listaL3 = new DefaultListModel();
    static DefaultListModel listaL5 = new DefaultListModel();
    static DefaultListModel listaLZ = new DefaultListModel();

    public static void main(String[] args) {
        //testear();
        Ventana v = new Ventana();
        v.setVisible(true);
        oyteInicio(v);
        oyteL0(v);
        oyteL2(v);
        oyteL3(v);
        oyteL5(v);
    }

    public static void oyteInicio(Ventana v) {
        oyteBtnIngresar(v);
        oyteBtnLimpiarTodo(v);
        oyteTxtF(v);
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
                    NodoSimple y = new NodoSimple(29);
                    NodoSimple x = lslc0.buscarDato((int)listaL0.get(index), y);
                    y = lslc0.anterior(x);
                    lslc0.borrar(x, y);;
                    listaL0.remove(index);
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL0(Ventana v) {
        v.getBtnEliminarTodoL0().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaL0.clear();
                lslc0 = new LSLC();
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
                    listaL2.remove(index);
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL2(Ventana v) {
        v.getBtnEliminarTodoL2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaL2.clear();
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
                    listaL3.remove(index);
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL3(Ventana v) {
        v.getBtnEliminarTodoL3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaL3.clear();
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
                    listaL5.remove(index);
                }
            }
        });
    }

    public static void oyteBtnEliminarTodoL5(Ventana v) {
        v.getBtnEliminarTodoL5().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaL5.clear();
            }
        });
    }
    
    public static void oyteLZ(Ventana v) {
        v.getLsZ().setModel(listaLZ);
        oyteBtnGenerarLZ(v);
    }
    
    public static void oyteBtnGenerarLZ(Ventana v) {
        v.getBtnGenerarLZ().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lslcZ = OperacionesConjuntos.unir(lslc0, lslc2, lslc3, lslc5);
                
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
    
    public static void oyteBtnLimpiarTodo(Ventana v) {
        v.getBtnLimpiarTodo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.getBtnEliminarTodoL0().doClick();
                v.getBtnEliminarTodoL2().doClick();
                v.getBtnEliminarTodoL3().doClick();
                v.getBtnEliminarTodoL5().doClick();
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

    public static void actualizarListas(int dato) {
        boolean added = false;
        if (dato % 2 == 0) {
            NodoSimple y = lslc2.ultimoNodo();
            lslc2.insertar(dato, y);
            added = true;
            actualizarL2(dato);
        }
        if (dato % 3 == 0) {
            NodoSimple y = null;
            lslc3.insertar(dato, y);
            added = true;
            actualizarL3(dato);
        }
        if (dato % 5 == 0) {
            NodoSimple y = lslc5.buscaDondeInsertarAscendente(dato);
            lslc5.insertar(dato, y);
            added = true;
            actualizarL5(dato);
        }
        if (added == false) {
            NodoSimple y = lslc0.buscaDondeInsertarDescendente(dato);
            lslc0.insertar(dato, y);
            actualizarL0(dato);
        }
    }
    
    public static void actualizarL2(int dato) {
        listaL2.addElement(dato);
    }
    
    public static void actualizarL3(int dato) {
        listaL3.add(0, dato);
    }
    
    public static void actualizarL5(int dato) {
        int tamaño = listaL5.size() + 1;
        listaL5.clear();
        for (int i = 0; i < tamaño; i++) {
            listaL5.addElement(lslc5.get(i));
        }
    }
    
    public static void actualizarL0(int dato) {
        int tamaño = listaL0.size() + 1;
        listaL0.clear();
        for (int i = 0; i < tamaño; i++) {
            listaL0.addElement(lslc0.get(i));
        }
    }
    
    public static void actualizarLZ(int dato) {
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

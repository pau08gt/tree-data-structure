import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaAnimales_2 {

    public static void main(String[] args) {
        JFrame marco = new MarcoArbol1();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoArbol1 extends JFrame {

    private DefaultListModel<String> listaModelo;
    private DefaultMutableTreeNode raiz;
    private JTree arbol;

    public MarcoArbol1() {

        // config de la ventana
        setTitle("Arbol Animales");
        setBounds(350, 300, 600, 800);

        raiz = new DefaultMutableTreeNode("Reino Animal");

        arbol = new JTree(raiz);
        Container contenido = getContentPane();
        contenido.add(new JScrollPane(arbol), BorderLayout.NORTH);

        listaModelo = new DefaultListModel<>();
        JList<String> listaAnimales = new JList<>(listaModelo);
        contenido.add(new JScrollPane(listaAnimales), BorderLayout.WEST);

        // Botones
        JPanel panelBotones = new JPanel();

        // Agregar
        JButton btnAgregar = new JButton("Agregar Animal");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarAnimal();
            }
        });
        panelBotones.add(btnAgregar);

        // Filtrar
        JButton btnFiltrar = new JButton("Filtrar por Grupo");
        btnFiltrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String grupo = obtenerGrupoFiltrar();
                if (grupo != null) {
                    mostrarAnimalesPorGrupo(grupo);
                }
            }
        });
        panelBotones.add(btnFiltrar);

        contenido.add(panelBotones, BorderLayout.CENTER);
    }

    // Metodod filtar
    private String obtenerGrupoFiltrar() {
        return JOptionPane.showInputDialog("Ingrese el nombre del grupo a filtrar:");
    }

    private void mostrarAnimalesPorGrupo(String grupo) {
        listaModelo.clear(); //limpia la lista Modelolo
        DefaultTreeModel modelo = (DefaultTreeModel) arbol.getModel(); // obtiene el modelo del arbol
        DefaultMutableTreeNode nodoGrupo = buscarNodo(raiz, grupo); //del metodo de buscar nodo se toma la cadena y compara y devuele¿ve el nodo encontrado

        if (nodoGrupo != null) {
            for (int i = 0; i < nodoGrupo.getChildCount(); i++) {
                DefaultMutableTreeNode nodoAnimal = (DefaultMutableTreeNode) nodoGrupo.getChildAt(i); //toma una hoja = animal y los va recorriendo por grupo
                listaModelo.addElement(nodoAnimal.getUserObject().toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Grupo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        } // hijo = animales
    }
    // Metodod Agregar
    private void agregarAnimal() {
        String nombreAnimal = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
        if (nombreAnimal != null && !nombreAnimal.trim().isEmpty()) {
            String grupo = JOptionPane.showInputDialog("Ingrese el grupo del animal:");
            if (grupo != null && !grupo.trim().isEmpty()) {
                DefaultMutableTreeNode nodoGrupo = buscarNodo(raiz, grupo);
                if (nodoGrupo == null) {
                    nodoGrupo = new DefaultMutableTreeNode(grupo); // busca el grupo y si no hay lo crea
                    raiz.add(nodoGrupo); // agrega al animal despues de verificar que no haya un grupo igual
                    ((DefaultTreeModel) arbol.getModel()).reload(raiz); //recarga el arbol en la GUI
                }

                DefaultMutableTreeNode nodoAnimal = new DefaultMutableTreeNode(nombreAnimal); //creacion del nodo del animal
                nodoGrupo.add(nodoAnimal); //en el nodo grupo agrega el hijo animal
                ((DefaultTreeModel) arbol.getModel()).reload(nodoGrupo); //recarga el arbol 
            }
        }
    }

    // Metodo Buscar
    private DefaultMutableTreeNode buscarNodo(DefaultMutableTreeNode nodo, String nombre) {
        for (int i = 0; i < nodo.getChildCount(); i++) {
            DefaultMutableTreeNode hijo = (DefaultMutableTreeNode) nodo.getChildAt(i); //se toma la posicion de loshijos del arbol y se almacena en la var hijo
            if (nombre.equals(hijo.getUserObject().toString())) {
                return hijo;
            }
        } //recorre cada nodo del arbol osea los hijos
        return null;
    }
}

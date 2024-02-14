import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Arbol_sencillo {

    public static void main(String[] args) {
        JFrame marco = new MarcoArbol();

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }

}

class MarcoArbol extends JFrame {

    public MarcoArbol() {

        setTitle("Arbol Sencillo");
        setBounds(350, 300, 600, 150);
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Mundo"); //raiz
        DefaultMutableTreeNode pais = new DefaultMutableTreeNode("España"); //hijo

        raiz.add(pais);

        DefaultMutableTreeNode comunidad = new DefaultMutableTreeNode("Madrid"); //hijo de españa o hoja

        pais.add(comunidad);

        DefaultMutableTreeNode mostoles = new DefaultMutableTreeNode("Mostoles");
        DefaultMutableTreeNode alcobendas = new DefaultMutableTreeNode("Alcobendas");

        comunidad.add(mostoles);
        comunidad.add(alcobendas);

        ///// otra comunidad

        DefaultMutableTreeNode cantabria = new DefaultMutableTreeNode("Cantabria"); //hijo de españa o hoja

        comunidad.add(cantabria);

        DefaultMutableTreeNode santillana = new DefaultMutableTreeNode("Santillana del mar");

        cantabria.add(santillana);

        ///// otro pais

        DefaultMutableTreeNode pais_A = new DefaultMutableTreeNode("alemania");

        pais.add(pais_A);

        DefaultMutableTreeNode comunidad_A = new DefaultMutableTreeNode("Baviera");

        pais_A.add(comunidad_A);

        DefaultMutableTreeNode munich = new DefaultMutableTreeNode("Munich");

        comunidad_A.add(munich);

        //creacion del arbol /*

       JTree arbol = new JTree(raiz);
         /* LaminaArbol miLamina = new LaminaArbol(arbol);
        add(miLamina); */

        Container laminaContenido = getContentPane();
        laminaContenido.add(new JScrollPane(arbol));
    }

}

class LaminaArbol extends JPanel{

   /*public LaminaArbol(JTree mi_arbol){

        setLayout(new BorderLayout());
        add(mi_arbol, BorderLayout.NORTH );
    }*/

}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Barra extends JMenuBar {
    Barra(){

        JMenu archivo = new JMenu("Archivos");

        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem salir = new JMenuItem("Salir");

        JMenu herramientas = new JMenu("Herramientas");
        JMenu configuracion = new JMenu("Configuración");
        JMenuItem colorConfig = new JMenuItem("Color");

        JMenu opciones = new JMenu("Opciones");
        JMenuItem creditos = new JMenuItem("Créditos");
         creditos.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null,"<html>" +
                         "Este programa es una muestra<br>" +
                         "Autor: FourSeagulls<br>" +
                         "Versión: 0.0.1</html>");
             }
         });


        add(archivo);
        add(herramientas);
        add(opciones);

        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(salir);

        herramientas.add(configuracion);
        configuracion.add(colorConfig);

        opciones.add(creditos);

    }
}

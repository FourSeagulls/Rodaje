import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Barra extends JMenuBar {
    Barra(){

        JMenu archivo = new JMenu("Archivos");

        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");

        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(salir);

        JMenu herramientas = new JMenu("Herramientas");
        JMenu configuracion = new JMenu("Configuración");
        JMenuItem colorConfigFondo = new JMenuItem("Color fondo");
        JMenuItem colorConfigTexto = new JMenuItem("Color texto");

        herramientas.add(configuracion);
        configuracion.add(colorConfigFondo);
        configuracion.add(colorConfigTexto);

        JMenu info = new JMenu("Información");
        JMenuItem creditos = new JMenuItem("Créditos");
        JMenuItem ayuda = new JMenuItem("Ayuda");

        info.add(creditos);
        info.add(ayuda);


        add(archivo);
        add(herramientas);
        add(info);

        abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Falta la lógica de Abrir");
            }
        });
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Falta la lógica de Guardar");
            }
        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Falta la lógica de Salir");
            }
        });

        colorConfigFondo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Falta la lógica de Configurar el color de fondo");
            }
        });
        colorConfigTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Falta la lógica de Configurar el color del texto");
            }
        });

         creditos.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null,"<html>" +
                         "Este programa es una muestra<br>" +
                         "Autor: FourSeagulls<br>" +
                         "Versión: 0.0.1</html>");
             }
         });
        ayuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Falta la lógica de Ayuda");
            }
        });



        info.add(creditos);

    }
}

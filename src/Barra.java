import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Barra extends JMenuBar {
    Barra(){

//menu archivo con sus tres items: abrir, guardar, salir
        JMenu archivo = new JMenu("Archivos");

        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");
//Añadimos los item al menu archivo
        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(salir);
//menu herramientas con el submenu configuración y los items der configuración de color der texto y fondo
        JMenu herramientas = new JMenu("Herramientas");
        JMenu configuracion = new JMenu("Configuración");
        JMenuItem colorConfigFondo = new JMenuItem("Color fondo");
        JMenuItem colorConfigTexto = new JMenuItem("Color texto");
//añadimos los items del menu herramientas y configuración
        herramientas.add(configuracion);
        configuracion.add(colorConfigFondo);
        configuracion.add(colorConfigTexto);
//menu información con sus items créditos y ayuda
        JMenu info = new JMenu("Información");
        JMenuItem creditos = new JMenuItem("Créditos");
        JMenuItem ayuda = new JMenuItem("Ayuda");
//añadimos los item créditos y ayuda
        info.add(creditos);
        info.add(ayuda);

//añadimos los menus a la barra
        add(archivo);
        add(herramientas);
        add(info);
//acciones de los items del menu
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

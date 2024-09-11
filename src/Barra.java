import javax.swing.*;

public class Barra extends JMenuBar {
    Barra(){

        JMenu archivo = new JMenu("Archivos");
        JMenu edicion = new JMenu("Edición");
        JMenu opciones = new JMenu("Opciones");

        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem salir = new JMenuItem("Salir");

        JMenuItem configuracion = new JMenuItem("Configuración");
        JMenuItem creditos = new JMenuItem("Créditos");

        add(archivo);
        add(edicion);
        add(opciones);

        archivo.add(guardar);
        archivo.add(abrir);
        archivo.add(salir);

        edicion.add(configuracion);

        opciones.add(creditos);

    }
}

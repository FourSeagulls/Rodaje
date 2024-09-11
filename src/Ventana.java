import javax.swing.*;

public class Ventana extends JFrame {
    Ventana(){
        setLocationRelativeTo(null);
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Programa abierto");

        JMenuBar barra = new JMenuBar();

        JMenu archivo = new JMenu("Archivos");
        JMenu edicion = new JMenu("Edición");
        JMenu opciones = new JMenu("Opciones");

        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem salir = new JMenuItem("Salir");

        JMenuItem configuracion = new JMenuItem("Configuración");
        JMenuItem creditos = new JMenuItem("Créditos");

        barra.add(archivo);
        barra.add(edicion);
        barra.add(opciones);

        archivo.add(guardar);
        archivo.add(abrir);
        archivo.add(salir);

        edicion.add(configuracion);

        opciones.add(creditos);

        add(barra);

        System.out.println("Se cargó la ventana");
    }
}

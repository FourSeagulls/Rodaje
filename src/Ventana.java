import javax.swing.*;

public class Ventana extends JFrame {
    Ventana(){
        System.out.println("Empieza la carga de la ventana");

        setSize(500,300);
        setLocationRelativeTo(null);
        setTitle("Programa abierto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Lamina lamina = new Lamina();
        add(lamina);

        System.out.println("Se cargó la ventana");
    }
}

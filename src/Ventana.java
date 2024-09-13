import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    Ventana(){

        setSize(500,300);
        setLocationRelativeTo(null);
        setTitle("Programa abierto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        Lamina lamina = new Lamina();
        add(lamina, BorderLayout.NORTH);

    }
}

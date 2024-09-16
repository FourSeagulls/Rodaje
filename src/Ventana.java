import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    Ventana(){
//constructor de la ventana
        setSize(500,300);
        setLocationRelativeTo(null);
        setTitle("Programa abierto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
//instanciamos el panel para la barra de menu y lo situamos arriba
        panelBarra panelBarra = new panelBarra();
        add(panelBarra, BorderLayout.NORTH);

    }
}

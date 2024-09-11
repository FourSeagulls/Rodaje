import javax.swing.*;
import java.awt.*;

public class Lamina extends JPanel {
    Lamina(){
        setBackground(Color.green);

        setLayout(new GridLayout(5,2));

        Barra barra = new Barra();
        add(barra);

        JLabel cabecera = new JLabel("Esta es la cabecera");
        add(cabecera);
    }
}

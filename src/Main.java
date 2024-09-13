import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

	Ventana ventana = new Ventana();

        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());
        ventana.add(panelCentral, BorderLayout.CENTER);

        JLabel cabecera = new JLabel("Esta es la cabecera");
        cabecera.setOpaque(true);
        cabecera.setBackground(Color.green);
        panelCentral.add(cabecera, BorderLayout.NORTH);


        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.orange);
        panelCentral.add(jPanel, BorderLayout.CENTER);

        ventana.setVisible(true);

    }


}

import javax.swing.*;
import java.awt.*;

public class panelBarra extends JPanel {
    panelBarra(){

        setLayout(new BorderLayout());
//situamos la barra de menu en el NORTE del panel
        Barra barra = new Barra();
        add(barra, BorderLayout.NORTH);
//situamos la etiqueta de estado bajo la barra de menu
        JLabel labelEstado = new JLabel("Estado de la aplicación");
        add(labelEstado, BorderLayout.CENTER);

    }
}

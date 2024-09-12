import javax.swing.*;
import java.awt.*;

public class Lamina extends JPanel {
    Lamina(){

        setLayout(new BorderLayout());

        Barra barra = new Barra();
        add(barra, BorderLayout.NORTH);



    }
}

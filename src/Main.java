import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int contadorimagen = 0;
    static String localImagen = "src/imagen/image"+contadorimagen+".jpg";
    public static void main(String[] args) {
//instanciamos la ventana
	Ventana ventana = new Ventana();

        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());
        ventana.add(panelCentral, BorderLayout.CENTER);

        JLabel cabecera = new JLabel("Esta es la cabecera");
        cabecera.setOpaque(true);
        cabecera.setBackground(Color.green);
        panelCentral.add(cabecera, BorderLayout.NORTH);


        JPanel panelContenido = new JPanel();
        panelContenido.setBackground(Color.orange);
        JButton boton1 = new JButton("Botón oeste");
        panelContenido.add(boton1, BorderLayout.WEST);
        ImageIcon imagenCentral = new ImageIcon(localImagen);
        Image imagenEscalada = imagenCentral.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon imagenFinal = new ImageIcon(imagenEscalada);
        JLabel marcoImagen = new JLabel(imagenFinal);
        panelContenido.add(marcoImagen, BorderLayout.CENTER);

        JButton boton2 =new JButton("Boton este");
        panelContenido.add(boton2, BorderLayout.EAST);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        panelCentral.add(panelContenido, BorderLayout.CENTER);

        ventana.setVisible(true);

    }

}

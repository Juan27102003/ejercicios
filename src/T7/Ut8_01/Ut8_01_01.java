package T7.Ut8_01;

import javax.swing.*;

public class Ut8_01_01 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        JLabel etiqueta = new JLabel("¡Hola mundo Swing!", JLabel.CENTER);
        ventana.setSize(640, 480);
        ventana.setTitle("¡Hola mundo!");
        ventana.add(etiqueta);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

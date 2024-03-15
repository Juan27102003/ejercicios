package T7;

import javax.swing.*;
import java.awt.*;

public class Ut8_01_06 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Rejilla de botones");
        ventana.setSize(800,800);
        ventana.setLayout(new GridLayout(6,8));
        for (int i=1;i<49;i++){
            ventana.add(new JButton("Boton "+ String.valueOf(i)));
        }
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

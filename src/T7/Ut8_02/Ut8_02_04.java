package T7.Ut8_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class Ut8_02_04 {
    static int contador=64;
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Quedan "+contador);
        ventana.setSize(640,480);
        ventana.setLayout(new GridLayout(8,8));
        for (int i=1;i<=64;i++){
            JLabel etiqueta=new JLabel("Disparame");
            ventana.add(etiqueta);
            etiqueta.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    etiqueta.setVisible(false);
                    ventana.setTitle("Quedan " + --contador);
                    if (contador==0){
                        JOptionPane.showMessageDialog(ventana,"Todos borrados","Game Over",JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                }
            });
        }

        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

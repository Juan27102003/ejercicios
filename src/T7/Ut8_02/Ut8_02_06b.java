package T7.Ut8_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ut8_02_06b {
    static int contador=25;
    public static void main(String[] args) {
        Icon icn=new ImageIcon("images.jpg");
        JFrame ventana=new JFrame("Quedan "+contador);
        ventana.setSize(640,480);
        ventana.setLayout(new GridLayout(5,5));
        for (int i=1;i<=25;i++){
            JLabel etiqueta=new JLabel("BocaTeAmo");
            etiqueta.setIcon(icn);
            ventana.add(etiqueta);
            etiqueta.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
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

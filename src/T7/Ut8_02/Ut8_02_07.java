package T7.Ut8_02;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Ut8_02_07 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("ut8_02_07");
        ventana.setSize(640, 480);
        ventana.setLayout(new FlowLayout());
        JButton btnNormal = new JButton("Púlsame");
        JToggleButton tglToggle = new JToggleButton("OFF");
        tglToggle.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JToggleButton tgl = (JToggleButton) e.getSource();
                tglToggle.setText(tgl.isSelected() ? "ON" : "OFF");
            }
        });
        ventana.add(btnNormal);
        ventana.add(tglToggle);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

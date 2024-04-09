package T7.Ut8_01;

import javax.swing.*;
import java.awt.*;

public class Ut8_01_05 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        ventana.setTitle("BorderLayout");
        ventana.setLayout(new BorderLayout());
        ventana.add(new JButton("PAGE_START"), BorderLayout.PAGE_START);
        ventana.add(new JButton("PAGE_END"), BorderLayout.PAGE_END);
        ventana.add(new JButton("LINE_START"), BorderLayout.LINE_START);
        ventana.add(new JButton("LINE_END"), BorderLayout.LINE_END);
        ventana.add(new JButton("CENTER"), BorderLayout.CENTER);
        ventana.setVisible(true);
    }
}

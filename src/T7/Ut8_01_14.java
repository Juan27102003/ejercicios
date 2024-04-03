package T7;

import javax.swing.*;
import java.awt.*;

public class Ut8_01_14 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Calculadora");
        ventana.setSize(800,800);
        ventana.setLayout(new BorderLayout());
        JTextField textField=new JTextField("0",JTextField.TOP);
        ventana.add(textField,BorderLayout.PAGE_START);
        JPanel panelInferior=new JPanel();
        JLabel jLabel=new JLabel("I.E.S Oretania");
        panelInferior.add(jLabel);
        ventana.add(panelInferior,BorderLayout.PAGE_END);
        JPanel panelCentral =new JPanel();
        ventana.add(panelCentral,BorderLayout.CENTER);
        panelCentral.setLayout(new GridLayout(4,4));

        JButton j1=new JButton("1");
        JButton j2=new JButton("2");
        JButton j3=new JButton("3");
        JButton j4=new JButton("+");

        JButton j5=new JButton("4");
        JButton j6=new JButton("5");
        JButton j7=new JButton("6");
        JButton j8=new JButton("-");

        JButton j9=new JButton("7");
        JButton j10=new JButton("8");
        JButton j11=new JButton("9");
        JButton j12=new JButton("*");

        JButton j13=new JButton(".");
        JButton j14=new JButton("0");
        JButton j15=new JButton("=");
        JButton j16=new JButton("/");

        panelCentral.add(j1);
        panelCentral.add(j2);
        panelCentral.add(j3);
        panelCentral.add(j4);
        panelCentral.add(j5);
        panelCentral.add(j6);
        panelCentral.add(j7);
        panelCentral.add(j8);
        panelCentral.add(j9);
        panelCentral.add(j10);
        panelCentral.add(j11);
        panelCentral.add(j12);
        panelCentral.add(j13);
        panelCentral.add(j14);
        panelCentral.add(j15);
        panelCentral.add(j16);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
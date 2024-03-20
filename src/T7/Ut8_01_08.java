package T7;

import javax.swing.*;
import java.awt.*;

public class Ut8_01_08 {
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
        int cont=0;
        for (int i =1;i<17;i++){
            if (i%4!=0&&i<12){
                cont++;
                panelCentral.add(new JButton(String.valueOf(cont)));
            }else if (i==4){
                panelCentral.add(new JButton("+"));
            } else if (i==8) {
                panelCentral.add(new JButton("-"));
            } else if (i==12) {
                panelCentral.add(new JButton("*"));
            }else if(i==16){
                panelCentral.add(new JButton("/"));
            } else if (i==13) {
                panelCentral.add(new JButton("."));
            } else if (i==14) {
                panelCentral.add(new JButton("0"));
            }else {
                panelCentral.add(new JButton("="));
            }
        }
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

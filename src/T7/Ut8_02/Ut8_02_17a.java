package T7.Ut8_02;

import javax.swing.*;

public class Ut8_02_17a {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("ut8_02_13");
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo",
                "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
                "Diciembre"};
        JList<String> lstMeses = new JList<>(meses);
        lstMeses.setLayoutOrientation(JList.VERTICAL_WRAP);
        JScrollPane scrMeses = new JScrollPane(lstMeses);
        ventana.add(scrMeses);
        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

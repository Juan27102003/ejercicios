package T7.Ut8_02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class AccionSalir extends AbstractAction {

    public AccionSalir() {
        putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
                KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK
        ));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}

package T7;

import javax.swing.*;
import java.awt.*;

public class IconoCellRenderer extends JLabel implements ListCellRenderer<String> {
    static final Icon iconoSeleccionado = new ImageIcon("images.jpg");
    @Override
    public Component getListCellRendererComponent(JList<? extends String> list, String
            value, int index, boolean isSelected, boolean cellHasFocus) {
        this.setText(value);
        this.setIcon(isSelected ? iconoSeleccionado : null);
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);
        return this;
    }
}
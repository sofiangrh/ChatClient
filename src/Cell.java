// Take it, use it and share it.
// Human knowledge belongs to the world

import java.awt.Component;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whosyourdaddy
 */
public class Cell extends JLabel implements ListCellRenderer {

    Icon icon = new ImageIcon("icon/user.jpg");
    Font font = new Font("Georgia",1,12);

    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String s = value.toString();
        setText(s);
        setIcon(icon);
        setFont(font);
        return this;
    }
}

package ScrollBarAndTable;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ScrollBarAndTable.ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(102, 102, 255));
        setBackground(new Color(244, 244, 244));
    }
}

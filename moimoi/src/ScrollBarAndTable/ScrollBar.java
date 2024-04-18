package ScrollBarAndTable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JScrollBar;

public class ScrollBar extends JScrollBar {

    public ScrollBar() {
        setUI(new ScrollBarAndTable.ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8)); // Adjust height as needed
        setForeground(new Color(102, 102, 255));
        setBackground(new Color(244, 244, 244));

        // Set horizontal orientation
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0)); // Align to the left
        setOrientation(JScrollBar.HORIZONTAL); // Set orientation to horizontal

        // Adjust height based on orientation
        if (getOrientation() == JScrollBar.HORIZONTAL) {
            setPreferredSize(new Dimension(8, 30)); // Adjust width as needed
        }
    }
}

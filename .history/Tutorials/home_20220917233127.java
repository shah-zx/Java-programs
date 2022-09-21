package Tutorials;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class home extends Applet {
    public void paint(Graphics g) {
        g.drawLine(180, 290, 512, 100);
        g.drawLine(512, 100, 850, 284);
        g.drawLine(200, 284, 200, 584);
        g.drawLine(828, 282, 822, 584);
        g.drawLine(200, 584, 824, 584);
        g.drawRect(450, 434, 100, 150);
        g.drawOval(450, 260, 100, 100);
    }
}

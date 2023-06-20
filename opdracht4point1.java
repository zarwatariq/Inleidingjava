package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4point1 extends Applet {

    int x[]= {20,50,80};
    int y[]= {80,20,80};

    public void paint(Graphics g) {
       g.drawPolygon(x,y,3);
    }

}


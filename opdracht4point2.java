package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4point2 extends Applet{

    public void init() {


    }

    public void paint(Graphics g) {

        g.drawRect(200,200,200,200);
        g.drawLine(200,200,300,100);
        g.drawLine(300,100,400,200);
        g.drawRect(240,250,40,80);
        g.drawRect(240,250,40,40);
        g.drawRect(340,320,50,80);

    }

}

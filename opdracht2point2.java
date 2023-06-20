package h02;

import java.applet.Applet;
import java.awt.*;

public class opdracht2point2 extends Applet {

    String roepnaam;
    String achternaam;

    @Override
    public void init() {


    }

    @Override
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawString("Zarwa",20,20);
        g.setColor(Color.red);
        g.drawString("Tariq",21,30);
    }
}

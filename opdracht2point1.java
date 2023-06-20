package h02;

import java.applet.Applet;
import java.awt.*;

public class opdracht2point1 extends Applet {

    String voornaam;

    @Override
    public void init() {
        voornaam = "zarwa";
        setSize(300,300);
        setBackground(Color.blue);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString(voornaam,20,20);

    }
}

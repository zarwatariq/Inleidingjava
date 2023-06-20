package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4point3 extends Applet {
    public  void paint (Graphics g)
    {
        g.fillOval(60,450,120,50);
        g.fillRect(110,60,10,400);
        g.setColor(Color.red);
        g.fillRect(120,80,150,30);
        g.setColor(Color.white);
        g.fillRect(120,110,150,30);
        g.setColor(Color.blue);
        g.fillRect(120,140,150,30);


        int t= 0;
        int x= 195, y=129;
        double x1,y1;

        double r=15;

        double d;

        for (int i=1; i<=24; i++)
        {
            d= (double) t*3.14/180.0;
            x1= x+(double) r*Math.cos(d);
            y1= y+(double) y*Math.sin(d);

            g.drawLine(x,y,(int)x1,(int) y1);
        }

    }

}

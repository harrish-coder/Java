
//using init to pass input via html
//drawing rectangle

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color; //to use color method

public class Rectangle extends Applet {
    int x, y, w, h;

    public void init() {
        x = Integer.parseInt(getParameter("xValue"));
        y = Integer.parseInt(getParameter("yValue"));
        w = Integer.parseInt(getParameter("wValue"));
        h = Integer.parseInt(getParameter("hValue"));
	//setBackground(Color.YELLOW);
	
    }

    public void paint(Graphics g) {
        g.drawRect(x, y, w, h);
        g.drawString("Hello World",300,600);
    }
}

/*
 * <applet code="Rectangle.class" width=150 height=150>
 * <param name = xValue value =20>
 * <param name = yValue value =40>
 * <param name = wValue value =100>
 * <param name = hValue value =50>
 * </applet>
 */
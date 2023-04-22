//applet program hello world

import java.applet.Applet;
import java.awt.Graphics;

public class appletHelloWorld extends Applet{
 public void init(){
 resize(200,600);
}
 public void paint(Graphics g){
 g.drawString("Hello World Applet", 150,150);
}
}

/*
<HTML>
<BODY>
<applet code=appletHelloWorld.class width="100" height="100">
</applet>
</BODY>
</HTML>
*/
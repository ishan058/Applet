import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {
    public void paint(Graphics g) {
        String message = getParameter("message");
        g.drawString("Hello world",20,20);
    }
}



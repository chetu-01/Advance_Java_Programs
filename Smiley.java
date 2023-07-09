import java.applet.*;
import java.awt.*;

public class Smiley extends Applet
{
	public static void main(String args[])
	{
	}
	String str;
	public void init()
	{
		str = getParameter("text");
		if (str == null)
		{
			str = "User";
		}
		str = "Hello "+ str + " !!";
	}
	public void paint(Graphics g)
	{
		g.drawString(str, 20, 20);
		g.setColor(Color.yellow);
		g.drawOval(50,50,300,300);
		g.setColor(Color.green);
		g.fillOval(100,100,70,150);
		g.fillOval(200,100,70,150);
		g.setColor(Color.black);
		g.fillOval(150,150,50,50);
		g.fillOval(200,150,50,50);
		g.fillRect(150,300,70,5);
	}
}


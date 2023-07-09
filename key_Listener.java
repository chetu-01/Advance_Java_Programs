import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class key_Listener extends Applet implements KeyListener
{
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		setBackground(Color.RED);
	}
	public void keyReleased(KeyEvent ke)
	{
		setBackground(Color.GREEN);
	}
	public void keyTyped(KeyEvent ke)
	{
		setBackground(Color.BLUE);
	}
}
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class button_color_change extends Applet
{
	Button b1;

	public void init()
	{
		setLayout(null);
		b1 = new Button("Click Here");
		b1.setBounds(150,100,100,80);
		add(b1);

		b1.addMouseListener(new ABC(b1));
	}
}

class ABC extends MouseAdapter
{
	Button b1;
	ABC(Button b1)
	{
		this.b1 = b1;
	}
	public void mouseEntered(MouseEvent me)
	{
		b1.setBounds(150,100,120,100);
		b1.setBackground(Color.red);
	}
	public void mouseExited(MouseEvent me)
	{
		b1.setBounds(150,100,100,80);
		b1.setBackground(Color.white);
	}
}
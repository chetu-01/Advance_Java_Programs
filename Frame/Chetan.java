import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class Chetan extends Frame
{
	Button b1;

	Chetan()
	{
		Font f = new Font("Arial",Font.BOLD,50);
		setFont(f);

		setSize(500,500);
		b1 = new Button("O  |");
		add(b1);
	}

	public static void main(String args[])
	{
		Chetan a = new Chetan();
		a.show();
	}
}
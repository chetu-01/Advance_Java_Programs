import java.awt.*;
import java.awt.event.*;

class ABC extends Frame
{
	Checkbox c1,c2;

	ABC()
	{
		setLayout(null);
		setTitle("Checkbox Event");
		setSize(300,300);
		setLocation(200,300);

		c1 = new Checkbox("Java");
		c1.setBounds(40,50,70,30);
		add(c1);

		show();
	}
}

class checkbox_methods
{
	public static void main(String args[])
	{
		ABC a = new ABC();
	}
}
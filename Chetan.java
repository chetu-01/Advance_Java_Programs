import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Chetan extends Applet
{
	Label l1;
	Button b1;

	public void init()
	{
		l1 = new Label("Press Button To Start");
		add(l1);
		b1 = new Button("Click Here");
		add(b1);

		b1.addActionListener(new Shubham(l1));
	}
}
class Shubham implements ActionListener
{
	Label l1;
	Shubham(Label l1)
	{
		this.l1=l1;
	}
	public void actionPerformed(ActionEvent ae)
	{
		l1.setText("Process is Started");
	}
}
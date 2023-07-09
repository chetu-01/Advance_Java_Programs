import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class checkbox_event extends Applet implements ActionListener , ItemListener
{
	Checkbox c1;
	Button b1;
	Label l1;

	public void init()
	{
		c1 = new Checkbox("I agree with terms and conditions");
		add(c1);

		b1 = new Button("Proceed to Next");
		b1.setEnabled(false);
		add(b1);

		l1 = new Label("............................................");
		add(l1);

		c1.addItemListener(this);
		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		l1.setText("Button is pressed");
	}

	public void itemStateChanged(ItemEvent ie)
	{
		if(c1.getState())
		{
			b1.setEnabled(true);
		}
		else
		{
			b1.setEnabled(false);
			l1.setText("............................................");
		}
	}
}
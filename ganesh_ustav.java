import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ganesh_ustav extends Applet implements ItemListener
{
	Label l1,l2,l3,l4,l5;
	TextField t1,t2;
	Checkbox c1,c2,c3,c4;

	public void init()
	{
		l1 = new Label("                        GALAXY GANESH USTAV                        ");
		add(l1);

		l2 = new Label("Donees Name : ");
		add(l2);

		t1 = new TextField(30);
		add(t1);

		c1 = new Checkbox("Minimum Registration Charges  Rs.100/-");
		add(c1);

		c2 = new Checkbox("Dhol Pathak Entry  Rs.200/-");
		add(c2);

		c3 = new Checkbox("Uniform Charges  Rs.300/-");
		add(c3);

		c4 = new Checkbox("Extra Amount     ");
		add(c4);

		l3 = new Label("Rs.");
		add(l3);

		t2 = new TextField(10);
		t2.setEnabled(false);
		add(t2);

		l4 = new Label("Total Amount Collected : ");
		add(l4);

		l5 = new Label("              ");
		add(l5);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		int total = 0;

		if(c1.getState())
		{
			total = total + 100;
		}

		if(c2.getState())
		{
			total = total + 200;
		}

		if(c3.getState())
		{
			total = total + 300;
		}

		if(c4.getState())
		{
			t2.setEnabled(true);
			int x = Integer.parseInt(t2.getText());
			total = total + x;
		}
		else
		{
			t2.setEnabled(false);
		}

		l5.setText(String.valueOf(total));
	}
}
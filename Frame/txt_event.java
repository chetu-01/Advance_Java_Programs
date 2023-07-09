import java.awt.*;
import java.awt.event.*;

class ABC extends Frame implements ActionListener
{
	Label lblnm,lblcity,lblemail,lblcontact;
	TextField txtnm,txtcity,txtemail,txtcontact;

	ABC()
	{
		setTitle("First Program");
		setLocation(300,400);
		setSize(500,200);
		setLayout(new GridLayout(4,2));

		lblnm = new Label("Name : ");
		add(lblnm);

		txtnm = new TextField(30);
		add(txtnm);

		lblcity = new Label("City : ");
		add(lblcity);

		txtcity = new TextField(30);
		add(txtcity);

		lblemail = new Label("Email : ");
		add(lblemail);

		txtemail = new TextField(30);
		add(txtemail);

		lblcontact = new Label("Contact : ");
		add(lblcontact);

		txtcontact = new TextField(30);
		add(txtcontact);

		txtnm.addActionListener(this);
		txtcity.addActionListener(this);
		txtemail.addActionListener(this);
		txtcontact.addActionListener(this);

		show();
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==txtnm)
		{
			txtcity.requestFocus();
		}
		else if(ae.getSource()==txtcity)
		{
			txtemail.requestFocus();
		}
		else if(ae.getSource()==txtemail)
		{
			txtcontact.requestFocus();
		}
		else if(ae.getSource()==txtcontact)
		{
			txtnm.requestFocus();
		}
	}
}

class txt_event
{
	public static void main(String args[])
	{
		ABC a = new ABC();
	}
}
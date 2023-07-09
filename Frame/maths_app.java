import java.awt.*;
import java.awt.event.*;

class ABC extends Frame implements ActionListener
{
	MenuBar mb;
	Menu m;
	MenuItem madd,msub,mmul,mdiv;
	Label lblno1,lblno2,lblans;
	TextField txtno1,txtno2;

	ABC()
	{
		setLayout(new GridLayout(3,2));
		setSize(250,180);
		setLocation(350,200);
		setTitle("Maths Application");

		mb = new MenuBar();

		m= new Menu("Maths");

		madd = new MenuItem("Addition");
		m.add(madd);

		msub = new MenuItem("Substraction");
		m.add(msub);

		mmul = new MenuItem("Multiplication");
		m.add(mmul);

		mdiv = new MenuItem("Division");
		m.add(mdiv);

		mb.add(m);
		setMenuBar(mb);

		lblno1 = new Label("No. 1 : ");
		add(lblno1);

		txtno1 = new TextField(20);
		add(txtno1);

		lblno2 = new Label("No. 2 : ");
		add(lblno2);

		txtno2 = new TextField(20);
		add(txtno2);

		lblans = new Label("Answer : ");
		add(lblans);

		madd.addActionListener(this);
		msub.addActionListener(this);
		mmul.addActionListener(this);
		mdiv.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,c=0;

		if(ae.getSource()==madd)
		{
			a = Integer.parseInt(txtno1.getText());
			b = Integer.parseInt(txtno2.getText());
			c = a + b;
			lblans.setText("Addition : "+String.valueOf(c));
		}
		if(ae.getSource()==msub)
		{
			a = Integer.parseInt(txtno1.getText());
			b = Integer.parseInt(txtno2.getText());
			c = a - b;
			lblans.setText("Substraction : "+String.valueOf(c));
		}
		if(ae.getSource()==mmul)
		{
			a = Integer.parseInt(txtno1.getText());
			b = Integer.parseInt(txtno2.getText());
			c = a * b;
			lblans.setText("Multiplication : "+String.valueOf(c));
		}
		else if(ae.getSource()==mdiv)
		{
			a = Integer.parseInt(txtno1.getText());
			b = Integer.parseInt(txtno2.getText());
			c = a / b;
			lblans.setText("Division : "+String.valueOf(c));
		}
	}
}

class maths_app
{
	public static void main(String args[])
	{
		ABC a = new ABC();
		a.show();
	}
}
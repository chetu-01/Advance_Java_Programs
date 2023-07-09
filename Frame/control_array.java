import java.awt.*;
import java.awt.event.*;

class ABC extends Frame implements ActionListener
{
	Label l1;
	Panel p1;
	Button[] b1;

	ABC()
	{
		Font f = new Font("Arial",Font.BOLD,15);
		setFont(f);

		setSize(500,500);
		setLocation(100,100);
		setTitle("Control Array");

		l1 = new Label("Result Here ...");
		add(l1,BorderLayout.SOUTH);

		p1 = new Panel();
		p1.setLayout(new GridLayout(5,2));

		String[] str = {"Chetan","Ketan","Shubham","Rohit","Pranav",
						"Bhushan","Dipak","Dhiraj","Kunal","Tejas"};

		b1 = new Button[10];

		for(int i = 0; i < b1.length; i++)
		{
			b1[i] = new Button(str[i]);
			p1.add(b1[i]);
			b1[i].addActionListener(this);
		}

		add(p1,BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//String str = ae.getActionCommand();
		//l1.setText("Welcome ... "+str);

		Button b = (Button)ae.getSource();
		l1.setText("Welcome ... "+b.getLabel());
	}
}

class control_array
{
	public static void main(String args[])
	{
		ABC A = new ABC();
		A.show();
	}
}
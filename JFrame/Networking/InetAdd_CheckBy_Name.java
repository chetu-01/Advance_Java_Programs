import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

class ABC extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1;
	JButton b1;
	ABC()
	{
		setSize(300,300);
		setLocation(300,200);
		setTitle("Check Host Name");
		setLayout(null);

		l1 = new JLabel("Host Name ");
		l1.setBounds(30,40,80,30);
		add(l1);
		t1 = new JTextField(40);
		t1.setBounds(120,40,100,30);
		add(t1);
		b1 = new JButton("Check");
		b1.setBounds(50,90,80,30);
		add(b1);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String hnm = "";
		String tnm = t1.getText();

		try
		{
			InetAddress ref = InetAddress.getLocalHost();
			hnm = ref.getHostName();
			System.out.println(hnm);
			System.out.println(t1.getText());
		}
		catch(UnknownHostException e)
		{
			System.out.println("Unrechable Host");
		}
		if(tnm.equals(hnm))
		{
			JOptionPane.showMessageDialog(null,"Match Found ...!!!");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Match Not Found ...!!!");
		}

	}
}

class InetAdd_CheckBy_Name
{
	public static void main(String args[])
	{
		ABC a = new ABC();
		a.show();
	}
}
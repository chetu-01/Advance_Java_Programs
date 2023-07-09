import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class event_Show_Mess_Dia extends JFrame implements ActionListener
{
	JButton b1;

	event_Show_Mess_Dia()
	{
		setSize(400,400);
		setLocation(300,200);
		setTitle("Show Message Dialog");

		b1 = new JButton("Click Me");
		add(b1,BorderLayout.NORTH);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JOptionPane.showMessageDialog(null,"Hello Shubham");
	}
	public static void main(String args[])
	{
		event_Show_Mess_Dia A = new event_Show_Mess_Dia();
		A.show();
	}
}
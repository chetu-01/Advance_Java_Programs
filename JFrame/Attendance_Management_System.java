import java.awt.*;
import javax.swing.*;

class ABC extends JFrame
{
	JPanel north,center,south;

	ABC()
	{
		setTitle("Attendance Management System");
		setLayout(new BorderLayout());
		setSize(1200,800);
		setLocation(400,100);

		north = new JPanel();
		north.setBackground(new Color(100,200,250));
		add(north,BorderLayout.NORTH);

		center = new JPanel();
		center.setBackground(new Color(220,225,250));
		add(center,BorderLayout.CENTER);

		south = new JPanel();
		south.setBackground(new Color(100,250,100));
		add(south,BorderLayout.SOUTH);
	}
}

class Attendance_Management_System
{
	public static void main(String args[])
	{
		ABC A = new ABC();
		A.show();
	}
}
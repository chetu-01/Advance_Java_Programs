import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class sample_ui extends JApplet
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1,b2;

	public void init()
	{
		setLayout(new FlowLayout());
		l1 = new JLabel("              Marks Statement      ");
		add(l1);
		l2 = new JLabel("Marathi         ");
		add(l2);
		t1 = new JTextField(10);
		add(t1);
		l3 = new JLabel("English          ");
		add(l3);
		t2 = new JTextField(10);
		add(t2);
		l4 = new JLabel("Hindi              ");
		add(l4);
		t3 = new JTextField(10);
		add(t3);
		l5 = new JLabel("Math              ");
		add(l5);
		t4 = new JTextField(10);
		add(t4);
		l6 = new JLabel("Science           ");
		add(l6);
		t5 = new JTextField(10);
		add(t5);
		l7 = new JLabel("Social Science ");
		add(l7);
		t6 = new JTextField(10);
		add(t6);
		b1 = new JButton("Find Total");
		add(b1);
		b2 = new JButton("Result");
		add(b2);
		l8 = new JLabel("Remark");
		add(l8);
		t7 = new JTextField(10);
		add(t7);
	}
}
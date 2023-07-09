import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class pro_galaxy extends Applet implements ItemListener
{
	Label lblheading,lblcnm,lblpoption;
	TextField txtcnm;
	Checkbox pcourse,fcourse,ptolearning;
	CheckboxGroup payoption;
	Button ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10;

	public void init()
	{
		Font f = new Font("Arial",Font.BOLD,14);
		setFont(f);

		lblheading = new Label("    GALAXY COMPUTER EDUCATION    ");
		add(lblheading);

		lblcnm = new Label("Course Name : ");
		add(lblcnm);

		txtcnm = new TextField(20);
		add(txtcnm);

		lblpoption = new Label("Payment Option : ");
		add(lblpoption);

		payoption = new CheckboxGroup();

		pcourse = new Checkbox("Paid Course",payoption,false);
		add(pcourse);

		fcourse = new Checkbox("Free Course",payoption,false);
		add(fcourse);

		ptolearning = new Checkbox("Proceed To Learn                                             ");
		ptolearning.setEnabled(false);
		add(ptolearning);

		ch1 = new Button("Chapter 1");
		ch1.setEnabled(false);
		add(ch1);

		ch2 = new Button("Chapter 2");
		ch2.setEnabled(false);
		add(ch2);

		ch3 = new Button("Chapter 3");
		ch3.setEnabled(false);
		add(ch3);

		ch4 = new Button("Chapter 4");
		ch4.setEnabled(false);
		add(ch4);

		ch5 = new Button("Chapter 5");
		ch5.setEnabled(false);
		add(ch5);

		ch6 = new Button("Chapter 6");
		ch6.setEnabled(false);
		add(ch6);

		ch7 = new Button("Chapter 7");
		ch7.setEnabled(false);
		add(ch7);

		ch8 = new Button("Chapter 8");
		ch8.setEnabled(false);
		add(ch8);

		ch9 = new Button("Chapter 9");
		ch9.setEnabled(false);
		add(ch9);

		ch10 = new Button("Chapter 10");
		ch10.setEnabled(false);
		add(ch10);

		pcourse.addItemListener(this);
		fcourse.addItemListener(this);
		ptolearning.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		if(pcourse.getState() || fcourse.getState())
		{
			ptolearning.setEnabled(true);
		}
		if(ptolearning.getState())
		{
			if(pcourse.getState())
			{
				ch1.setEnabled(true);
				ch2.setEnabled(true);
				ch3.setEnabled(true);
				ch4.setEnabled(true);
				ch5.setEnabled(true);
				ch6.setEnabled(true);
				ch7.setEnabled(true);
				ch8.setEnabled(true);
				ch9.setEnabled(true);
				ch10.setEnabled(true);
			}
			else
			{
				ch1.setEnabled(true);
				ch2.setEnabled(true);
				ch3.setEnabled(false);
				ch4.setEnabled(false);
				ch5.setEnabled(false);
				ch6.setEnabled(false);
				ch7.setEnabled(false);
				ch8.setEnabled(false);
				ch9.setEnabled(false);
				ch10.setEnabled(false);
			}
		}
		else
		{
			ch1.setEnabled(false);
			ch2.setEnabled(false);
			ch3.setEnabled(false);
			ch4.setEnabled(false);
			ch5.setEnabled(false);
			ch6.setEnabled(false);
			ch7.setEnabled(false);
			ch8.setEnabled(false);
			ch9.setEnabled(false);
			ch10.setEnabled(false);
		}
	}
}

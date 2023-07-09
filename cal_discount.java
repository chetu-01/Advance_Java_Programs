import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class cal_discount extends Applet implements ItemListener
{
	Label lblnm,lblamt,lblgender,lblcourse,lbldiscount;
	TextField txtnm,txtamt;
	CheckboxGroup gender,course;
	Checkbox male,female,java,mscit,tally;

	public void init()
	{
		lblnm = new Label("Name : ");
		add(lblnm);

		txtnm = new TextField(40);
		add(txtnm);

		lblamt = new Label("Paid Amount : ");
		add(lblamt);

		txtamt = new TextField(10);
		add(txtamt);

		lblgender = new Label("Gender : ");
		add(lblgender);

		gender = new CheckboxGroup();

		male = new Checkbox("Male",gender,false);
		add(male);

		female = new Checkbox("Female",gender,false);
		add(female);

		lblcourse = new Label("Courses : ");
		add(lblcourse);

		course = new CheckboxGroup();

		java = new Checkbox("Advance Java (Rs. 2100)",course,false);
		add(java);

		mscit = new Checkbox("MSCIT (Rs. 4000)",course,false);
		add(mscit);

		tally = new Checkbox("Tally (Rs. 6500)",course,false);
		add(tally);

		lbldiscount = new Label("Discount : ");
		add(lbldiscount);

		male.addItemListener(this);
		female.addItemListener(this);
		java.addItemListener(this);
		mscit.addItemListener(this);
		tally.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		int amt = Integer.parseInt(txtamt.getText());

		int a=0,c=0;

		if(java.getState())
		{
			a = 2100;
		}
		else if(mscit.getState())
		{
			a = 4000;
		}
		else if(tally.getState())
		{
			a = 6500;
		}

		if(male.getState())
		{
			c = (20/100)*a;
			lbldiscount.setText(String.valueOf(c));
		}
		else if(female.getState())
		{
			lbldiscount.setText("");
		}
	}
}
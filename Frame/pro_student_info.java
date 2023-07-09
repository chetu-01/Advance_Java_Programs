import java.awt.*;
import java.awt.event.*;

class Student extends Frame implements ActionListener
{
	Label lblheading,lblnm,lblcity,lblcontact,lblemail,lblemnm,lblemcity,lblemcontact,lblememail;
	TextField txtnm,txtcity,txtcontact,txtemail;
	Button btnsave,btnnext,btncaps;
	Panel south,center;

	Student()
	{
		Font f = new Font("Arial",Font.BOLD,15);
		setFont(f);

		setTitle("Student Information");
		setSize(600,230);
		setLocation(200,300);

		lblheading = new Label("                                 STUDENT INFORMATION");
		add(lblheading,BorderLayout.NORTH);

		center = new Panel();
		center.setLayout(new GridLayout(4,3));

		lblnm = new Label("Name : ");
		center.add(lblnm);

		txtnm = new TextField();
		center.add(txtnm);

		lblemnm = new Label("*");
		lblemnm.setForeground(Color.red);
		center.add(lblemnm);

		lblcity = new Label("City : ");
		center.add(lblcity);

		txtcity = new TextField();
		center.add(txtcity);

		lblemcity = new Label("*");
		lblemcity.setForeground(Color.red);
		center.add(lblemcity);

		lblcontact = new Label("Contact : ");
		center.add(lblcontact);

		txtcontact = new TextField();
		center.add(txtcontact);

		lblemcontact = new Label("*");
		lblemcontact.setForeground(Color.red);
		center.add(lblemcontact);

		lblemail = new Label("Email : ");
		center.add(lblemail);

		txtemail = new TextField();
		center.add(txtemail);

		lblememail = new Label("*");
		lblememail.setForeground(Color.red);
		center.add(lblememail);

		add(center,BorderLayout.CENTER);

		south = new Panel();
		south.setLayout(new GridLayout(1,3));

		btnsave = new Button("Save");
		south.add(btnsave);

		btnnext = new Button("Next");
		south.add(btnnext);

		btncaps = new Button("Caps");
		south.add(btncaps);

		add(south,BorderLayout.SOUTH);

		btnsave.addActionListener(this);
		btnnext.addActionListener(this);
		btncaps.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btncaps)
		{
			txtnm.setText(txtnm.getText().toUpperCase());
			txtcity.setText(txtcity.getText().toUpperCase());
		}
		else if(ae.getSource()==btnsave)
		{
			String a = txtnm.getText();

			if(a.length() == 0)
			{
				lblemnm.setText("Enter The Name...");
			}
			else
			{
				lblemnm.setText("*");
			}

			String b = txtcity.getText();

			if(b.length() == 0)
			{
				lblemcity.setText("Enter The City...");
			}
			else
			{
				lblemcity.setText("*");
			}

			String c = txtcontact.getText();

			if(c.length() != 10)
			{
				lblemcontact.setText("Enter The Valid Number...");
			}
			else
			{
				lblemcontact.setText("*");
			}

			String d = txtemail.getText();

			if(!d.endsWith("@gmail.com"))
			{
				lblememail.setText("Enter The Valid Email...");
			}
			else
			{
				lblememail.setText("*");
			}
		}
		else
		{
			txtnm.setText(" ");
			txtcity.setText(" ");
			txtcontact.setText(" ");
			txtemail.setText(" ");
			txtnm.requestFocus();
		}
	}
}

class pro_student_info
{
	public static void main(String args[])
	{
		Student a = new Student();
		a.show();
	}
}
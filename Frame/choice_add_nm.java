import java.awt.*;
import java.awt.event.*;

class ABC extends Frame implements ActionListener
{
	Label lblfnm,lblmnm,lbllnm;
	TextField txtfnm,txtmnm,txtlnm;
	Choice cfnm,cmnm,clnm;
	Button addtocbox;

	ABC()
	{
		int x=50 ,y=50 ,w=120 ,h=30 ,xgap=140 ,ygap=50;

		Font f = new Font("Arial",Font.BOLD,15);
		setFont(f);

		setLayout(null);
		setTitle("Add Name to Choice");
		setSize(500,270);
		setLocation(300,300);

		lblfnm = new Label("First Name : ");
		lblfnm.setBounds(x,y,w,h);
		add(lblfnm);

		x=x+xgap;

		lblmnm = new Label("Middle Name : ");
		lblmnm.setBounds(x,y,w,h);
		add(lblmnm);

		x=x+xgap;

		lbllnm = new Label("Last Name : ");
		lbllnm.setBounds(x,y,w,h);
		add(lbllnm);

		x=50;
		y=y+ygap;

		txtfnm = new TextField(50);
		txtfnm.setBounds(x,y,w,h);
		add(txtfnm);

		x=x+xgap;

		txtmnm = new TextField(50);
		txtmnm.setBounds(x,y,w,h);
		add(txtmnm);

		x=x+xgap;

		txtlnm = new TextField(50);
		txtlnm.setBounds(x,y,w,h);
		add(txtlnm);

		x=110;
		y=y+ygap;

		addtocbox = new Button("Add To Choice Box");
		addtocbox.setBounds(x,y,w+150,h);
		add(addtocbox);

		x=50;
		y=y+ygap;

		cfnm = new Choice();
		cfnm.setBounds(x,y,w,h);
		add(cfnm);

		x=x+xgap;

		cmnm = new Choice();
		cmnm.setBounds(x,y,w,h);
		add(cmnm);

		x=x+xgap;

		clnm = new Choice();
		clnm.setBounds(x,y,w,h);
		add(clnm);

		addtocbox.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		cfnm.add(txtfnm.getText());
		cmnm.add(txtmnm.getText());
		clnm.add(txtlnm.getText());
	}
}

class choice_add_nm
{
	public static void main(String args[])
	{
		ABC a = new ABC();
		a.show();
	}
}
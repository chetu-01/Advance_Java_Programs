import java.awt.*;

class ABC extends Frame
{
	Label lblid,lblnm,lbladdress,lblcity,lblmobile,lblemail,lbljob,lblremark;
	TextField txtid,txtnm,txtaddress,txtcity,txtmobile,txtemail,txtjob,txtremark;
	Button btnaccept,btnreject;

	int x=40,y=60,w=150,h=25,xgap=150,ygap=45;

	ABC()
	{
		setLayout(null);
		setTitle("Customer Data Entry");
		setLocation(300,300);
		setSize(400,480);

		lblid=new Label("Customer ID ");
		lblid.setBounds(x,y,w,h);
		lblid.setBackground(Color.black);
		lblid.setForeground(Color.white);
		add(lblid);

		x=x+xgap;

		txtid=new TextField(100);
		txtid.setBounds(x,y,w,h);
		add(txtid);

		x=40;
		y=y+ygap;

		lblnm=new Label("Customer Name ");
		lblnm.setBounds(x,y,w,h);
		lblnm.setBackground(Color.black);
		lblnm.setForeground(Color.white);
		add(lblnm);

		x=x+xgap;

		txtnm=new TextField(100);
		txtnm.setBounds(x,y,w,h);
		add(txtnm);

		x=40;
		y=y+ygap;

		lbladdress=new Label("Customer Address ");
		lbladdress.setBounds(x,y,w,h);
		lbladdress.setBackground(Color.black);
		lbladdress.setForeground(Color.white);
		add(lbladdress);

		x=x+xgap;

		txtaddress=new TextField(100);
		txtaddress.setBounds(x,y,w,h);
		add(txtaddress);

		x=40;
		y=y+ygap;

		lblcity=new Label("Customer City ");
		lblcity.setBounds(x,y,w,h);
		lblcity.setBackground(Color.black);
		lblcity.setForeground(Color.white);
		add(lblcity);

		x=x+xgap;

		txtcity=new TextField(100);
		txtcity.setBounds(x,y,w,h);
		add(txtcity);

		x=40;
		y=y+ygap;

		lblmobile=new Label("Customer Mobile ");
		lblmobile.setBounds(x,y,w,h);
		lblmobile.setBackground(Color.black);
		lblmobile.setForeground(Color.white);
		add(lblmobile);

		x=x+xgap;

		txtmobile=new TextField(100);
		txtmobile.setBounds(x,y,w,h);
		add(txtmobile);

		x=40;
		y=y+ygap;

		lblemail=new Label("Customer Email ");
		lblemail.setBounds(x,y,w,h);
		lblemail.setBackground(Color.black);
		lblemail.setForeground(Color.white);
		add(lblemail);

		x=x+xgap;

		txtemail=new TextField(100);
		txtemail.setBounds(x,y,w,h);
		add(txtemail);

		x=40;
		y=y+ygap;

		lbljob=new Label("Customer Job ");
		lbljob.setBounds(x,y,w,h);
		lbljob.setBackground(Color.black);
		lbljob.setForeground(Color.white);
		add(lbljob);

		x=x+xgap;

		txtjob=new TextField(100);
		txtjob.setBounds(x,y,w,h);
		add(txtjob);

		x=40;
		y=y+ygap;

		lblremark=new Label("Customer Remark ");
		lblremark.setBounds(x,y,w,h);
		lblremark.setBackground(Color.black);
		lblremark.setForeground(Color.white);
		add(lblremark);

		x=x+xgap;

		txtremark=new TextField(100);
		txtremark.setBounds(x,y,w,h);
		add(txtremark);

		x=40;
		y=y+ygap;

		btnaccept=new Button("Accept");
		btnaccept.setBounds(x,y,w,h);
		btnaccept.setBackground(Color.green);
		add(btnaccept);


		x=x+xgap+15;

		btnreject=new Button("Reject");
		btnreject.setBounds(x,y,w,h);
		btnreject.setBackground(Color.red);
		add(btnreject);

		show();
	}
}

class setColor
{
	public static void main(String args[])
	{
		ABC A=new ABC();
		A.setBackground(Color.black);
	}
}
import java.awt.*;

class ABC extends Frame
{
	Panel up,down,left,right,center;
	Label lblheading1,lblheading2,lblselbrand,lblinfo,lblcustinfo,lblselcolor,lblnm,lblproduct,lblquantity,lblcity,lblpin,lblpaymode;
	TextField txtnm,txtproduct,txtquantity,txtcity,txtpin;
	Checkbox samsung,sony,nokia,oppo,readme,motorolla;
	Button btnapply,btncancel;
	CheckboxGroup color,mode;
	Checkbox black,silver,gold,pink,cash,gpay,ptm,neft;

	ABC()
	{
		Font f = new Font("Arial",Font.BOLD,16);
		setFont(f);

		setLayout(new BorderLayout());
		setTitle("Online Product Selection");
		setLocation(500,200);
		setSize(670,400);

		up = new Panel();
		up.setLayout(new GridLayout(2,1));

		lblheading1 = new Label("RELAINCE ONLINE SHOP");
		lblheading1.setAlignment(Label.CENTER);
		up.add(lblheading1);

		lblheading2 = new Label("A Leading Company to Provide You Service");
		lblheading2.setAlignment(Label.CENTER);
		up.add(lblheading2);

		add(BorderLayout.NORTH,up);

		down = new Panel();
		down.setLayout(new GridLayout(1,6));

		lblpaymode = new Label("Payment Mode");
		down.add(lblpaymode);

		mode = new CheckboxGroup();

		cash = new Checkbox("Cash",mode,false);
		down.add(cash);

		gpay = new Checkbox("Google Pay",mode,false);
		down.add(gpay);

		ptm = new Checkbox("Paytm",mode,false);
		down.add(ptm);

		neft = new Checkbox("NEFT",mode,false);
		down.add(neft);

		add(BorderLayout.SOUTH,down);

		left = new Panel();
		left.setLayout(new GridLayout(6,1));

		lblselbrand=new Label("Select Brand");
		left.add(lblselbrand);

		samsung=new Checkbox("Samsung");
		left.add(samsung);

		sony=new Checkbox("Sony");
		left.add(sony);

		nokia=new Checkbox("Nokia");
		left.add(nokia);

		oppo=new Checkbox("Oppo");
		left.add(oppo);

		motorolla=new Checkbox("Motorolla");
		left.add(motorolla);

		add(BorderLayout.WEST,left);

		right=new Panel();
		right.setLayout(new GridLayout(7,1));

		lblselcolor=new Label("Select Color");
		right.add(lblselcolor);

		color=new CheckboxGroup();

		black=new Checkbox("Black",color,false);
		right.add(black);

		silver=new Checkbox("Silver",color,false);
		right.add(silver);

		gold=new Checkbox("Gold",color,false);
		right.add(gold);

		pink=new Checkbox("Pink",color,false);
		right.add(pink);

		btnapply=new Button("Apply");
		right.add(btnapply);

		btncancel=new Button("Cancel");
		right.add(btncancel);

		add(BorderLayout.EAST,right);

		center=new Panel();
		center.setLayout(new GridLayout(6,2));

		lblinfo=new Label("Info.");
		lblinfo.setAlignment(Label.CENTER);
		center.add(lblinfo);

		lblcustinfo=new Label("Customer Information");
		lblcustinfo.setAlignment(Label.CENTER);
		center.add(lblcustinfo);

		lblnm=new Label("Name");
		center.add(lblnm);

		txtnm=new TextField(100);
		center.add(txtnm);

		lblproduct=new Label("Product");
		center.add(lblproduct);

		txtproduct=new TextField(100);
		center.add(txtproduct);

		lblquantity=new Label("Quantity");
		center.add(lblquantity);

		txtquantity=new TextField(100);
		center.add(txtquantity);

		lblcity=new Label("City");
		center.add(lblcity);

		txtcity=new TextField(100);
		center.add(txtcity);

		lblpin=new Label("Pin");
		center.add(lblpin);

		txtpin=new TextField(100);
		center.add(txtpin);

		add(BorderLayout.CENTER,center);

	}
}

class onlProSel
{
	public static void main(String args[])
	{
		ABC a= new ABC();
		a.show();
	}
}
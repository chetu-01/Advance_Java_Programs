import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class pro_checkbox extends Applet implements  ItemListener , ActionListener
{
	Label lblheading,lblcnm,lbllist,lblshowprice,lblshowprice1,lblshowprice2,lblshowprice3,lblshowprice4,lblshowprice5,lblshowtotalprice;
	TextField txtcnm,txtqty,txtqty1,txtqty2,txtqty3,txtqty4,txtqty5;
	Checkbox crs,crs1,crs2,crs3,crs4,crs5;
	int total = 0;

	public void init()
	{
		Font f = new Font("Arial",Font.BOLD,13);
		setFont(f);

		lblheading = new Label("                    CORONA Dignostic Center                   ");
		add(lblheading);

		lblcnm = new Label("Customer Name : ");
		add(lblcnm);

		txtcnm = new TextField(30);
		add(txtcnm);

		lbllist = new Label("     List of Corona Utilities    :                   ");
		add(lbllist);

		crs = new Checkbox("Mask Rs.300/-                  ",true);
		crs.setEnabled(false);
		add(crs);

		txtqty = new TextField("1",10);
		add(txtqty);

		lblshowprice = new Label("                       ");
		add(lblshowprice);

		crs1 = new Checkbox("Sanitizer Rs.75/-            ",false);
		add(crs1);

		txtqty1 = new TextField(10);
		txtqty1.setText("Quantity");
		add(txtqty1);
		txtqty1.setEnabled(false);

		lblshowprice1 = new Label("                       ");
		add(lblshowprice1);

		crs2 = new Checkbox("Gloves Rs.10/-               ",false);
		add(crs2);

		txtqty2 = new TextField(10);
		txtqty2.setText("Quantity");
		add(txtqty2);
		txtqty2.setEnabled(false);

		lblshowprice2 = new Label("                       ");
		add(lblshowprice2);

		crs3 = new Checkbox("PPE Kit Rs.1200/-           ",false);
		add(crs3);

		txtqty3 = new TextField(10);
		txtqty3.setText("Quantity");
		add(txtqty3);
		txtqty3.setEnabled(false);

		lblshowprice3 = new Label("                       ");
		add(lblshowprice3);

		crs4 = new Checkbox("Thermometer Rs.120/-     ",false);
		add(crs4);

		txtqty4 = new TextField(10);
		txtqty4.setText("Quantity");
		add(txtqty4);
		txtqty4.setEnabled(false);

		lblshowprice4 = new Label("                       ");
		add(lblshowprice4);

		crs5 = new Checkbox("Oximeter Rs.1800/-         ",false);
		add(crs5);

		txtqty5 = new TextField(10);
		txtqty5.setText("Quantity");
		add(txtqty5);
		txtqty5.setEnabled(false);

		lblshowprice5 = new Label("                      ");
		add(lblshowprice5);

		lblshowtotalprice = new Label("                               ");
		add(lblshowtotalprice);

	//	txtqty.selectAll();
	//	txtqty.requestFocus();

		txtcnm.addActionListener(this);
		txtqty.addActionListener(this);
		txtqty1.addActionListener(this);
		txtqty2.addActionListener(this);
		txtqty3.addActionListener(this);
		txtqty4.addActionListener(this);
		txtqty5.addActionListener(this);

		crs.addItemListener(this);
		crs1.addItemListener(this);
		crs2.addItemListener(this);
		crs3.addItemListener(this);
		crs4.addItemListener(this);
		crs5.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		if(crs1.getState())
		{
			txtqty1.setEnabled(true);
			txtqty1.requestFocus();
			txtqty1.selectAll();
		}
		if(crs2.getState())
		{
			txtqty2.setEnabled(true);
			txtqty2.requestFocus();
			txtqty2.selectAll();
		}
		if(crs3.getState())
		{
			txtqty3.setEnabled(true);
			txtqty3.requestFocus();
			txtqty3.selectAll();
		}
		if(crs4.getState())
		{
			txtqty4.setEnabled(true);
			txtqty4.requestFocus();
			txtqty4.selectAll();
		}
		if(crs5.getState())
		{
			txtqty5.setEnabled(true);
			txtqty5.requestFocus();
			txtqty5.selectAll();
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==txtqty)
		{
			int qty = Integer.parseInt(txtqty.getText());
			int rate = 300;
			int amt = qty * rate;
			lblshowprice.setText("Rs . "+String.valueOf(amt)+"/-");
			total = total + amt;
		}
		if(ae.getSource()==txtqty1)
		{
			int qty1 = Integer.parseInt(txtqty1.getText());
			int rate1 = 75;
			int amt1 = qty1 * rate1;
			lblshowprice1.setText("Rs . "+String.valueOf(amt1)+"/-");
			total = total + amt1;
		}
		if(ae.getSource()==txtqty2)
		{
			int qty2 = Integer.parseInt(txtqty2.getText());
			int rate2 = 10;
			int amt2 = qty2 * rate2;
			lblshowprice2.setText("Rs . "+String.valueOf(amt2)+"/-");
			total = total + amt2;
		}
		if(ae.getSource()==txtqty3)
		{
			int qty3 = Integer.parseInt(txtqty3.getText());
			int rate3 = 1200;
			int amt3 = qty3 * rate3;
			lblshowprice3.setText("Rs . "+String.valueOf(amt3)+"/-");
			total = total + amt3;
		}
		if(ae.getSource()==txtqty4)
		{
			int qty4 = Integer.parseInt(txtqty4.getText());
			int rate4 = 120;
			int amt4 = qty4 * rate4;
			lblshowprice4.setText("Rs . "+String.valueOf(amt4)+"/-");
			total = total + amt4;
			//lblshowtotalprice.setText("Rs . "+String.valueOf(total)+"/-");
		}
		if(ae.getSource()==txtqty5)
		{
			int qty5 = Integer.parseInt(txtqty5.getText());
			int rate5 = 1800;
			int amt5 = qty5 * rate5;
			lblshowprice5.setText("Rs . "+String.valueOf(amt5)+"/-");
			total = total + amt5;
		}
		lblshowtotalprice.setText("Total Rs . "+String.valueOf(total)+"/-");
	}
}
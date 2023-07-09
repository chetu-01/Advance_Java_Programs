import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ABC extends JFrame implements ActionListener
{
	JLabel lblpronm,lblcprice,lblsprice,lblweight,lblcnm;
	JTextField txtpronm,txtcprice,txtsprice,txtweight,txtcnm;
	JButton btnsave,btnclear;
	JPanel center;

	ABC()
	{
		Font f = new Font("Arial",Font.BOLD,20);

		setLayout(new BorderLayout());
		setTitle("Product Database");
		setSize(500,300);
		setLocation(400,300);

		center = new JPanel();
		center.setLayout(new GridLayout(6,2));

		lblpronm = new JLabel("Product Name    : ");
		txtpronm = new JTextField(50);
		txtpronm.setFont(f);
		center.add(lblpronm);
		center.add(txtpronm);

		lblcprice = new JLabel("Cost Price        : ");
		txtcprice = new JTextField(50);
		txtcprice.setFont(f);
		center.add(lblcprice);
		center.add(txtcprice);

		lblsprice = new JLabel("Selling Price      : ");
		txtsprice = new JTextField(50);
		txtsprice.setFont(f);
		center.add(lblsprice);
		center.add(txtsprice);

		lblweight = new JLabel("Product Weight  : ");
		txtweight = new JTextField(50);
		txtweight.setFont(f);
		center.add(lblweight);
		center.add(txtweight);

		lblcnm = new JLabel("Company Name  : ");
		txtcnm = new JTextField(50);
		txtcnm.setFont(f);
		center.add(lblcnm);
		center.add(txtcnm);

		btnsave = new JButton("Save");
		center.add(btnsave);
		btnclear = new JButton("Clear");
		center.add(btnclear);

		add(center,BorderLayout.CENTER);

		btnsave.addActionListener(this);
		btnclear.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnsave)
		{
			String pnm = txtpronm.getText();
			String cost = txtcprice.getText();
			String selling = txtsprice.getText();
			String wet = txtweight.getText();
			String comp = txtcnm.getText();

			String query = "insert into Product(ProductName , CostPrice , SellingPrice , Weight , Company)"+
							" values('" + pnm +"'," + cost + "," + selling + "," + wet + ",'" + comp + "')";

			try
			{
				String url = "jdbc:odbc:DSNProduct";
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement smt = con.createStatement();
				smt.execute(query);
				con.close();
			}
			catch( Exception e)
			{
				System.out.println(e);
			}
		}
		else if(ae.getSource()==btnclear)
		{
			txtpronm.setText("");
			txtcprice.setText("");
			txtsprice.setText("");
			txtweight.setText("");
			txtcnm.setText("");
			txtpronm.requestFocus();
		}
	}
}
class insert_Product
{
	public static void main(String args[])
	{
		ABC A = new ABC();
		A.show();
	}
}
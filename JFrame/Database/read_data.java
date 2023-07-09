import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ABC extends JFrame implements ActionListener
{
	JButton btnread;
	Choice c1;

	ABC()
	{
		Font f = new Font("Arial",Font.BOLD,20);

		setLayout(new BorderLayout());
		setTitle("Product Database");
		setSize(300,300);
		setLocation(400,300);

		btnread = new JButton("Read Product Name");
		add(btnread,BorderLayout.NORTH);

		c1 = new Choice();
		add(c1,BorderLayout.SOUTH);

		btnread.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnread)
		{
			String query = "select ProductName from Product";

			try
			{
				String url = "jdbc:odbc:DSNProduct";
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement smt = con.createStatement();

				ResultSet rs = smt.executeQuery(query);
				while(rs.next())
				{
					c1.addItem(rs.getString(1));
				}

				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class read_data
{
	public static void main(String args[])
	{
		ABC A = new ABC();
		A.show();
	}
}
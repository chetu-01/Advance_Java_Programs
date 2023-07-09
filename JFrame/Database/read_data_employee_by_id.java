import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ABC extends JFrame implements ActionListener
{
	JLabel lblid,lblempnm,lblgender,lblpost,lbldept,lblsalary,lblexp;
	JTextField txtid,txtempnm,txtpost,txtdept,txtsalary,txtexp;
	JComboBox cgender;
	JButton btnupdate,btnclear;
	JPanel center;

	ABC()
	{
		Font f = new Font("Arial",Font.PLAIN,17);

		setLayout(new BorderLayout());
		setTitle("Product Database");
		setSize(500,300);
		setLocation(400,300);

		center = new JPanel();
		center.setLayout(new GridLayout(8,2));

		lblid = new JLabel("Employee ID  : ");
		txtid = new JTextField(50);
		txtid.setFont(f);
		center.add(lblid);
		center.add(txtid);

		lblempnm = new JLabel("Employee Name    : ");
		txtempnm = new JTextField(50);
		txtempnm.setFont(f);
		center.add(lblempnm);
		center.add(txtempnm);

		lblgender = new JLabel("Gender  :");
		center.add(lblgender);

		cgender = new JComboBox();
		cgender.addItem("Male");
		cgender.addItem("Female");
		center.add(cgender);

		lblpost = new JLabel("Post   : ");
		txtpost = new JTextField(50);
		txtpost.setFont(f);
		center.add(lblpost);
		center.add(txtpost);

		lbldept = new JLabel("Department  : ");
		txtdept = new JTextField(50);
		txtdept.setFont(f);
		center.add(lbldept);
		center.add(txtdept);

		lblsalary = new JLabel("Salary  : ");
		txtsalary = new JTextField(50);
		txtsalary.setFont(f);
		center.add(lblsalary);
		center.add(txtsalary);

		lblexp = new JLabel("Experience  : ");
		txtexp = new JTextField(50);
		txtexp.setFont(f);
		center.add(lblexp);
		center.add(txtexp);

		btnupdate = new JButton("Fetch");
		center.add(btnupdate);
		btnclear = new JButton("Clear");
		center.add(btnclear);

		add(center,BorderLayout.CENTER);

		btnupdate.addActionListener(this);
		btnclear.addActionListener(this);
		cgender.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnupdate)
		{
			String query = "select * from Employee where EmployeeID = "+Integer.parseInt(txtid.getText())+"";
			System.out.println(query);

			try
			{
				String url = "jdbc:odbc:DSNProduct";
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement smt = con.createStatement();
				smt.execute(query);
				ResultSet rs = smt.executeQuery(query);

				while(rs.next())
				{
					txtempnm.setText(rs.getString(2));
					txtpost.setText(rs.getString(4));
					txtdept.setText(rs.getString(5));
					txtsalary.setText(rs.getString(6));
					txtexp.setText(rs.getString(7));
				}

				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(ae.getSource()==btnclear)
		{
			txtempnm.setText("");
			txtpost.setText("");
			txtdept.setText("");
			txtsalary.setText("");
			txtexp.setText("");
			txtempnm.requestFocus();
		}
	}
}
class read_data_employee_by_id
{
	public static void main(String args[])
	{
		ABC A = new ABC();
		A.show();
	}
}
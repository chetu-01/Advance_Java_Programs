import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;

class ABC extends JFrame implements ActionListener
{
	JLabel lblempnm,lblgender,lblpost,lbldept,lblsalary,lblexp;
	JTextField txtempnm,txtpost,txtdept,txtsalary,txtexp;
	JComboBox cgender;
	JButton btnsave,btnclear;
	JPanel center;

	ABC()
	{
		Font f = new Font("Arial",Font.PLAIN,17);

		setLayout(new BorderLayout());
		setTitle("Product Database");
		setSize(500,300);
		setLocation(400,300);

		center = new JPanel();
		center.setLayout(new GridLayout(7,2));

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

		btnsave = new JButton("Save");
		center.add(btnsave);
		btnclear = new JButton("Clear");
		center.add(btnclear);

		add(center,BorderLayout.CENTER);

		btnsave.addActionListener(this);
		btnclear.addActionListener(this);
		cgender.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnsave)
		{
			String empnm = txtempnm.getText();
			String gender = (String)cgender.getItemAt(cgender.getSelectedIndex());
			String post = txtpost.getText();
			String dept = txtdept.getText();
			String salary = txtsalary.getText();
			String exp = txtexp.getText();

			String query = "insert into Employee(EmployeeName , Gender , Post , Department , Salary , Experience)"+
							" values('" + empnm +"','" + gender + "','" + post + "','" + dept + "'," + Integer.parseInt(salary) + "," + Integer.parseInt(exp) +")";

			try
			{
				String url = "jdbc:odbc:DSNProduct";
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement smt = con.createStatement();
				smt.execute(query);
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
class insert_Employee
{
	public static void main(String args[])
	{
		ABC A = new ABC();
		A.show();
	}
}
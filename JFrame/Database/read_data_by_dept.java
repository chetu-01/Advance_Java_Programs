import java.sql.*;

class read_data_by_dept
{
	public static void main(String args[])
	{
		String query = "update contact set name = 'XYZ' where number='7420819800'";
		//String query = "update contact set number = '7420819800' , address='Jalgoan' , DOB = '2001-10-3' , email = 'jalgoan@gmail.com' where name='XYZ'";
		System.out.println(query);

		try
		{
			String url = "jdbc:odbc:DSNContact";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection(url);
			Statement smt = con.createStatement();
			smt.execute(query);
			System.out.println("Data Updated...!!");
			//ResultSet rs = smt.executeQuery(query);
/*
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}*/
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
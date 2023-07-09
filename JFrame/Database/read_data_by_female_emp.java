import java.sql.*;

class read_data_by_female_emp
{
	public static void main(String args[])
	{
		String query = "select * from Employee where Gender = 'Female'";
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
				System.out.println(rs.getString(2));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
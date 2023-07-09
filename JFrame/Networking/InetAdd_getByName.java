import java.net.*;

class InetAdd_getByName
{
	public static void main(String args[])
	{
		try
		{
			InetAddress ref = InetAddress.getByName("www.google.com");
			System.out.println(ref.getHostAddress());
			System.out.println(ref.getHostName());
		}
		catch(UnknownHostException e)
		{
			System.out.println("Unreachable Host");
		}
	}
}
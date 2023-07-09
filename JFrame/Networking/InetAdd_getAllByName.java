import java.net.*;

class InetAdd_getAllByName
{
	public static void main(String args[])
	{
		try
		{
			InetAddress ref[] = InetAddress.getAllByName("www.facebook.com");
			for(InetAddress x : ref)
			{
				System.out.println(x.getHostAddress());
				System.out.println(x.getHostName());
			}
		}
		catch(UnknownHostException e)
		{
			System.out.println("Unreachable Host");
		}
	}
}
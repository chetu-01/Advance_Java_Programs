import java.net.*;

class InetAdd_getLocalHost
{
	public static void main(String args[])
	{
		try
		{
			InetAddress ref = InetAddress.getLocalHost();
			System.out.println(ref.getHostAddress());
			System.out.println(ref.getHostName());
		}
		catch(UnknownHostException e)
		{
			System.out.println("Unreachable Host");
		}
	}
}
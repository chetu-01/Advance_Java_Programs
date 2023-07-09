import java.awt.*;
import java.awt.event.*;

class ABC extends Frame implements WindowListener
{
	static int i;
	int gap;
	ABC()
	{
		gap=50;
		i++;
		setLocation(100+(i*gap),200+(i*gap));
		setSize(500,500);
		setTitle("Application "+String.valueOf(i));
		setBackground(Color.WHITE);

		addWindowListener(this);
	}
	public void windowActivated(WindowEvent we)
	{
		System.out.println("Activated");
	}
	public void windowDeactivated(WindowEvent we)
	{
		System.out.println("Deactivated");
	}
	public void windowIconified(WindowEvent we)
	{
		System.out.println("Iconified");
	}
	public void windowDeiconified(WindowEvent we)
	{
		System.out.println("Deiconified");
	}
	public void windowOpened(WindowEvent we)
	{
		System.out.println("Opened");
	}
	public void windowClosing(WindowEvent we)
	{
		System.out.println("Closing");
		dispose();
	}
	public void windowClosed(WindowEvent we)
	{
		System.out.println("Closed");
	}
}
class window_Listener
{
	public static void main(String args[])
	{
		ABC A = new ABC();
		A.show();
		ABC B = new ABC();
		B.show();
		ABC C = new ABC();
		C.show();
	}
}
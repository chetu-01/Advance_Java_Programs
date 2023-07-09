import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Subjects extends Applet
{
	public void init()
	{
		List l1=new List();
		l1.setBounds(50,60,100,120);
		l1.add("DSU");
		l1.add("PIC");
		l1.add("OOP");
		l1.add("CGR");
		l1.add("DTE");
		l1.add("Microprocessor");
		l1.add("CN");
		l1.add("DBMS");
		l1.add("SEN");
		l1.add("JAVA");
		add(l1);
        setLayout(null);
	}
	public static void main(String[] args)
	{
    	new Subjects();
    }
}
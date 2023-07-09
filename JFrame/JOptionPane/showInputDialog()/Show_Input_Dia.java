import javax.swing.*;

class Show_Input_Dia
{
	public static void main(String args[])
	{
		String value = JOptionPane.showInputDialog(null,"Enter Your Name ");
		System.out.println("Hello "+value);
	}
}
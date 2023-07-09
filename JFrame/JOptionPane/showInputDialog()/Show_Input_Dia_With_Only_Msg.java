import javax.swing.*;

class Show_Input_Dia_With_Only_Msg
{
	public static void main(String args[])
	{
		String value = JOptionPane.showInputDialog("Enter Your Name ");
		System.out.println("Hello "+value);
	}
}
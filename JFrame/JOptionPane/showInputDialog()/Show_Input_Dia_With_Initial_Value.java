import javax.swing.*;

class Show_Input_Dia_With_Initial_Value
{
	public static void main(String args[])
	{
		String value = JOptionPane.showInputDialog(null,"Enter Your Name ","Full Name");
		System.out.println("Hello "+value);
	}
}
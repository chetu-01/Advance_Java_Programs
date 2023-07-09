import javax.swing.*;

class Show_Input_Dia_With_Msg_Initial_Value
{
	public static void main(String args[])
	{
		String value = JOptionPane.showInputDialog("Enter Your Name ","First Name");
		System.out.println("Hello "+value);
	}
}
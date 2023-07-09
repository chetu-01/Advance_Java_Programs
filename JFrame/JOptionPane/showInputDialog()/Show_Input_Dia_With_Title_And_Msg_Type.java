import javax.swing.*;

class Show_Input_Dia_With_Title_And_Msg_Type
{
	public static void main(String args[])
	{
		String value = JOptionPane.showInputDialog(null,"Enter Your Name ","Name Of Title",JOptionPane.ERROR_MESSAGE);
		System.out.println("Hello "+value);
	}
}
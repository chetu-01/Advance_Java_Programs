import javax.swing.*;

class Show_Input_Dia_With_Title_And_Msg_Type_Oject_Of_Value_InitValue
{
	public static void main(String args[])
	{
		Object[] names = {"Java Programming","C Programming","C++ Programming","Python Programming"};

		Object value = JOptionPane.showInputDialog(null,"Select Course","Galaxy Computer Education",JOptionPane.INFORMATION_MESSAGE,null,names,names[0]);

		System.out.println("Hello "+value);
	}
}
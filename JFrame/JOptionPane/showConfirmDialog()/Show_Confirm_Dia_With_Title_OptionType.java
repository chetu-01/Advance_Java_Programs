import javax.swing.*;

class Show_Confirm_Dia_With_Title_OptionType
{
	public static void main(String args[])
	{
		int value = JOptionPane.showConfirmDialog(null,"Are you comfortable with Online examination pattern","Galaxy Computer Education",JOptionPane.DEFAULT_OPTION);
		System.out.println("Selected value is   :  "+value);
	}
}
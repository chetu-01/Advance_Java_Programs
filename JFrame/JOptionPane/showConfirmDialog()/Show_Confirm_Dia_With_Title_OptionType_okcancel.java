import javax.swing.*;

class Show_Confirm_Dia_With_Title_OptionType_okcancel
{
	public static void main(String args[])
	{
		int value = JOptionPane.showConfirmDialog(null,"Are you comfortable with Online examination pattern","Galaxy Computer Education",JOptionPane.OK_CANCEL_OPTION);
		System.out.println("Selected value is   :  "+value);
	}
}
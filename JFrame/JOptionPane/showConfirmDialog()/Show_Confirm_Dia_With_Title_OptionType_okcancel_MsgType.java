import javax.swing.*;

class Show_Confirm_Dia_With_Title_OptionType_okcancel_MsgType_Icon
{
	public static void main(String args[])
	{
		int value = JOptionPane.showConfirmDialog(null,"Are you comfortable with Online examination pattern","Galaxy Computer Education",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,new ImageIcon("cake.jpg"));
		System.out.println("Selected value is   :  "+value);
	}
}
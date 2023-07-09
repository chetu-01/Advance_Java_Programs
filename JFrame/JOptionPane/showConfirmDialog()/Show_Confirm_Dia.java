import javax.swing.*;

class Show_Confirm_Dia
{
	public static void main(String args[])
	{
		int value = JOptionPane.showConfirmDialog(null,"Are you comfortable with Online examination pattern");

		if(value == 0)
		{
			System.out.println("You Select ..... Yes");
		}
		else if(value == 1)
		{
			System.out.println("You Select ..... No");
		}
		else
		{
			System.out.println("You Select ..... Cancel");
		}
	}
}
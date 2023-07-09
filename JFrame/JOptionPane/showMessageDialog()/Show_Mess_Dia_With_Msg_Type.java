import javax.swing.*;

class Show_Mess_Dia_With_Msg_Type
{
	public static void main(String args[])
	{
		JOptionPane.showMessageDialog(null,"Hello Shubham","Welcome",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"Hello Shubham","Welcome",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Hello Shubham","Welcome",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null,"Hello Shubham","Welcome",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Hello Shubham","Welcome",JOptionPane.WARNING_MESSAGE);
	}
}
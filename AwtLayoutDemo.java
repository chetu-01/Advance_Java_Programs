import java.awt.*;
import java.awt.event.*;

class AwtLayoutDemo extends Frame
{
	AwtLayoutDemo()
	{
		setSize(400,400);
		setLayout(new BorderLayout());

		Panel panel = new Panel();
		panel.setSize(300,300);
		GridBagLayout layout = new GridBagLayout();
		panel.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(new Button("Button 1"),gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(new Button("Button 2"),gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(new Button("Button 3"),gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(new Button("Button 4"),gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 2;
		panel.add(new Button("Button 5"),gbc);

		add(panel);

		setVisible(true);
	}
	public static void main(String arsg[])
	{
		AwtLayoutDemo A = new AwtLayoutDemo();
	}
}

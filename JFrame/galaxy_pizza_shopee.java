import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ABC extends JFrame implements ActionListener
{
	JLabel lblheading,lblselingredients,lblselreq,lblorder;
	JCheckBox ingredients[];
	JRadioButton requirements[];
	ButtonGroup bg;
	JPanel east,west;
	String str = "";
	String str1 = "";

	ABC()
	{
		setTitle("Galaxy Pizza Shopee");
		setSize(390,350);
		setLocation(400,300);
		setLayout(new BorderLayout());

		lblheading = new JLabel("Galaxy Pizza Shopee",JLabel.CENTER);
		lblheading.setFont(new Font("Serif",Font.BOLD,30));
		add(lblheading,BorderLayout.NORTH);

		east = new JPanel();
		east.setLayout(new GridLayout(5,1));

		lblselreq = new JLabel("Select Requirement");
		east.add(lblselreq);

		bg = new ButtonGroup();
		requirements = new JRadioButton[4];
		String requirement[] = {"4 Slieces","8 Slieces","12 Slieces","16 Slieces"};

		for(int i=0;i<4;i++)
		{
			requirements[i] = new JRadioButton(requirement[i]);
			east.add(requirements[i]);
			bg.add(requirements[i]);
			requirements[i].addActionListener(this);
		}

		add(east,BorderLayout.EAST);

		west = new JPanel();
		west.setLayout(new GridLayout(6,1));

		lblselingredients = new JLabel("Select Ingredients");
		west.add(lblselingredients);

		ingredients = new JCheckBox[5];
		String ingredient[]={"Garlic","Onion","Spinach","Anchovies","Plain"};

		for(int i=0;i<5;i++)
		{
			ingredients[i] = new JCheckBox(ingredient[i]);
			west.add(ingredients[i]);
			ingredients[i].addActionListener(this);
		}
		add(west,BorderLayout.WEST);

		lblorder = new JLabel("",JLabel.CENTER);
		add(lblorder,BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent ae)
	{
		str = "";
		str1 = "";

		if(ingredients[0].isSelected())
			str = str + "Garlic ,";
		if(ingredients[1].isSelected())
			str = str + "Onion ,";
		if(ingredients[2].isSelected())
			str = str + "Spinach ,";
		if(ingredients[3].isSelected())
			str = str + "Anchovies ,";
		if(ingredients[4].isSelected())
			str = str + "Plain ,";

		if(requirements[0].isSelected())
			str1 = str1 + "4 Slieces";
		if(requirements[1].isSelected())
			str1 = str1 + "8 Slieces";
		if(requirements[2].isSelected())
			str1 = str1 + "12 Slieces";
		if(requirements[3].isSelected())
			str1 = str1 + "16 Slieces";

		lblorder.setText("Order : "+ str1 + " with " + str);
	}
}

class galaxy_pizza_shopee
{
	public static void main(String args[])
	{
		ABC A = new ABC();
		A.show();
	}
}
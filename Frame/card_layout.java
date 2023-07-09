import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ABC extends Frame implements ItemListener
{
	Choice choice;
	Panel controlpanel,buttonpanel,UIpanel,middlepanel;
	Button computer,mobile,headphone;
	Label name;
	TextField nameentery;
	CardLayout layout;

	ABC()
	{
		setSize(400,400);
		setLocation(300,200);
		setTitle("CardLayout Program");
		setLayout(new FlowLayout());

		controlpanel = new Panel();
		controlpanel.setLayout(new GridLayout(3,1));

		choice = new Choice();
		choice.add("All Buttons");
		choice.add("Other UI");

		controlpanel.add(choice);

		buttonpanel = new Panel();
		buttonpanel.setLayout(new FlowLayout());

		computer = new Button("Computer");
		mobile = new Button("Mobile");
		headphone = new Button("Headphone");

		buttonpanel.add(computer);
		buttonpanel.add(mobile);
		buttonpanel.add(headphone);

 		UIpanel = new Panel();
		UIpanel.setLayout(new FlowLayout());

		name = new Label("Your Name : ");
		nameentery = new TextField(30);

		UIpanel.add(name);
		UIpanel.add(nameentery);

		middlepanel = new Panel();
		middlepanel.setBackground(Color.green);
		middlepanel.setSize(200,200);
		layout = new CardLayout();

		layout.setHgap(10);
		layout.setVgap(10);

		middlepanel.setLayout(layout);
		middlepanel.add(buttonpanel,"buttonpanel");
		middlepanel.add(UIpanel,"UIpanel");
		controlpanel.add(middlepanel);

		add(controlpanel);

		choice.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String item = (String)ie.getItem();
		layout.show(this,item);
	}
}
class card_layout
{
    public static void main(String args[])
    {
        ABC A=new ABC();
		A.show();
    }
}
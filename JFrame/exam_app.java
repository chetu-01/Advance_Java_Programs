import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ABC extends JFrame implements ActionListener
{
	JLabel question;
	JRadioButton srb,rb[];
	ButtonGroup bg;
	JButton next;
	JPanel center;
	int count=0,current=0;

	private :

	ABC()
	{
		setTitle("Exam Software");
		setSize(500,250);
		setLocation(400,300);
		setLayout(new BorderLayout());

		question = new JLabel();
		add(question,BorderLayout.NORTH);

		center = new JPanel();
		center.setLayout(new GridLayout(4,1));

		rb = new JRadioButton[4];
		srb = new JRadioButton();
		bg = new ButtonGroup();

		for(int i = 0; i < 4; i++)
		{
			rb[i]=new JRadioButton();
			center.add(rb[i]);
			bg.add(rb[i]);
		}
		bg.add(srb);
		add(center,BorderLayout.CENTER);

		set();

		next = new JButton("Next");
		add(next,BorderLayout.SOUTH);

		next.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==next)
		{
			if(check())
				count++;
			current++;
			set();
			if(current == 6)
			{
				next.setText("Result");
			}
		}

		if(ae.getActionCommand().equals("Result"))
		{
			if(check())
				count++;
			current++;

			JOptionPane.showMessageDialog(this,"correct ans="+count);
			System.exit(0);
		}
	}

    void set()
    {
        srb.setSelected(true);
        if(current==0)
        {
            question.setText("Que 1 : Which one among these is not a primitive datatype ?");
            rb[0].setText("int");
            rb[1].setText("Float");
            rb[2].setText("boolean");
            rb[3].setText("char");
        }
        if(current==1)
        {
            question.setText("Que 2 : Which class is available to all the class automatically ?");
            rb[0].setText("Swing");
            rb[1].setText("Applet");
            rb[2].setText("Object");
            rb[3].setText("ActionEvent");
        }
        if(current==2)
        {
            question.setText("Que 3 : Which package is directly available to our class without importing it ?");
            rb[0].setText("swing");
            rb[1].setText("applet");
            rb[2].setText("net");
            rb[3].setText("lang");
        }
        if(current==3)
        {
            question.setText("Que 4 : String class is defined in which package ?");
            rb[0].setText("lang");
            rb[1].setText("Swing");
            rb[2].setText("Applet");
            rb[3].setText("awt");
        }
        if(current==4)
        {
            question.setText("Que 5 : Which function is not present in Applet class?");
			rb[0].setText("init");
			rb[1].setText("main");
			rb[2].setText("start");
			rb[3].setText("destroy");
		}
        if(current==5)
        {
            question.setText("Que 6 : Which one among these is not a keyword ?");
            rb[0].setText("class");
            rb[1].setText("int");
            rb[2].setText("get");
            rb[3].setText("if");
        }
        if(current==6)
        {
            question.setText("Que 7 : Which one among these is not a class ? ");
            rb[0].setText("Swing");
            rb[1].setText("Actionperformed");
            rb[2].setText("ActionEvent");
            rb[3].setText("Button");
        }
	}

    boolean check()
    {
        if(current==0)
            return(rb[1].isSelected());
        if(current==1)
            return(rb[2].isSelected());
        if(current==2)
            return(rb[3].isSelected());
        if(current==3)
            return(rb[0].isSelected());
        if(current==4)
            return(rb[1].isSelected());
        if(current==5)
            return(rb[2].isSelected());
        if(current==6)
            return(rb[1].isSelected());
        return false;
    }
}

class exam_app
{
	public static void main(String args[])
	{
		ABC A = new ABC();
		A.show();
	}
}
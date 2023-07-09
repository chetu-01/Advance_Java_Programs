import java.awt.*;
import java.awt.event.*;

class ABC extends Frame implements MouseListener
{
	Label lblweloque;
	CheckboxGroup cg;
	Checkbox c1,c2,c3,c4;
	TextField t1;
	Button btnnxt,btnprev,btnstart,btnend;
	Panel p1,p2,p3;
	int a=0,b=0,c=1,d=2,e=3,x=0,y=0;
	String[] que = {"Que1: Which one among these is not a primitive datatype?",
					"Que2: Which class is available to all the class automatically?",
					"Que3: Which package is directly available to our class without importing it?",
					"Que4: String class is defined in which package?",
					"Que5: Which institute is best for java coaching?",
					"Que6: Which one among these is not a keyword?",
					"Que7: Which one among these is not a class? ",
					"Que8: which one among these is not a function of Object class?",
					"Que9: which function is not present in Applet class?",
					"Que10: Which one among these is not a valid component?"};
	String[] opt = {"int","Float","boolean","char","Swing","Applet","Object","ActionEvent",
					"swing","applet","net","lang","lang","Swing","Applet","awt",
					"Utek","Aptech","SSS IT","jtek","class","int","get","if",
					"Swing","Actionperformed","ActionEvent","Button","toString","finalize","equals","getDocumentBase",
					"init","main","start","destroy","JButton","JList","JButtonGroup","JTextArea"};


	ABC()
	{
		Font f = new Font("Arial",Font.BOLD,15);
		setFont(f);

		int x = 80 , y = 100 , w = 100 ,h = 40;

		setLayout(null);
		setTitle("Online Exam");
		setSize(600,620);
		setLocation(300,200);

		p1 = new Panel();
		p1.setLayout(null);
		p1.setBounds(20,45,560,555);

		lblweloque = new Label("                              Welcome to Online Exam");
		lblweloque.setBackground(Color.white);
		lblweloque.setBounds(x,y,w+200,h);
		add(lblweloque);

		cg = new CheckboxGroup();
		c1 = new Checkbox("int",cg,false);
		c1.setBounds(80,130,100,40);

		c2 = new Checkbox("Float",cg,false);
		c2.setBounds(80,180,100,40);

		c3 = new Checkbox("boolean",cg,false);
		c3.setBounds(80,230,100,40);

		c4 = new Checkbox("char",cg,false);
		c4.setBounds(80,280,100,40);

		btnprev = new Button("Previous");
		btnprev.setEnabled(false);
		btnprev.setBounds(60,380,100,40);

		btnnxt = new Button("Next");
		btnnxt.setBounds(400,380,100,40);

		p1.setBackground(Color.white);

		//add(p1);

		//p2 = new Panel();
		//p2.setLayout(null);
		//p2.setBounds(20,505,560,100);
		//p2.setBackground(Color.white);

		t1 = new TextField();
		t1.setBounds(0,450,570,10);
		t1.setBackground(Color.blue);
		p1.add(t1);

		btnstart = new Button("  Start  ");
		btnstart.setBounds(130,485,100,40);
		p1.add(btnstart);

		btnend = new Button("  End  ");
		btnend.setBounds(320,485,100,40);
		p1.add(btnend);

		add(p1);

		setBackground(Color.blue);
		btnstart.addMouseListener(this);
		btnend.addMouseListener(this);
		btnnxt.addMouseListener(this);
		btnprev.addMouseListener(this);
		c1.addMouseListener(this);
		c2.addMouseListener(this);
		c3.addMouseListener(this);
		c4.addMouseListener(this);
		addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent me)
			{

			}
			public void mouseExited(MouseEvent me)
			{
				System.out.println("Your Exam is End");
				System.exit(0);
			}
			public void mouseClicked(MouseEvent me)
			{

			}
			public void mouseReleased(MouseEvent me)
			{

			}
			public void mousePressed(MouseEvent me)
			{
			}
		});
	}
	public void mouseEntered(MouseEvent me)
	{

	}
	public void mouseExited(MouseEvent me)
	{
		//dispose();
	}
	public void mouseClicked(MouseEvent me)
	{

	}
	public void mouseReleased(MouseEvent me)
	{

	}
	public void mousePressed(MouseEvent me)
	{
		if(me.getSource()==btnstart)
		{
			btnstart.setEnabled(false);
			lblweloque.setBounds(30,100,550,40);
			lblweloque.setText(que[0]);
			c1.setLabel(opt[0]);
			p1.add(c1);
			c2.setLabel(opt[1]);
			p1.add(c2);
			c3.setLabel(opt[2]);
			p1.add(c3);
			c4.setLabel(opt[3]);
			p1.add(c4);
			p1.add(btnprev);
			p1.add(btnnxt);
		}
		else if(me.getSource()==btnnxt)
		{
			//c1.setSelected(false);
			//c2.setSelected(false);
			//c3.setSelected(false);
			//c4.setSelected(false);

			btnprev.setEnabled(true);
			if(x!=9)
			{
				a = a + 0 + 1;
				lblweloque.setText(que[a]);
				b = b + 4;
				c1.setLabel(opt[b]);
				p1.add(c1);
				c = c + 4;
				c2.setLabel(opt[c]);
				p1.add(c2);
				d = d + 4;
				c3.setLabel(opt[d]);
				p1.add(c3);
				e = e + 4;
				c4.setLabel(opt[e]);
				p1.add(c4);

				if(x==8)
				{
					btnnxt.setEnabled(false);
				}

				x++;
			}
		}
		else if(me.getSource()==btnprev)
		{
			btnnxt.setEnabled(true);
			if(x>0)
			{
				a = a - 1;
				lblweloque.setText(que[a]);
				b = b - 4;
				c1.setLabel(opt[b]);
				p1.add(c1);
				c = c - 4;
				c2.setLabel(opt[c]);
				p1.add(c2);
				d = d - 4;
				c3.setLabel(opt[d]);
				p1.add(c3);
				e = e - 4;
				c4.setLabel(opt[e]);
				p1.add(c4);

				x--;
				if(x==0)
				{
					btnprev.setEnabled(false);
				}
			}
		}
		else if(me.getSource()==btnend)
		{
			if(me.getSource()==c1)
			{

			}
		}
	}
/*	boolean check()
	{
	   	if(a==0)
	        return(opt[1].isSelected());
	    if(a==1)
	        return(opt[2].isSelected());
	   	if(a==2)
	        return(opt[3].isSelected());
	    if(a==3)
	        return(opt[0].isSelected());
	    if(a==4)
	        return(opt[2].isSelected());
	    if(a==5)
	        return(opt[2].isSelected());
	    if(a==6)
	        return(opt[1].isSelected());
	    if(a==7)
	    	return(opt[3].isSelected());
	    if(current==8)
			return(opt[1].isSelected());
		if(current==9)
		    return(opt[2].isSelected());
		return false;
    }
*/
}

class onl_exam_project
{
	public static void main(String args[])
	{
		ABC a = new ABC();
		a.show();
	}
}
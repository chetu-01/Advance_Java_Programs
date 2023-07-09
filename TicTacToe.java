import java.awt.*;
import java.awt.event.*;

class ABC extends Frame implements ActionListener
{
	int a=0,state=0,play1=0,play2=0,both=0,count=0;
	Button[][] barray=new Button[3][3];
	Button start,play,exit,replay;
	TextField p1nm,p2nm;
	String letter,str;
	Frame f1,f2,f3;
	Label l1,l2,l3,l4;
	Boolean win;
	Panel p1;

	ABC()
	{
		Font f = new Font("Arial",Font.BOLD,16);

    	setSize(500,500);
    	setLocation(700,300);
        setTitle("TicTacToe");

		f1 = new Frame();
		f1.setSize(500,500);
		f1.setLocation(700,300);
		f1.setLayout(null);
		f1.setFont(f);
		f1.setTitle("Welcome ...!!!");

		l1 = new Label("Tic Tac Toe");
		l1.setBounds(170,100,200,50);
		l1.setFont(new Font("Arial",Font.BOLD,30));
		start = new Button("Start");
		start.setBounds(155,230,200,50);
		start.setFont(new Font("Arial",Font.BOLD,20));

		f1.add(l1);
		f1.add(start);

		f2 = new Frame();
		f2.setSize(500,500);
		f2.setLocation(700,300);
		f2.setLayout(null);
		f2.setFont(f);
		f2.setTitle("Vs Friend");

		p1nm = new TextField(100);
		p1nm.setText("Player One Name");
		p1nm.selectAll();
		l2 = new Label("Symbol : O");
		l2.setEnabled(false);
		l2.setBounds(130,110,250,30);
		p2nm = new TextField(100);
		p2nm.setText("Player Two Name");
		p2nm.selectAll();
		l3 = new Label("Symbol : X");
		l3.setEnabled(false);
		l3.setBounds(130,170,250,30);
		p1nm.setBounds(130,140,250,30);
		p2nm.setBounds(130,200,250,30);
		play = new Button(" Play ");
		play.setBounds(180,280,150,50);

		f2.add(p1nm);
		f2.add(l2);
		f2.add(p2nm);
		f2.add(l3);
		f2.add(play);

		f3 = new Frame();
		f3.setSize(300,200);
		f3.setLocation(805,465);
		f3.setLayout(null);
		f3.setFont(f);
		f3.setTitle("Winer");

		l4 = new Label("");
		l4.setBounds(30,60,300,40);

		replay = new Button("Replay");
		replay.setBounds(170,130,100,40);

		exit = new Button("Exit");
		exit.setBounds(30,130,100,40);
		f3.add(replay);
		f3.add(exit);
		f3.add(l4);

        p1=new Panel();
        p1.setLayout(new GridLayout(3,3));
        for(int i=0;i<3;i++)
        {
			for(int j=0;j<3;j++)
			{
           		barray[i][j]=new Button("");
           		barray[i][j].setFont(new Font("Arial",Font.BOLD,80));
           		barray[i][j].addActionListener(this);
           		p1.add(barray[i][j]);
           		barray[i][j].setBackground(Color.white);
	   		}
	   	}
	   	add(p1,BorderLayout.CENTER);

	   	start.addActionListener(this);
	   	play.addActionListener(this);
	   	exit.addActionListener(this);
	   	replay.addActionListener(this);

	   	f1.show();
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==start)
		{
			f1.dispose();
			f2.show();
		}
		else if(ae.getSource()==play)
		{
			f2.dispose();
			show();
			state = 1;
		}
		else if(ae.getSource()==replay)
	    {
			replay();
		}
		else if(ae.getSource()==exit)
		{
			System.exit(0);
		}
		else if(state==1)
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
		    		if(ae.getSource()==barray[i][j])
		        	{
						if(barray[i][j].getLabel().equals(""))
				    	{
							a++;

							if(a == 1 || a == 3 || a == 5 || a == 7 || a == 9)
							{
								letter = "O";
							}
							else if(a == 2 || a == 4 || a == 6 || a == 8 || a == 10)
							{
								letter = "X";
							}
					    	barray[i][j].setLabel(letter);
					    	Checkwin();
				  		}
					}
				}
			}
		}
	}

	public void check()
	{
		// This is use for checking winner is O or X

		if(str=="O")
		{
			both = 1;
		}
		else if(str=="X")
		{
			both = 2;
		}
	}
	public void Checkwin()
	{
		//Checking Wining Conditions

		// Horizontal wins

		if(barray[0][0].getLabel() == barray[0][1].getLabel() && barray[0][1].getLabel() == barray[0][2].getLabel() && barray[0][0].getLabel() != "")
		{
			barray[0][0].setForeground(Color.red);
			barray[0][1].setForeground(Color.red);
			barray[0][2].setForeground(Color.red);
			str = barray[0][0].getLabel();
			check();
			win = true;
		}
		else if(barray[1][0].getLabel() == barray[1][1].getLabel() && barray[1][1].getLabel() == barray[1][2].getLabel() && barray[1][0].getLabel() != "")
		{
			barray[1][0].setForeground(Color.red);
			barray[1][1].setForeground(Color.red);
			barray[1][2].setForeground(Color.red);
			str = barray[1][0].getLabel();
			check();
			win = true;
		}
		else if(barray[2][0].getLabel() == barray[2][1].getLabel() && barray[2][1].getLabel() == barray[2][2].getLabel() && barray[2][0].getLabel() != "")
		{
			barray[2][0].setForeground(Color.red);
			barray[2][1].setForeground(Color.red);
			barray[2][2].setForeground(Color.red);
			str = barray[2][0].getLabel();
			check();
			win = true;
		}

		// Vertical wins

		else if(barray[0][0].getLabel() == barray[1][0].getLabel() && barray[1][0].getLabel() == barray[2][0].getLabel() && barray[0][0].getLabel() != "")
		{
			barray[0][0].setForeground(Color.red);
			barray[1][0].setForeground(Color.red);
			barray[2][0].setForeground(Color.red);
			str = barray[0][0].getLabel();
			check();
			win = true;
		}
		else if(barray[0][1].getLabel() == barray[1][1].getLabel() && barray[1][1].getLabel() == barray[2][1].getLabel() && barray[0][1].getLabel() != "")
		{
			barray[0][1].setForeground(Color.red);
			barray[1][1].setForeground(Color.red);
			barray[2][1].setForeground(Color.red);
			str = barray[0][1].getLabel();
			check();
			win = true;
		}
		else if(barray[0][2].getLabel() == barray[1][2].getLabel() && barray[1][2].getLabel() == barray[2][2].getLabel() && barray[0][2].getLabel() != "")
		{
			barray[0][2].setForeground(Color.red);
			barray[1][2].setForeground(Color.red);
			barray[2][2].setForeground(Color.red);
			str = barray[0][2].getLabel();
			check();
			win = true;
		}

		// Diagonal wins

		else if(barray[0][0].getLabel() == barray[1][1].getLabel() && barray[1][1].getLabel() == barray[2][2].getLabel() && barray[0][0].getLabel() != "")
		{
			barray[0][0].setForeground(Color.red);
			barray[1][1].setForeground(Color.red);
			barray[2][2].setForeground(Color.red);
			str = barray[0][0].getLabel();
			check();
			win = true;
		}
		else if(barray[0][2].getLabel() == barray[1][1].getLabel() && barray[1][1].getLabel() == barray[2][0].getLabel() && barray[0][2].getLabel() != "")
		{
			barray[0][2].setForeground(Color.red);
			barray[1][1].setForeground(Color.red);
			barray[2][0].setForeground(Color.red);
			str = barray[0][2].getLabel();
			check();
			win = true;
		}
		else
		{
			win = false;
		}

		// Show a dialog if someone wins or the game is tie

		if(win == true)
		{
			p1.setEnabled(false);
			if(both==1)
			{
				play1++;
				l4.setText(p1nm.getText()+" Wins "+String.valueOf(play1));
				f3.show();
			}
			else if(both==2)
			{
				play2++;
				l4.setText(p2nm.getText()+" Wins "+String.valueOf(play2));
				f3.show();
			}
			both=0;
		}
		else if(a == 9 && win == false)
		{
			f3.show();
			l4.setText("Draw Match ...!!! Play Again ...!!!");
			p1.setEnabled(false);
		}
	}
	public void replay()
	{
		// This methhod is use for play again

		f3.dispose();
		show();
		p1.setEnabled(true);
	    for(int i=0;i<3;i++)
	    {
			for(int j=0;j<3;j++)
			{
           		barray[i][j].setLabel("");
	       		barray[i][j].setBackground(Color.white);
	       		barray[i][j].setForeground(Color.black);
			}
	   	}
	   	a=0;
	    count=0;
  	}
}

class TicTacToe
{
	public static void main(String args[])
	{
		ABC A = new ABC();
	}
}
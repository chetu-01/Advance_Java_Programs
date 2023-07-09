import java.awt.*;
import java.awt.event.*;

class ABC extends Frame implements ActionListener , TextListener
{
	Label lbltxt,lblresult,lblinput;
	TextField txt,txtinput;
	TextArea t1;
	Button btnsearch,btncapital,btnsmall,btncrw;
	Panel north,east,west;

	ABC()
	{
		Font f = new Font("Arial",Font.BOLD,15);
		setFont(f);

		setLayout(new BorderLayout());

		t1 = new TextArea("",7,30,TextArea.SCROLLBARS_BOTH);
		add(t1,BorderLayout.CENTER);

		north = new Panel();

		lbltxt = new Label("Text : ");
		north.add(lbltxt);

		txt = new TextField(20);
		north.add(txt);

		btnsearch = new Button("Search");
		north.add(btnsearch);

		add(north,BorderLayout.NORTH);

		lblresult = new Label("Result :                                                            ");
		add(lblresult,BorderLayout.SOUTH);

		east = new Panel();
		east.setLayout(new GridLayout(3,1));

		btncapital = new Button("Capital");
		btncapital.setEnabled(false);
		west.add(btncapital);

		btnsmall = new Button("Small");
		btnsmall.setEnabled(false);
		west.add(btnsmall);

		btncrw = new Button("Check repeated word");
		west.add(btncrw);

		add(east,BorderLayout.EAST);

		west = new Panel();
		west.setLayout(new BorderLayout());

		lblinput = new Label("Enter the String : ");
		west.add(lblinput);
		txtinput = new TextField(10);
		west.add(txtinput);

		add(west,BorderLayout.WEST);

		btnsearch.addActionListener(this);
		btncapital.addActionListener(this);
		btnsmall.addActionListener(this);
		btncrw.addActionListener(this);
		t1.addTextListener(this);
	}

	public void textValueChanged(TextEvent te)
	{
		String str = t1.getText();

		if(isStringUpperCase(str))
		{
			btncapital.setEnabled(false);
		}
		else
		{
			btncapital.setEnabled(true);
		}

		if(isStringLowerCase(str))
		{
			btnsmall.setEnabled(false);
		}
		else
		{
			btnsmall.setEnabled(true);
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str = t1.getText();
		String str1 = txt.getText();

	/*	if(isStringUpperCase(str))
		{
			btncapital.setEnabled(true);
			btnsmall.setEnabled(false);
		}
		else if(isStringLowerCase(str))
		{
			btncapital.setEnabled(false);
			btnsmall.setEnabled(true);
		}
	*/
		if(ae.getSource()==btnsearch)
		{
			if(str.contains(str1))
			{
				lblresult.setText("Result : String is found");
			}
			else
			{
				lblresult.setText("Result : String is not found");
			}
		}
		else if(ae.getSource()==btncapital)
		{
			//btncapital.setEnabled(true);
			t1.setText(str.toUpperCase());
		}
		else if(ae.getSource()==btnsmall)
		{
			t1.setText(str.toLowerCase());
		}
		else if(ae.getSource()==btncrw)
		{
      		String input=t1.getText();
      		String[] words=input.split(" ");
      		int wrc=1;

      		for(int i=0;i<words.length;i++)
      		{
      			for(int j=i+1;j<words.length;j++)
         		{
         			if(words[i].equals(words[j]))
           			{
        				wrc=wrc+1;
            			words[j]="0";
         			}
         		}
         		if(words[i]!="0")
         		{
         			txt.setText(words[i]+"--"+wrc);
				}
         		wrc=1;
			}
		}
	}

	public static boolean isStringUpperCase(String str)
	{
		char[] charArray = str.toCharArray();

		for(int i=0; i < charArray.length; i++)
		{
	    	if( !Character.isUpperCase( charArray[i] ))
	        	return false;
		}
	  	return true;
    }

	public static boolean isStringLowerCase(String str)
	{
		char[] charArray = str.toCharArray();

		for(int i=0; i < charArray.length; i++)
		{
	    	if( !Character.isLowerCase( charArray[i] ))
	        	return false;
		}
	  	return true;
    }
}

class notepad_app
{
	public static void main(String args[])
	{
		ABC a = new ABC();
		a.show();
	}
}
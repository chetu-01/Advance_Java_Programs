import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class searching_string extends Applet implements ActionListener , TextListener
{
	Label lbltxt,lblresult;
	TextField txt;
	TextArea t1;
	Button btnsearch,btncapital,btnsmall,btncount,btninitcaps,btncwrd,btncline,btncletter;
	Panel north,east;

	public void init()
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
		east.setLayout(new GridLayout(7,1));

		btncapital = new Button("Capital");
		btncapital.setEnabled(false);
		east.add(btncapital);

		btnsmall = new Button("Small");
		btnsmall.setEnabled(false);
		east.add(btnsmall);

		btncount = new Button("Count");
		east.add(btncount);

		btninitcaps = new Button("Initial Caps");
		east.add(btninitcaps);

		btncwrd = new Button("Total Words");
		east.add(btncwrd);

		btncline = new Button("Total Lines");
		east.add(btncline);

		btncletter = new Button("Total Letters");
		east.add(btncletter);

		add(east,BorderLayout.EAST);

		btnsearch.addActionListener(this);
		btncapital.addActionListener(this);
		btnsmall.addActionListener(this);
		btncount.addActionListener(this);
		btninitcaps.addActionListener(this);
		btncwrd.addActionListener(this);
		btncline.addActionListener(this);
		btncletter.addActionListener(this);
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
		int count = 0;
		String str = t1.getText();
		String str1 = txt.getText();
		String word[]=str.split("\\s");

		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
		String lines[]=str.split("\n");

/*		if(isStringUpperCase(str))
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
				lblresult.setText("Result : String is found");
			else
				lblresult.setText("Result : String is not found");
		}
		else if(ae.getSource()==btncapital)
		{
			t1.setText(str.toUpperCase());
		}
		else if(ae.getSource()==btnsmall)
		{
			t1.setText(str.toLowerCase());
		}
		else if(ae.getSource()==btncount)
		{
		    for(int i=0;i<word.length;i++)
 		    {
 		       if(word[i].equals(str1))
 				  count++;
		    }
            lblresult.setText("Count : "+count);
		}
       	else if(ae.getSource()==btncwrd)
       	{
			lblresult.setText("Total Words : "+(word.length));
	   	}
       	else if(ae.getSource()==btncline)
       	{
			lblresult.setText("Total Lines : "+(lines.length));
	   	}
		else if(ae.getSource()==btncletter)
		{
			for(int i = 0; i < str.length(); i++)
			{
            	if(str.charAt(i) != ' ')
                	count++;
        	}
        	lblresult.setText("Total Letters : "+String.valueOf(count));
		}
		else if(ae.getSource()==btninitcaps)
		{
			char charArray[] = str.toCharArray();
			charArray[0] = (char)(charArray[0]-32);
			int i = 1;

			while(i != str.length())
			{
				if(charArray[i]==' ')
				{
					charArray[i+1] = (char) (charArray[i+1]-32);
				}
				++i;
			}
			t1.setText(String.valueOf(charArray));
		}
	}

	public static boolean isStringUpperCase(String str)
	{
		char charArray[] = str.toCharArray();

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
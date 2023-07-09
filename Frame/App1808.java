import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class App1808 extends Applet implements ActionListener
{
   Label l1,l2;
   Button b1,b2,b3,b4,b5,b6,b7;
   TextField t1;
   TextArea T1;
   Panel p1,p2;
   public void init()
   {
      setLayout(new BorderLayout());
      l1=new Label("Text :");
      l2=new Label("Result",Label.CENTER);
      b1=new Button("Search");
      b2=new Button("Count");
      b3=new Button("Total Words");
      b4=new Button("Total Lines");
      b5=new Button("UPPERCASE");
      b6=new Button("lowercase");
      b7=new Button("Capitalize Each Word");
      t1=new TextField(20);
      T1=new TextArea();

      p1=new Panel();
      p1.add(l1);
      p1.add(t1);
      p1.add(b1);
      p1.add(b2);
      p2=new Panel();
      p2.setLayout(new GridLayout(5,1));
      p2.add(b3);
      p2.add(b4);
      p2.add(b5);
      p2.add(b6);
      p2.add(b7);
      add(p1,BorderLayout.NORTH);
      add(p2,BorderLayout.EAST);
      add(T1,BorderLayout.CENTER);
      add(l2,BorderLayout.SOUTH);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
   }

   public void actionPerformed(ActionEvent ae)
   {
 		String paragraph = T1.getText();
 		String search = t1.getText();
 		String word[]=paragraph.split("\\s");
 		String lines[]=paragraph.split("\n");
 		int count=0;
 		if(ae.getSource()==b1)
 		{
 		    if(paragraph.contains(search))
 				l2.setText("Result :Search Successful Keyword Found");
 			else
 				l2.setText("Result :Search Unsuccessful Keyword Not Found");
       }
       else if(ae.getSource()==b2)
       {
 		    for(int i=0;i<word.length;i++)
 		    {
 		       if(word[i].equals(search))
 				  count++;
		    }
            l2.setText("Count : "+count);
      }
       else if(ae.getSource()==b3)
       {
			l2.setText("Total Words : "+(word.length));
	   }
       else if(ae.getSource()==b4)
       {
			l2.setText("Total Lines: "+lines.length);
	   }
       else if(ae.getSource()==b5)
       {
			T1.setText(paragraph.toUpperCase());
	   }
       else if(ae.getSource()==b6)
       {
			T1.setText(paragraph.toLowerCase());
	   }
   }
}
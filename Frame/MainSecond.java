import java.awt.*;
import java.awt.event.*;
import java.util.*;

class TicTacToe extends Frame implements ActionListener
{
    Button B[]=new Button[9];
    Random r=new Random();
    Button reset;
    Label l1;
    Panel p1,p2;
    int count=0;
    int status=0;
    int blockStatus=0;
      TicTacToe()
      {
         setSize(400,400);
         setLocation(100,100);
         setTitle("TicTacToe");
         l1=new Label("Click on Start to Play");
         reset=new Button("START");
         p1=new Panel();
         p1.setLayout(new GridLayout(3,3));
         for(int i=0;i<9;i++)
         {
           B[i]=new Button("");
           B[i].setFont(new Font("Arial",Font.BOLD,80));
           p1.add(B[i]);
           B[i].addActionListener(this);
  	     }
	     p1.setEnabled(false);
         p2=new Panel();
         p2.setLayout(new GridLayout(1,2));
         p2.add(l1);
         p2.add(reset);
         add(p2,BorderLayout.SOUTH);
         add(p1,BorderLayout.CENTER);
         reset.addActionListener(this);
         show();
      }
      public void actionPerformed(ActionEvent ae)
      {
	      if(ae.getSource()==reset)
	      {
		      reset();
		  }
		  for(int i=0;i<9;i++)
		  {
		       if(ae.getSource()==B[i])
		        {
				   if(B[i].getLabel().equals(""))
				   {
					     blockStatus=0;
					     B[i].setLabel("O");
					     B[i].setForeground(Color.green);
					     count++;
                         winner();
					     compMove(i);

					     if(status==0 && count==5)
					        l1.setText("Draw RESET to Play Again");
				   }

			    }
	 	   }
	  }
	  public void compMove(int x)
	  {
	     if(count==1)
	     {
	        if(x==0 || x==2 || x==6 || x==8)
	        {
		      B[4].setLabel("X");
		      B[4].setForeground(Color.red);
            }
            else
            {
		      B[0].setLabel("X");
		      B[0].setForeground(Color.red);
		    }
	     }
	     if(count==2)
	     {
             blockWin();
             if(blockStatus!=1)
              noForkMove();

         }
		 if(count==3 || count==4)
		 {
		    if(status!=2)
		    {
		      compWin();
		      if(status!=1)
		      {
		        blockWin();
		        if(blockStatus!=1)
		        {
		          noForkMove();
		        }
		      }
		   }
	    }
	  }
	  public void randomMove()
	  {
	  	    int random=r.nextInt(9);
	  	    while(B[random].getLabel()!="")
	  	    {
	  		     random=r.nextInt(9);
	  		}
	  	    B[random].setLabel("X");
	  	    B[random].setForeground(Color.red);

      }
      public void noForkMove()
      {
         if(B[0].getLabel().equals("X"))
         {
             if(B[1].getLabel().equals("") && B[2].getLabel().equals(""))
             {
	  	         B[2].setLabel("X");
	  	         B[2].setForeground(Color.red);
		     }
             else if(B[4].getLabel().equals("") && B[8].getLabel().equals(""))
             {
	  	         B[4].setLabel("X");
	  	         B[4].setForeground(Color.red);
		     }
             else if(B[3].getLabel().equals("") && B[6].getLabel().equals(""))
             {
	  	         B[6].setLabel("X");
	  	         B[6].setForeground(Color.red);
		     }
    		 else
     		   randomMove();

         }
         else if(B[4].getLabel().equals("X"))
         {
             if(B[1].getLabel().equals("") && B[7].getLabel().equals(""))
             {
	  	         B[1].setLabel("X");
	  	         B[1].setForeground(Color.red);
		     }
             else if(B[3].getLabel().equals("") && B[5].getLabel().equals(""))
             {
	  	         B[3].setLabel("X");
	  	         B[3].setForeground(Color.red);
		     }
             else if(B[0].getLabel().equals("") && B[8].getLabel().equals(""))
             {
	  	         B[8].setLabel("X");
	  	         B[8].setForeground(Color.red);
		     }
             else if(B[2].getLabel().equals("") && B[6].getLabel().equals(""))
             {
	  	         B[6].setLabel("X");
	  	         B[6].setForeground(Color.red);
		     }
     		 else
     		   randomMove();

		 }
	  }
	  public void blockWin()
	  {
			 if(B[1].getLabel().equals("O") && B[2].getLabel().equals("O") && B[0].getLabel().equals(""))
     		 {
        	       B[0].setLabel("X");
       		       B[0].setForeground(Color.red);
       		       blockStatus=1;
			 }
			 else if(B[3].getLabel().equals("O") && B[6].getLabel().equals("O") && B[0].getLabel().equals(""))
     		 {
        	      B[0].setLabel("X");
       		      B[0].setForeground(Color.red);
       		      blockStatus=1;
			 }
			 else if(B[4].getLabel().equals("O") && B[8].getLabel().equals("O") && B[0].getLabel().equals(""))
     		 {
                  B[0].setLabel("X");
       	          B[0].setForeground(Color.red);
       	          blockStatus=1;
			 }
			 else if(B[0].getLabel().equals("O") && B[2].getLabel().equals("O") && B[1].getLabel().equals(""))
     		 {
                  B[1].setLabel("X");
       	          B[1].setForeground(Color.red);
       	          blockStatus=1;
			 }
		     else if(B[4].getLabel().equals("O") && B[7].getLabel().equals("O") && B[1].getLabel().equals(""))
     		 {
                  B[1].setLabel("X");
       	          B[1].setForeground(Color.red);
       	          blockStatus=1;
		     }
		     else if(B[0].getLabel().equals("O") && B[1].getLabel().equals("O") && B[2].getLabel().equals(""))
     	     {
                  B[2].setLabel("X");
                  B[2].setForeground(Color.red);
       	          blockStatus=1;
		     }
		     else if(B[5].getLabel().equals("O") && B[8].getLabel().equals("O") && B[2].getLabel().equals(""))
     	     {
                  B[2].setLabel("X");
                  B[2].setForeground(Color.red);
       	          blockStatus=1;
		     }
		     else if(B[4].getLabel().equals("O") && B[6].getLabel().equals("O") && B[2].getLabel().equals(""))
     	     {
                  B[2].setLabel("X");
                  B[2].setForeground(Color.red);
       	          blockStatus=1;
		     }

			 else if(B[0].getLabel().equals("O") && B[6].getLabel().equals("O") && B[3].getLabel().equals(""))
     		 {
        	       B[3].setLabel("X");
       		       B[3].setForeground(Color.red);
       	          blockStatus=1;
			 }
			 else if(B[4].getLabel().equals("O") && B[5].getLabel().equals("O") && B[3].getLabel().equals(""))
     		 {
                   B[3].setLabel("X");
       		       B[3].setForeground(Color.red);
       	          blockStatus=1;
			 }
			 else if(B[0].getLabel().equals("O") && B[8].getLabel().equals("O") && B[4].getLabel().equals(""))
     		 {
                  B[4].setLabel("X");
       	          B[4].setForeground(Color.red);
       	          blockStatus=1;
			 }
			 else if(B[3].getLabel().equals("O") && B[5].getLabel().equals("O") && B[4].getLabel().equals(""))
     		 {
                  B[4].setLabel("X");
       	          B[4].setForeground(Color.red);
       	          blockStatus=1;
			 }
		     else if(B[1].getLabel().equals("O") && B[7].getLabel().equals("O") && B[4].getLabel().equals(""))
     		 {
                  B[4].setLabel("X");
       	          B[4].setForeground(Color.red);
       	          blockStatus=1;
		     }
		     else if(B[2].getLabel().equals("O") && B[6].getLabel().equals("O") && B[4].getLabel().equals(""))
     	     {
                  B[4].setLabel("X");
                  B[4].setForeground(Color.red);
       	          blockStatus=1;
		     }
		     else if(B[2].getLabel().equals("O") && B[8].getLabel().equals("O") && B[5].getLabel().equals(""))
     	     {
                  B[5].setLabel("X");
                  B[5].setForeground(Color.red);
       	          blockStatus=1;
		     }
		     else if(B[3].getLabel().equals("O") && B[4].getLabel().equals("O") && B[5].getLabel().equals(""))
     	     {
                  B[5].setLabel("X");
                  B[5].setForeground(Color.red);
       	          blockStatus=1;
		     }

			 else if(B[0].getLabel().equals("O") && B[3].getLabel().equals("O") && B[6].getLabel().equals(""))
     		 {
        	       B[6].setLabel("X");
       		       B[6].setForeground(Color.red);
       	          blockStatus=1;
			 }
			 else if(B[2].getLabel().equals("O") && B[4].getLabel().equals("O") && B[6].getLabel().equals(""))
     		 {
        	      B[6].setLabel("X");
       		      B[6].setForeground(Color.red);
       	          blockStatus=1;
			 }
			 else if(B[7].getLabel().equals("O") && B[8].getLabel().equals("O") && B[6].getLabel().equals(""))
     		 {
                  B[6].setLabel("X");
       	          B[6].setForeground(Color.red);
       	          blockStatus=1;
			 }
			 else if(B[1].getLabel().equals("O") && B[4].getLabel().equals("O") && B[7].getLabel().equals(""))
     		 {
                  B[7].setLabel("X");
       	          B[7].setForeground(Color.red);
       	          blockStatus=1;
			 }
		     else if(B[6].getLabel().equals("O") && B[8].getLabel().equals("O") && B[7].getLabel().equals(""))
     		 {
                  B[7].setLabel("X");
       	          B[7].setForeground(Color.red);
       	          blockStatus=1;
		     }
		     else if(B[0].getLabel().equals("O") && B[4].getLabel().equals("O") && B[8].getLabel().equals(""))
     	     {
                  B[8].setLabel("X");
                  B[8].setForeground(Color.red);
       	          blockStatus=1;
		     }
		     else if(B[2].getLabel().equals("O") && B[5].getLabel().equals("O") && B[8].getLabel().equals(""))
     	     {
                  B[8].setLabel("X");
                  B[8].setForeground(Color.red);
       	          blockStatus=1;
		     }
		     else if(B[6].getLabel().equals("O") && B[7].getLabel().equals("O") && B[8].getLabel().equals(""))
     	     {
                  B[8].setLabel("X");
                  B[8].setForeground(Color.red);
       	          blockStatus=1;
		     }
	  }
	  public void compWin()
	  {
			 if(B[1].getLabel().equals("X") && B[2].getLabel().equals("X") && B[0].getLabel().equals(""))
     		 {
        	       B[0].setLabel("X");
       		       B[0].setForeground(Color.red);
       		       winner();
			 }
			 else if(B[3].getLabel().equals("X") && B[6].getLabel().equals("X") && B[0].getLabel().equals(""))
     		 {
        	      B[0].setLabel("X");
       		      B[0].setForeground(Color.red);
			      winner();
			 }
			 else if(B[4].getLabel().equals("X") && B[8].getLabel().equals("X") && B[0].getLabel().equals(""))
     		 {
                  B[0].setLabel("X");
       	          B[0].setForeground(Color.red);
			      winner();
			 }
			 else if(B[0].getLabel().equals("X") && B[2].getLabel().equals("X") && B[1].getLabel().equals(""))
     		 {
                  B[1].setLabel("X");
       	          B[1].setForeground(Color.red);
			      winner();
			 }
		     else if(B[4].getLabel().equals("X") && B[7].getLabel().equals("X") && B[1].getLabel().equals(""))
     		 {
                  B[1].setLabel("X");
       	          B[1].setForeground(Color.red);
			      winner();
		     }
		     else if(B[0].getLabel().equals("X") && B[1].getLabel().equals("X") && B[2].getLabel().equals(""))
     	     {
                  B[2].setLabel("X");
                  B[2].setForeground(Color.red);
			      winner();
		     }
		     else if(B[5].getLabel().equals("X") && B[8].getLabel().equals("X") && B[2].getLabel().equals(""))
     	     {
                  B[2].setLabel("X");
                  B[2].setForeground(Color.red);
			      winner();
		     }
		     else if(B[4].getLabel().equals("X") && B[6].getLabel().equals("X") && B[2].getLabel().equals(""))
     	     {
                  B[2].setLabel("X");
                  B[2].setForeground(Color.red);
			      winner();
		     }

			 else if(B[0].getLabel().equals("X") && B[6].getLabel().equals("X") && B[3].getLabel().equals(""))
     		 {
        	       B[3].setLabel("X");
       		       B[3].setForeground(Color.red);
			      winner();
			 }
			 else if(B[4].getLabel().equals("X") && B[5].getLabel().equals("X") && B[3].getLabel().equals(""))
     		 {
                   B[3].setLabel("X");
       		       B[3].setForeground(Color.red);
			      winner();
			 }
			 else if(B[0].getLabel().equals("X") && B[8].getLabel().equals("X") && B[4].getLabel().equals(""))
     		 {
                  B[4].setLabel("X");
       	          B[4].setForeground(Color.red);
			      winner();
			 }
			 else if(B[3].getLabel().equals("X") && B[5].getLabel().equals("X") && B[4].getLabel().equals(""))
     		 {
                  B[4].setLabel("X");
       	          B[4].setForeground(Color.red);
			      winner();
			 }
		     else if(B[1].getLabel().equals("X") && B[7].getLabel().equals("X") && B[4].getLabel().equals(""))
     		 {
                  B[4].setLabel("X");
       	          B[4].setForeground(Color.red);
			      winner();
		     }
		     else if(B[2].getLabel().equals("X") && B[6].getLabel().equals("X") && B[4].getLabel().equals(""))
     	     {
                  B[4].setLabel("X");
                  B[4].setForeground(Color.red);
			      winner();
		     }
		     else if(B[2].getLabel().equals("X") && B[8].getLabel().equals("X") && B[5].getLabel().equals(""))
     	     {
                  B[5].setLabel("X");
                  B[5].setForeground(Color.red);
			      winner();
		     }
		     else if(B[3].getLabel().equals("X") && B[4].getLabel().equals("X") && B[5].getLabel().equals(""))
     	     {
                  B[5].setLabel("X");
                  B[5].setForeground(Color.red);
			      winner();
		     }

			 else if(B[0].getLabel().equals("X") && B[3].getLabel().equals("X") && B[6].getLabel().equals(""))
     		 {
        	       B[6].setLabel("X");
       		       B[6].setForeground(Color.red);
			      winner();
			 }
			 else if(B[2].getLabel().equals("X") && B[4].getLabel().equals("X") && B[6].getLabel().equals(""))
     		 {
        	      B[6].setLabel("X");
       		      B[6].setForeground(Color.red);
			      winner();
			 }
			 else if(B[7].getLabel().equals("X") && B[8].getLabel().equals("X") && B[6].getLabel().equals(""))
     		 {
                  B[6].setLabel("X");
       	          B[6].setForeground(Color.red);
			      winner();
			 }
			 else if(B[1].getLabel().equals("X") && B[4].getLabel().equals("X") && B[7].getLabel().equals(""))
     		 {
                  B[7].setLabel("X");
       	          B[7].setForeground(Color.red);
			      winner();
			 }
		     else if(B[6].getLabel().equals("X") && B[8].getLabel().equals("X") && B[7].getLabel().equals(""))
     		 {
                  B[7].setLabel("X");
       	          B[7].setForeground(Color.red);
			      winner();
		     }
		     else if(B[0].getLabel().equals("X") && B[4].getLabel().equals("X") && B[8].getLabel().equals(""))
     	     {
                  B[8].setLabel("X");
                  B[8].setForeground(Color.red);
			      winner();
		     }
		     else if(B[2].getLabel().equals("X") && B[5].getLabel().equals("X") && B[8].getLabel().equals(""))
     	     {
                  B[8].setLabel("X");
                  B[8].setForeground(Color.red);
			      winner();
		     }
		     else if(B[6].getLabel().equals("X") && B[7].getLabel().equals("X") && B[8].getLabel().equals(""))
     	     {
                  B[8].setLabel("X");
                  B[8].setForeground(Color.red);
			      winner();
		     }

	  }
	  public void winner()
	  {
	       if((B[0].getLabel().equals("O")) && (B[1].getLabel().equals("O")) && (B[2].getLabel().equals("O")))
	           userWins(0,1,2);
	       if((B[3].getLabel().equals("O")) && (B[4].getLabel().equals("O")) && (B[5].getLabel().equals("O")))
	           userWins(3,4,5);
	       if((B[6].getLabel().equals("O")) && (B[7].getLabel().equals("O")) && (B[8].getLabel().equals("O")))
	           userWins(6,7,8);
	       if((B[0].getLabel().equals("O")) && (B[3].getLabel().equals("O")) && (B[6].getLabel().equals("O")))
	           userWins(0,3,6);
	       if((B[1].getLabel().equals("O")) && (B[4].getLabel().equals("O")) && (B[7].getLabel().equals("O")))
	           userWins(1,4,7);
	       if((B[2].getLabel().equals("O")) && (B[5].getLabel().equals("O")) && (B[8].getLabel().equals("O")))
	           userWins(2,5,8);
	       if((B[0].getLabel().equals("O")) && (B[4].getLabel().equals("O")) && (B[8].getLabel().equals("O")))
	           userWins(0,4,8);
	       if((B[2].getLabel().equals("O")) && (B[4].getLabel().equals("O")) && (B[6].getLabel().equals("O")))
	           userWins(2,4,6);

	       if((B[0].getLabel().equals("X")) && (B[1].getLabel().equals("X")) && (B[2].getLabel().equals("X")))
	           compWins(0,1,2);
	       if((B[3].getLabel().equals("X")) && (B[4].getLabel().equals("X")) && (B[5].getLabel().equals("X")))
	           compWins(3,4,5);
	       if((B[6].getLabel().equals("X")) && (B[7].getLabel().equals("X")) && (B[8].getLabel().equals("X")))
	           compWins(6,7,8);
	       if((B[0].getLabel().equals("X")) && (B[3].getLabel().equals("X")) && (B[6].getLabel().equals("X")))
	           compWins(0,3,6);
	       if((B[1].getLabel().equals("X")) && (B[4].getLabel().equals("X")) && (B[7].getLabel().equals("X")))
	           compWins(1,4,7);
	       if((B[2].getLabel().equals("X")) && (B[5].getLabel().equals("X")) && (B[8].getLabel().equals("X")))
	           compWins(2,5,8);
	       if((B[0].getLabel().equals("X")) && (B[4].getLabel().equals("X")) && (B[8].getLabel().equals("X")))
	           compWins(0,4,8);
	       if((B[2].getLabel().equals("X")) && (B[4].getLabel().equals("X")) && (B[6].getLabel().equals("X")))
	           compWins(2,4,6);
      }
      public void userWins(int a, int b,int c)
      {
	       B[a].setBackground(Color.green);
	       B[b].setBackground(Color.green);
	       B[c].setBackground(Color.green);
	       B[a].setForeground(Color.white);
	       B[b].setForeground(Color.white);
	       B[c].setForeground(Color.white);
	       p1.setEnabled(false);
	       l1.setText("Congratulations!!! You Won");
	       status=2;
	  }
      public void compWins(int a, int b,int c)
      {
	       B[a].setBackground(Color.red);
	       B[b].setBackground(Color.red);
	       B[c].setBackground(Color.red);
	       B[a].setForeground(Color.white);
	       B[b].setForeground(Color.white);
	       B[c].setForeground(Color.white);
	       p1.setEnabled(false);
	       l1.setText("Sorry!!! You Lose");
	       status=1;
	  }
	  public void reset()
	  {
	      p1.setEnabled(true);
	      l1.setText("TicTacToe");
	      for(int i=0;i<9;i++)
	      {
           B[i].setLabel("");
	       B[i].setBackground(Color.white);
	      }
	      count=0;
          reset.setLabel("RESET");
          status=0;
	  }
}
class MainSecond
{
   public static void main(String args[])
   {
       TicTacToe obj=new TicTacToe();
   }
}
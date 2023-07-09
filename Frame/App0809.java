import java.awt.*;
import javax.swing.*;

class UI extends JFrame
{
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
   JButton b1,b2,b3;
   JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
   JPanel p1,p2,p3,p4,p5;

   UI()
   {
        setLocation(100,100);
        setSize(400,300);
        setTitle("User Interface");

        l1=new JLabel("GALAXY COMPUTER EDUCATION",JLabel.CENTER);
        l2=new JLabel("COMPETITION IN LOCKDOWN",JLabel.CENTER);
        l3=new JLabel("Group ID");
        l4=new JLabel("Group Name");
        l5=new JLabel("Members Description");
        l6=new JLabel("Sr. No.",JLabel.CENTER);
        l7=new JLabel("Members Name",JLabel.CENTER);
        l8=new JLabel("Branch",JLabel.CENTER);
        l9=new JLabel("City",JLabel.CENTER);
        l10=new JLabel("1",JLabel.CENTER);
        l11=new JLabel("2",JLabel.CENTER);
        l12=new JLabel("3",JLabel.CENTER);
        l13=new JLabel("4",JLabel.CENTER);

        b1=new JButton("Submit");
        b2=new JButton("Verified");
        b3=new JButton("Demo");

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();
        t7=new JTextField();
        t8=new JTextField();
        t9=new JTextField();
        t10=new JTextField();
        t11=new JTextField();
        t12=new JTextField();
        t13=new JTextField();
        t14=new JTextField();

        p1=new JPanel();
        p1.setLayout(new GridLayout(2,1));
        p1.add(l1);
		p1.add(l2);
 	    add(p1,BorderLayout.NORTH);

        p2=new JPanel();
        p2.setLayout(new BorderLayout());
        p3=new JPanel();
        p3.setLayout(new GridLayout(2,2));
        p3.add(l3);
        p3.add(t1);
        p3.add(l4);
        p3.add(t2);
        p2.add(p3,BorderLayout.NORTH);
        p2.add(l5,BorderLayout.CENTER);
        p4=new JPanel();
        p4.setLayout(new GridLayout(5,4));
        p4.add(l6);
        p4.add(l7);
        p4.add(l8);
        p4.add(l9);
        p4.add(l10);
        p4.add(t3);
        p4.add(t4);
        p4.add(t5);
        p4.add(l11);
        p4.add(t6);
        p4.add(t7);
        p4.add(t8);
        p4.add(l12);
        p4.add(t9);
        p4.add(t10);
        p4.add(t11);
        p4.add(l13);
        p4.add(t12);
        p4.add(t13);
        p4.add(t14);
        p2.add(p4,BorderLayout.SOUTH);
        add(p2,BorderLayout.CENTER);
        p5=new JPanel();
        p5.setLayout(new GridLayout(1,3));
        p5.add(b1);
        p5.add(b2);
        p5.add(b3);
        add(p5,BorderLayout.SOUTH);
        show();
   }
}
public class App0809
{
  public static void main(String args[])
  {
     UI obj=new UI();
  }
}
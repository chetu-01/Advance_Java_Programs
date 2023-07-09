import java.awt.*;
import javax.swing.*;

class ABC extends JFrame
{
	JLabel lblheading1,lblheading2,lblgid,lblgnm,lblmdes,lblsrno,lblmnm,lblbranch,lblcity,a;
	JLabel[] lblno = new JLabel[4];
	JTextField txtgid,txtgnm;
	JTextField[] txtmnm = new JTextField[4];
	JTextField[] txtbranch = new JTextField[4];
	JTextField[] txtcity = new JTextField[4];
	JPanel[] p = new JPanel[4];
	JButton btnsubmit,btnverified,btndemo;

	ABC()
	{
		Font f = new Font("Arial",Font.BOLD,18);
		setFont(f);
		setLayout(new BorderLayout());
		setSize(600,400);
		setLocation(300,200);
		setTitle("Galaxy Computer Education");

		for(int i = 0; i < 4; i++)
		{
			lblno[i] = new JLabel("        "+String.valueOf(i+1));
			txtmnm[i] = new JTextField(40);
			txtbranch[i] = new JTextField(30);
			txtcity[i] = new JTextField(30);
			p[i] = new JPanel();
		}

		p[0].setLayout(new GridLayout(2,1));
		lblheading1 = new JLabel("              GALAXY COMUTER EDUCATION");
		lblheading1.setBounds(10,20,60,25);
		lblheading1.setFont(new Font("Arial",Font.BOLD,25));
		lblheading2 = new JLabel("                           COMPITION IN LOCKDOWN");
		lblheading1.setBounds(10,40,60,25);
		lblheading2.setFont(new Font("Arial",Font.BOLD,20));
		p[0].add(lblheading1);
		p[0].add(lblheading2);
		add(BorderLayout.NORTH,p[0]);

		p[1].setLayout(null);
		lblgid = new JLabel("Group Id  : ");
		lblgid.setBounds(10,20,60,25);
		txtgid = new JTextField(10);
		txtgid.setBounds(100,20,100,25);
		lblgnm = new JLabel("Group Name  : ");
		lblgnm.setBounds(10,60,100,25);
		txtgnm = new JTextField(30);
		txtgnm.setBounds(100,60,250,25);
		lblmdes = new JLabel("Members Description  : ");
		lblmdes.setBounds(10,100,150,25);
		p[1].add(lblgid);
		p[1].add(txtgid);
		p[1].add(lblgnm);
		p[1].add(txtgnm);
		p[1].add(lblmdes);
		add(BorderLayout.CENTER,p[1]);

		p[2].setLayout(new GridLayout(6,4));

		lblsrno = new JLabel("Sr. No.");
		lblmnm = new JLabel("Members Name");
		lblbranch = new JLabel("Branch");
		lblcity = new JLabel("City");
		btnsubmit = new JButton("Submit");
		btnverified = new JButton("Verified");
		btndemo = new JButton("Demo");
		a = new JLabel("");

		p[2].add(lblsrno);
		p[2].add(lblmnm);
		p[2].add(lblbranch);
		p[2].add(lblcity);
		p[2].add(lblno[0]);
		p[2].add(txtmnm[0]);
		p[2].add(txtbranch[0]);
		p[2].add(txtcity[0]);
		p[2].add(lblno[1]);
		p[2].add(txtmnm[1]);
		p[2].add(txtbranch[1]);
		p[2].add(txtcity[1]);
		p[2].add(lblno[2]);
		p[2].add(txtmnm[2]);
		p[2].add(txtbranch[2]);
		p[2].add(txtcity[2]);
		p[2].add(lblno[3]);
		p[2].add(txtmnm[3]);
		p[2].add(txtbranch[3]);
		p[2].add(txtcity[3]);
		p[2].add(a);
		p[2].add(btnsubmit);
		p[2].add(btnverified);
		p[2].add(btndemo);
		add(BorderLayout.SOUTH,p[2]);
	}
}

class gceducation_ui
{
	public static void main(String args[])
	{
		ABC A = new ABC();
		A.show();
	}
}
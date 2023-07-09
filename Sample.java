import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ABC extends JFrame
{
	JLabel addFaculty,fdatasave,ffnm,flnm,femailID,fpass,fcpass,fgender,fmoNO;
	JTextField ftfnm,ftlnm,ftemailID,ftmNO;
	JPasswordField password,cpassword;
	JComboBox fgen;
	JButton fsave,freset;

    public ABC()
    {
		Font f = new Font("Arial",Font.BOLD,17);

      	setSize(1900,1000);
        setLocation(0,0);
        setTitle("College Attendance System");
        setLayout(null);

        addFaculty = new JLabel("Add Faculty");
        addFaculty.setBounds(150,180,250,50);
        addFaculty.setFont(new Font("Lato Black",Font.BOLD,40));
        add(addFaculty);

        fdatasave = new JLabel();
        fdatasave.setBounds(150,220,250,50);
        fdatasave.setForeground(new Color(0,128,0));
        fdatasave.setFont(new Font("Arial",Font.BOLD,18));
        add(fdatasave);

        ffnm = new JLabel("First Name :");
        ffnm.setBounds(150,290,140,50);
        ffnm.setFont(f);
        add(ffnm);

        ftfnm = new JTextField();
		ftfnm.setBounds(150,330,300,50);
        ftfnm.setFont(new Font("Arial",Font.PLAIN,27));
        add(ftfnm);

        flnm = new JLabel("Last Name :");
        flnm.setBounds(500,290,140,50);
        flnm.setFont(f);
        add(flnm);

        ftlnm = new JTextField();
        ftlnm.setBounds(500,330,300,50);
        ftlnm.setFont(new Font("Arial",Font.PLAIN,27));
        add(ftlnm);

        femailID = new JLabel("Login Id :");
        femailID.setBounds(150,390,140,50);
        femailID.setFont(f);
        add(femailID);

        ftemailID = new JTextField();
        ftemailID.setBounds(150,430,650,50);
        ftemailID.setFont(new Font("Arial",Font.PLAIN,27));
        add(ftemailID);

        fpass = new JLabel("Password :");
        fpass.setBounds(150,490,140,50);
        fpass.setFont(f);
        add(fpass);

        password = new JPasswordField();
        password.setBounds(150,530,300,50);
        password.setFont(new Font("Arial",Font.PLAIN,27));
        add(password);

        fcpass = new JLabel("Confirm Password :");
        fcpass.setBounds(500,490,200,50);
        fcpass.setFont(f);
        add(fcpass);

        cpassword = new JPasswordField();
        cpassword.setBounds(500,530,300,50);
        cpassword.setFont(new Font("Arial",Font.PLAIN,27));
        add(cpassword);

        fgender = new JLabel("Gender :");
        fgender.setBounds(150,590,140,50);
        fgender.setFont(f);
        add(fgender);

		fgen = new JComboBox();
		fgen.setFont(new Font("Arial",Font.PLAIN,27));
		fgen.setBounds(150,630,650,50);
		fgen.addItem("Male");
		fgen.addItem("Female");
		add(fgen);

		fmoNO = new JLabel("Mobile No :");
		fmoNO.setBounds(150,690,140,50);
		fmoNO.setFont(f);
		add(fmoNO);

		ftmNO = new JTextField();
		ftmNO.setBounds(150,730,300,50);
		ftmNO.setFont(new Font("Arial",Font.PLAIN,27));
		add(ftmNO);

		fsave = new JButton("Save");
		fsave.setBounds(150,830,170,50);
		fsave.setFont(new Font("Arial",Font.PLAIN,27));
		add(fsave);

		freset = new JButton("Reset");
		freset.setBounds(350,830,170,50);
		freset.setFont(new Font("Arial",Font.PLAIN,27));
		add(freset);
  	}
}

public class Sample
{
    public static void main(String[] args)
    {
        ABC A = new ABC();
        A.setVisible(true);
    }
}
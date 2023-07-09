import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

class Admin extends JFrame implements ActionListener, ItemListener
{
    JPanel facultyAdd, facultyView, studentAdd, studentView;
    JPanel attendanceAdd, attendanceView;

    JMenuBar jMenuBar1, jMenuBar2;
    JMenu faculty, astudent, attendance, fstudent;
    JMenu a1, a2, a3, a4, aLogout;
    JMenu b1, b2, b3, b4, bLogout;
    JMenuItem addFaculty, viewFaculty, addaStudent, viewaStudent, addfStudent, viewfStudent, addAttendance, viewAttendance;
    JLabel login, loginID, password, notlogin, addStud;
    JTextField txtlID;
    final JPasswordField pass;
    JButton signin;
    JPanel adminPanel, facultyPanel;
    JComboBox userType;

    JLabel addStu, sfnm, slnm, semailID, sgender, smoNO, fmNO;
    JTextField stfnm, stlnm, stemailID, stmNO, tfNO;
    JComboBox sgen;
    JButton ssave, sreset;

    JLabel addFac, ffnm, flnm, femailID, fpass, fcpass, fgender, fmoNO;
    JTextField ftfnm, ftlnm, ftemailID, ftmNO;
    JPasswordField passw, cpassword;
    JComboBox fgen;
    JButton fsave, freset;

    JTable stable, ftable, addatable, vatable;
    JTableHeader tableHeader1, tableHeader2, tableHeader3, tableHeader4;

    JLabel addAtten, viewAtten, asubject, adate;
    JComboBox asub;
    JTextField adet;
    JButton asubmit;
    Date date;
    SimpleDateFormat formatter;

    JLabel vasubject, vadate;
    JComboBox vasub;
    JTextField vadet;
    JButton vasubmit;

    String gender = "";
    String gend = "";
	TableCheckBOX model;
    FetchInfo fmodel;
    FetchsInfo smodel;

    public Admin()
    {
        Font f = new Font("Arial", Font.BOLD, 16);

        setSize(1340,720);
        setLocation(0, 0);
        setTitle("College Attendance System");
        setLayout(null);

        // Main Login
        login = new JLabel("Login");
        login.setBounds(100, 50, 120, 50);
        login.setFont(new Font("Lato Black", Font.BOLD, 40));
        add(login);

        userType = new JComboBox();
        userType.setFont(new Font("Arial", Font.PLAIN, 27));
        userType.addItem("-- Select User Type --");
        userType.addItem("Admin");
        userType.addItem("Faculty");
        userType.setBounds(150, 140, 400, 40);
        add(userType);

        loginID = new JLabel("Login ID :");
        loginID.setFont(f);
        loginID.setBounds(150, 200, 120, 40);
        add(loginID);

        txtlID = new JTextField();
        txtlID.setFont(new Font("Arial", Font.PLAIN, 27));
        txtlID.setBounds(150, 240, 400, 40);
        add(txtlID);

        password = new JLabel("Password :");
        password.setFont(f);
        password.setBounds(150, 300, 120, 40);
        add(password);

        pass = new JPasswordField();
        pass.setFont(new Font("Arial", Font.PLAIN, 27));
        pass.setBounds(150, 335, 400, 40);
        add(pass);

        signin = new JButton("Sign In");
        signin.setFont(new Font("Arial", Font.PLAIN, 27));
        signin.setBounds(150, 420, 200, 40);
        signin.setBackground(new Color(0, 217, 0));
        add(signin);

        notlogin = new JLabel();
        notlogin.setFont(f);
        notlogin.setForeground(Color.RED);
        notlogin.setBounds(150, 480, 350, 40);
        add(notlogin);

        // Admin Login
        //Add Student
        studentAdd = new JPanel();
        studentAdd.setSize(1340,720);
        studentAdd.setLocation(0, 0);
        studentAdd.setLayout(null);

        addStu = new JLabel("Add Student");
        addStu.setBounds(100, 50, 250, 40);
        addStu.setFont(new Font("Lato Black", Font.BOLD, 40));
        studentAdd.add(addStu);

        sfnm = new JLabel("First Name :");
        sfnm.setBounds(150, 130, 140, 40);
        sfnm.setFont(f);
        studentAdd.add(sfnm);

        stfnm = new JTextField();
        stfnm.setBounds(150, 170, 300, 40);
        stfnm.setFont(new Font("Arial", Font.PLAIN, 27));
        studentAdd.add(stfnm);

        slnm = new JLabel("Last Name :");
        slnm.setBounds(500, 130, 140, 40);
        slnm.setFont(f);
        studentAdd.add(slnm);

        stlnm = new JTextField();
        stlnm.setBounds(500, 170, 300, 40);
        stlnm.setFont(new Font("Arial", Font.PLAIN, 27));
        studentAdd.add(stlnm);

        semailID = new JLabel("Email Id :");
        semailID.setBounds(150, 230, 140, 40);
        semailID.setFont(f);
        studentAdd.add(semailID);

        stemailID = new JTextField();
        stemailID.setBounds(150, 270, 650, 40);
        stemailID.setFont(new Font("Arial", Font.PLAIN, 27));
        studentAdd.add(stemailID);

        sgender = new JLabel("Gender :");
        sgender.setBounds(150, 330, 140, 40);
        sgender.setFont(f);
        studentAdd.add(sgender);

        sgen = new JComboBox();
        sgen.setFont(new Font("Arial", Font.PLAIN, 27));
        sgen.setBounds(150, 370, 650, 40);
        sgen.addItem("-- Select Gender --");
        sgen.addItem("Male");
        sgen.addItem("Female");
        studentAdd.add(sgen);

        smoNO = new JLabel("Mobile No :");
        smoNO.setBounds(150, 430, 140, 40);
        smoNO.setFont(f);
        studentAdd.add(smoNO);

        stmNO = new JTextField();
        stmNO.setBounds(150, 470, 300, 40);
        stmNO.setFont(new Font("Arial", Font.PLAIN, 27));
        studentAdd.add(stmNO);

        fmNO = new JLabel("Father Mobile Number :");
        fmNO.setBounds(500, 430, 300, 40);
        fmNO.setFont(f);
        studentAdd.add(fmNO);

        tfNO = new JTextField();
        tfNO.setBounds(500, 470, 300, 40);
        tfNO.setFont(new Font("Arial", Font.PLAIN, 27));
        studentAdd.add(tfNO);

        ssave = new JButton("Save");
        ssave.setBounds(150, 550, 170, 40);
        ssave.setFont(new Font("Arial", Font.PLAIN, 27));
        studentAdd.add(ssave);

        sreset = new JButton("Reset");
        sreset.setBounds(350, 550, 170, 40);
        sreset.setFont(new Font("Arial", Font.PLAIN, 27));
        studentAdd.add(sreset);

        add(studentAdd);

        // View Student
        studentView = new JPanel();
        studentView.setSize(1340,720);
        studentView.setLocation(0, 0);
        studentView.setLayout(new BorderLayout());

        smodel = new FetchsInfo();
        stable = new JTable((TableModel) smodel);
        stable.setFont(new Font("Arial", Font.PLAIN, 20));
        stable.setRowHeight(30);
        JScrollPane JSc = new JScrollPane(stable);
        JSc.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JSc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        studentView.add(JSc);

        studentView.add(new JScrollPane(stable));

        add(studentView);

        // Add Faculty
        facultyAdd = new JPanel();
        facultyAdd.setSize(1340,720);
        facultyAdd.setLocation(0, 0);
        facultyAdd.setLayout(null);

        addFac = new JLabel("Add Faculty");
        addFac.setBounds(100, 40, 250, 40);
        addFac.setFont(new Font("Lato Black", Font.BOLD, 40));
        facultyAdd.add(addFac);

        ffnm = new JLabel("First Name :");
        ffnm.setBounds(150, 110, 140, 40);
        ffnm.setFont(f);
        facultyAdd.add(ffnm);

        ftfnm = new JTextField();
        ftfnm.setBounds(150, 150, 300, 40);
        ftfnm.setFont(new Font("Arial", Font.PLAIN, 27));
        facultyAdd.add(ftfnm);

        flnm = new JLabel("Last Name :");
        flnm.setBounds(500, 110, 140, 40);
        flnm.setFont(f);
        facultyAdd.add(flnm);

        ftlnm = new JTextField();
        ftlnm.setBounds(500, 150, 300, 40);
        ftlnm.setFont(new Font("Arial", Font.PLAIN, 27));
        facultyAdd.add(ftlnm);

        femailID = new JLabel("Login Id :");
        femailID.setBounds(150, 200, 140, 40);
        femailID.setFont(f);
        facultyAdd.add(femailID);

        ftemailID = new JTextField();
        ftemailID.setBounds(150, 240, 650, 40);
        ftemailID.setFont(new Font("Arial", Font.PLAIN, 27));
        facultyAdd.add(ftemailID);

        fpass = new JLabel("Password :");
        fpass.setBounds(150, 300, 140, 40);
        fpass.setFont(f);
        facultyAdd.add(fpass);

        passw = new JPasswordField();
        passw.setBounds(150, 340, 300, 40);
        passw.setFont(new Font("Arial", Font.PLAIN, 27));
        facultyAdd.add(passw);

        fcpass = new JLabel("Confirm Password :");
        fcpass.setBounds(500, 300, 200, 40);
        fcpass.setFont(f);
        facultyAdd.add(fcpass);

        cpassword = new JPasswordField();
        cpassword.setBounds(500, 340, 300, 40);
        cpassword.setFont(new Font("Arial", Font.PLAIN, 27));
        facultyAdd.add(cpassword);

        fgender = new JLabel("Gender :");
        fgender.setBounds(150, 400, 140, 40);
        fgender.setFont(f);
        facultyAdd.add(fgender);

        fgen = new JComboBox();
        fgen.setFont(new Font("Arial", Font.PLAIN, 27));
        fgen.setBounds(150, 440, 650, 40);
        fgen.addItem("-- Select Gender --");
        fgen.addItem("Male");
        fgen.addItem("Female");
        facultyAdd.add(fgen);

        fmoNO = new JLabel("Mobile No :");
        fmoNO.setBounds(150, 500, 140, 40);
        fmoNO.setFont(f);
        facultyAdd.add(fmoNO);

        ftmNO = new JTextField();
        ftmNO.setBounds(150, 540, 300, 40);
        ftmNO.setFont(new Font("Arial", Font.PLAIN, 27));
        facultyAdd.add(ftmNO);

        fsave = new JButton("Save");
        fsave.setBounds(150, 600, 170, 40);
        fsave.setFont(new Font("Arial", Font.PLAIN, 27));
        facultyAdd.add(fsave);

        freset = new JButton("Reset");
        freset.setBounds(350, 600, 170, 40);
        freset.setFont(new Font("Arial", Font.PLAIN, 27));
        facultyAdd.add(freset);

        add(facultyAdd);

        // View Faculty

        facultyView = new JPanel();
        facultyView.setSize(1340,720);
        facultyView.setLocation(0, 0);
        facultyView.setLayout(new BorderLayout());

        fmodel = new FetchInfo();
        ftable = new JTable((TableModel) fmodel);
        ftable.setFont(new Font("Arial", Font.PLAIN, 20));
        ftable.setRowHeight(30);
        JScrollPane JSp = new JScrollPane(ftable);
        JSp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JSp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        facultyView.add(JSp);

        facultyView.add(new JScrollPane(ftable));

        add(facultyView);

        // Faculty Login

        // Add Attendance

        attendanceAdd = new JPanel();
        attendanceAdd.setSize(1340,720);
        attendanceAdd.setLocation(0, 0);
        attendanceAdd.setLayout(null);

        addAtten = new JLabel("Add Attendance");
        addAtten.setBounds(100, 40, 350, 40);
        addAtten.setFont(new Font("Lato Black", Font.BOLD, 40));
        attendanceAdd.add(addAtten);

        asubject = new JLabel("Subject");
        asubject.setBounds(150, 110, 200, 40);
        asubject.setFont(f);
        attendanceAdd.add(asubject);

        asub = new JComboBox();
        asub.setFont(new Font("Arial", Font.PLAIN, 27));
        asub.setBounds(150, 150, 350, 40);
        asub.addItem("-- Select Subject --");
        asub.addItem("Advanced Java Programming");
        asub.addItem("Client Side Scripting Language");
        asub.addItem("Operating System");
        asub.addItem("Software Testing");
        asub.addItem("Enviornmental Studies");
        attendanceAdd.add(asub);

        adate = new JLabel("Date");
        adate.setBounds(700, 110, 200, 40);
        adate.setFont(f);
        attendanceAdd.add(adate);

        adet = new JTextField();
        adet.setEnabled(false);
        adet.setFont(new Font("Arial", Font.BOLD, 27));
        adet.setBounds(700, 150, 350, 40);
        attendanceAdd.add(adet);

        formatter = new SimpleDateFormat("dd/MM/yyyy");
        date = new Date();
        adet.setText(formatter.format(date));

        model = new TableCheckBOX();

        addatable = new JTable((TableModel) model);
        addatable.setFont(new Font("Arial", Font.PLAIN, 18));
        addatable.setRowHeight(30);
        JScrollPane JS = new JScrollPane(addatable);
        JS.setBounds(40, 220, 1235,300);
        attendanceAdd.add(JS);

        asubmit = new JButton("Submit");
        asubmit.setBounds(580, 550, 170, 50);
        asubmit.setFont(new Font("Arial", Font.PLAIN, 27));
        attendanceAdd.add(asubmit);

        add(attendanceAdd);

        // View Attendance

        attendanceView = new JPanel();
        attendanceView.setSize(1340,720);
        attendanceView.setLocation(0, 0);
        attendanceView.setLayout(null);

        viewAtten = new JLabel("View Attendance");
        viewAtten.setBounds(100, 40, 350, 40);
        viewAtten.setFont(new Font("Lato Black", Font.BOLD, 40));
        attendanceView.add(viewAtten);

        vasubject = new JLabel("Subject");
        vasubject.setBounds(150, 110, 200, 40);
        vasubject.setFont(f);
        attendanceView.add(vasubject);

        vasub = new JComboBox();
        vasub.setFont(new Font("Arial", Font.PLAIN, 27));
        vasub.setBounds(150, 150, 350, 40);
        vasub.addItem("-- Select Subject --");
        vasub.addItem("Advanced Java Programming");
        vasub.addItem("Client Side Scripting Language");
        vasub.addItem("Operating System");
        vasub.addItem("Software Testing");
        vasub.addItem("Enviornmental Studies");
        attendanceView.add(vasub);

        vadate = new JLabel("Date");
        vadate.setBounds(700, 110, 200, 40);
        vadate.setFont(f);
        attendanceView.add(vadate);

        vadet = new JTextField();
        vadet.setFont(new Font("Arial", Font.BOLD, 27));
        vadet.setBounds(700, 150, 350, 40);
        attendanceView.add(vadet);

        vatable = new JTable();
        vatable.setFont(new Font("Arial", Font.PLAIN, 20));
        vatable.setRowHeight(30);

        JScrollPane jsp = new JScrollPane(vatable);
        jsp.setBounds(40, 220, 1235 , 300);
        attendanceView.add(jsp);

        vasubmit = new JButton("Fetch Data");
        vasubmit.setBounds(580, 550, 170, 50);
        vasubmit.setFont(new Font("Arial", Font.PLAIN, 27));
        attendanceView.add(vasubmit);

        add(attendanceView);

        // Admin Menubar
        jMenuBar1 = new JMenuBar();

        faculty = new JMenu("Faculty");
        faculty.setFont(f);
        addFaculty = new JMenuItem("Add Faculty");
        addFaculty.setFont(f);
        faculty.add(addFaculty);
        viewFaculty = new JMenuItem("View Faculty");
        viewFaculty.setFont(f);
        faculty.add(viewFaculty);
        jMenuBar1.add(faculty);

        astudent = new JMenu("Student");
        astudent.setFont(f);
        addaStudent = new JMenuItem("Add Student");
        addaStudent.setFont(f);
        astudent.add(addaStudent);
        viewaStudent = new JMenuItem("View Student");
        viewaStudent.setFont(f);
        astudent.add(viewaStudent);
        jMenuBar1.add(astudent);

        a1 = new JMenu("                                                                                     ");
        a1.setEnabled(false);
        jMenuBar1.add(a1);

        a2 = new JMenu("                                                                                     ");
        a2.setEnabled(false);
        jMenuBar1.add(a2);

        a3 = new JMenu("                                                                                     ");
        a3.setEnabled(false);
        jMenuBar1.add(a3);

        a4 = new JMenu("                                                                                     ");
        a4.setEnabled(false);
        jMenuBar1.add(a4);

        aLogout = new JMenu("        Logout        ");
        aLogout.setFont(f);
        jMenuBar1.add(aLogout);

        aLogout.addMenuListener(new MenuListener()
        {
            public void menuSelected(MenuEvent e)
            {
                txtlID.setText("");
                pass.setText("");
                jMenuBar1.setVisible(false);
                studentAdd.setVisible(false);
                studentView.setVisible(false);
                facultyAdd.setVisible(false);
                facultyView.setVisible(false);
                stable.setVisible(false);
                ftable.setVisible(false);
                tableHeader1.setVisible(false);
                tableHeader2.setVisible(false);
                notlogin.setText("");
                userType.setSelectedItem("-- Select User Type --");

                login.setVisible(true);
                userType.setVisible(true);
                loginID.setVisible(true);
                password.setVisible(true);
                txtlID.setVisible(true);
                pass.setVisible(true);
                signin.setVisible(true);
                notlogin.setVisible(true);
            }
            public void menuDeselected(MenuEvent e) {

            }
            public void menuCanceled(MenuEvent e) {

            }
        });

        // Faculty Menubar

        jMenuBar2 = new JMenuBar();

        fstudent = new JMenu("Student");
        fstudent.setFont(f);
        addfStudent = new JMenuItem("Add Student");
        addfStudent.setFont(f);
        fstudent.add(addfStudent);
        viewfStudent = new JMenuItem("View Student");
        viewfStudent.setFont(f);
        fstudent.add(viewfStudent);
        jMenuBar2.add(fstudent);

        attendance = new JMenu("Attendance");
        attendance.setFont(f);
        addAttendance = new JMenuItem("Add Attendance");
        addAttendance.setFont(f);
        attendance.add(addAttendance);
        viewAttendance = new JMenuItem("View Attendance");
        viewAttendance.setFont(f);
        attendance.add(viewAttendance);
        jMenuBar2.add(attendance);

        b1 = new JMenu("                                                                                     ");
        b1.setEnabled(false);
        jMenuBar2.add(b1);

        b2 = new JMenu("                                                                                     ");
        b2.setEnabled(false);
        jMenuBar2.add(b2);

        b3 = new JMenu("                                                                                     ");
        b3.setEnabled(false);
        jMenuBar2.add(b3);

        b4 = new JMenu("                                                                                     ");
        b4.setEnabled(false);
        jMenuBar2.add(b4);

        bLogout = new JMenu("        Logout        ");
        bLogout.setFont(f);
        jMenuBar2.add(bLogout);

        bLogout.addMenuListener(new MenuListener()
        {
            public void menuSelected(MenuEvent e)
            {
                txtlID.setText("");
                pass.setText("");
                jMenuBar2.setVisible(false);
                studentAdd.setVisible(false);
                studentView.setVisible(false);
                attendanceAdd.setVisible(false);
                attendanceView.setVisible(false);
                stable.setVisible(false);
                addatable.setVisible(false);
                vatable.setVisible(false);
                tableHeader1.setVisible(false);
                tableHeader3.setVisible(false);
                tableHeader4.setVisible(false);
                notlogin.setText("");
                userType.setSelectedItem("-- Select User Type --");

                login.setVisible(true);
                loginID.setVisible(true);
                password.setVisible(true);
                txtlID.setVisible(true);
                pass.setVisible(true);
                signin.setVisible(true);
                notlogin.setVisible(true);
                userType.setVisible(true);
            }
            public void menuDeselected(MenuEvent e) {

            }
            public void menuCanceled(MenuEvent e) {

            }
        });

        studentAdd.setVisible(false);
        studentView.setVisible(false);
        facultyAdd.setVisible(false);
        facultyView.setVisible(false);
        attendanceAdd.setVisible(false);
        attendanceView.setVisible(false);

        signin.addActionListener(this);
        ssave.addActionListener(this);
        fsave.addActionListener(this);
        addFaculty.addActionListener(this);
        viewFaculty.addActionListener(this);
        addaStudent.addActionListener(this);
        viewaStudent.addActionListener(this);
        addfStudent.addActionListener(this);
        viewfStudent.addActionListener(this);
        addAttendance.addActionListener(this);
        viewAttendance.addActionListener(this);
        asubmit.addActionListener(this);
        sgen.addItemListener(this);
        fgen.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        if (ie.getSource() == sgen)
        {
            gender = (String) sgen.getSelectedItem();
        }
        else if(ie.getSource() == fgen)
        {
			gend = (String) fgen.getSelectedItem();
		}
    }

    public void actionPerformed(ActionEvent ae)
    {
        tableHeader1 = stable.getTableHeader();
        tableHeader2 = ftable.getTableHeader();
        tableHeader3 = vatable.getTableHeader();
        tableHeader4 = addatable.getTableHeader();

        Font headerFont = new Font("Verdana", Font.BOLD, 18);
        tableHeader1.setFont(headerFont);
        tableHeader2.setFont(headerFont);
        tableHeader3.setFont(headerFont);
        tableHeader4.setFont(headerFont);

        studentAdd.setVisible(false);
        studentView.setVisible(false);
        facultyAdd.setVisible(false);
        facultyView.setVisible(false);
        attendanceAdd.setVisible(false);
        attendanceView.setVisible(false);

        String passcode = String.valueOf(pass.getPassword());
        String user = String.valueOf(userType.getItemAt(userType.getSelectedIndex()));

        if (txtlID.getText().equals("admin") && passcode.equals("admin") && user.equals("Admin"))
        {
            login.setVisible(false);
            loginID.setVisible(false);
            password.setVisible(false);
            txtlID.setVisible(false);
            pass.setVisible(false);
            signin.setVisible(false);
            notlogin.setVisible(false);
            userType.setVisible(false);

            setJMenuBar(jMenuBar1);
            jMenuBar1.setVisible(true);

            if (ae.getSource() == addFaculty)
            {
                fgen.setSelectedItem("-- Select Gender --");
                facultyAdd.setVisible(true);
            }
            else if(ae.getSource() == fsave)
            {
				facultyAdd.setVisible(true);

    			String facnm = ftfnm.getText() + " " + ftlnm.getText();
   				String facemail = ftemailID.getText();
   				String facpass = passw.getText();
   				String faccpass = cpassword.getText();
     			String facgender = gend;
     			String facmobile = ftmNO.getText();

        		String query = "insert into Faculty(Faculty_Name , Login_ID , Password , Gender , Faculty_Mobile_No)"
        						+ " values('" + facnm + "','" + facemail + "','" + facpass + "','" + facgender + "','" + facmobile + "')";

				if(facpass.equals(faccpass))
				{
        			try
    				{
        			    String url = "jdbc:odbc:DSNClgAttSystm";
        			    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        			    Connection con = DriverManager.getConnection(url);
        			    Statement smt = con.createStatement();
        			    smt.execute(query);
     				    con.close();
     				    JOptionPane.showMessageDialog(null,"Data save successfuly ...!!!");
        			}
        			catch (Exception e)
        			{
        				System.out.println(e);
      				}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please make sure both passwords match.","Faculty",JOptionPane.WARNING_MESSAGE);
				}
				ftfnm.setText("");
				ftlnm.setText("");
				ftemailID.setText("");
				passw.setText("");
				cpassword.setText("");
				fgen.setSelectedItem("-- Select Gender --");
				ftmNO.setText("");
			}
            else if (ae.getSource() == viewFaculty)
            {
				fmodel.getDataVector().removeAllElements();
				revalidate();

                tableHeader2.setVisible(true);
                ftable.setVisible(true);
                facultyView.setVisible(true);

				String nm = "";
				String lid = "";
				String pswd = "";
				String gndr = "";
				String mno = "";

				String query = "select * from Faculty";

				try
				{
					String url = "jdbc:odbc:DSNClgAttSystm";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection(url);
					Statement smt = con.createStatement();
					ResultSet rs = smt.executeQuery(query);

					while(rs.next())
					{
						nm = rs.getString("Faculty_Name");
						lid = rs.getString("Login_ID");
						pswd = rs.getString("Password");
						gndr = rs.getString("Gender");
						mno = rs.getString("Faculty_Mobile_No");
						fmodel.addRow(new Object[]{nm,lid,pswd,gndr,mno});
					}
					con.close();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
            }
            else if (ae.getSource() == addaStudent)
            {
                tableHeader1.setVisible(true);
                stable.setVisible(true);
                sgen.setSelectedItem("-- Select Gender --");
                studentAdd.setVisible(true);
            }
            else if (ae.getSource() == ssave)
            {
				aStudent();
            }
            else if (ae.getSource() == viewaStudent)
            {
                tableHeader1.setVisible(true);
                stable.setVisible(true);
                studentView.setVisible(true);
                vStudent();
            }
        }
        else if (txtlID.getText().equals("chetan") && passcode.equals("chetan") && user.equals("Faculty"))
        {
            login.setVisible(false);
            loginID.setVisible(false);
            password.setVisible(false);
            txtlID.setVisible(false);
            pass.setVisible(false);
            signin.setVisible(false);
            notlogin.setVisible(false);
            userType.setVisible(false);

            setJMenuBar(jMenuBar2);
            jMenuBar2.setVisible(true);

            if (ae.getSource() == addfStudent)
            {
                sgen.setSelectedItem("-- Select Gender --");
                studentAdd.setVisible(true);
            }
            else if(ae.getSource() == ssave)
            {
				aStudent();
			}
            else if (ae.getSource() == viewfStudent)
            {
                tableHeader1.setVisible(true);
                stable.setVisible(true);
                studentView.setVisible(true);
                vStudent();
            }
            else if (ae.getSource() == addAttendance)
            {
                tableHeader4.setVisible(true);
                addatable.setVisible(true);
                attendanceAdd.setVisible(true);

				model.getDataVector().removeAllElements();
				revalidate();

				String nm = "";
				String lid = "";
				String pswd = "";
				String gndr = "";
				String mno = "";
				String fmno = "";

				String query = "select * from Student";

				try
				{
					String url = "jdbc:odbc:DSNClgAttSystm";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection(url);
					Statement smt = con.createStatement();
					ResultSet rs = smt.executeQuery(query);

					int i = 0;
					while(rs.next())
					{
						i++;
						nm = rs.getString("Student_Name");
						lid = rs.getString("Student_Email_ID");
						gndr = rs.getString("Student_Gender");
						mno = rs.getString("Student_Mobile_No");
						fmno = rs.getString("Father_Mobile_No");
						model.addRow(new Object[]{i,nm,lid,gndr,mno,fmno});
					}
					con.close();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
            }
            else if(ae.getSource() == asubmit)
            {
				for(int i=0;i<addatable.getRowCount();i++)
				{
				  	Boolean checked=Boolean.valueOf(addatable.getValueAt(i, 6).toString());
					String col=addatable.getValueAt(i, 1).toString();

				  	//DISPLAY

				  	if(checked)
					{
						JOptionPane.showMessageDialog(null, col);
					}
				}
			}
            else if (ae.getSource() == viewAttendance)
            {
                tableHeader3.setVisible(true);
                vatable.setVisible(true);
                attendanceView.setVisible(true);
            }
        }
        else
        {
            notlogin.setText("Please Insert Valid Login ID and Password .");
        }
    }
    public void aStudent()
    {
		studentAdd.setVisible(true);

    	String studnm = stfnm.getText() + " " + stlnm.getText();
   		String studemail = stemailID.getText();
     	String studgender = gender;
     	String studmobile = stmNO.getText();
       	String studfmno = tfNO.getText();

        String query = "insert into Student(Student_Name , Student_Email_ID , Student_Gender , Student_Mobile_No , Father_Mobile_No)"
        				+ " values('" + studnm + "','" + studemail + "','" + studgender + "','" + studmobile + "','" + studfmno + "')";

        try
    	{
            String url = "jdbc:odbc:DSNClgAttSystm";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection(url);
            Statement smt = con.createStatement();
            smt.execute(query);
     	    con.close();
     	    JOptionPane.showMessageDialog(null,"Data save successfuly ...!!!");
        }
        catch (Exception e)
        {
        	System.out.println(e);
      	}
		stfnm.setText("");
		stlnm.setText("");
		stemailID.setText("");
		sgen.setSelectedItem("-- Select Gender --");
		stmNO.setText("");
		tfNO.setText("");
	}
	public void vStudent()
	{
		smodel.getDataVector().removeAllElements();
		revalidate();

		String nm = "";
		String lid = "";
		String pswd = "";
		String gndr = "";
		String mno = "";
		String fmno = "";

		String query = "select * from Student";

		try
		{
			String url = "jdbc:odbc:DSNClgAttSystm";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection(url);
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(query);

			while(rs.next())
			{
				nm = rs.getString("Student_Name");
				lid = rs.getString("Student_Email_ID");
				gndr = rs.getString("Student_Gender");
				mno = rs.getString("Student_Mobile_No");
				fmno = rs.getString("Father_Mobile_No");
				smodel.addRow(new Object[]{nm,lid,gndr,mno,fmno});
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class TableCheckBOX extends DefaultTableModel
{
    public TableCheckBOX()
    {
        super(new String[]{"Roll No.", "Name", "Email ID", "Gender", "Mobile No.", "Father Mobile No.", "Attendance"}, 0);
    }
    public Class<?> getColumnClass(int columnIndex)
    {
        Class clazz = String.class;
        switch (columnIndex)
        {
            case 0:
                clazz = Integer.class;
                break;

            case 6:
                clazz = Boolean.class;
                break;
        }
        return clazz;
    }
    public boolean isCellEditable(int row, int column)
    {
        return column == 6;
    }
    public void setValueAt(Object aValue, int row, int column)
    {
        if (aValue instanceof Boolean && column == 6)
        {
            Vector rowData = (Vector) getDataVector().get(row);
            rowData.set(6, (boolean) aValue);
            fireTableCellUpdated(row, column);
        }
    }
}

class FetchInfo extends DefaultTableModel
{
    public FetchInfo()
    {
        super(new String[]{"Faculty_Name" , "Login_ID" , "Password" , "Gender", "Faculty_Mobile_No"}, 0);
    }
    public Class<?> getColumnClass(int columnIndex)
    {
        Class clazz = String.class;
        switch (columnIndex)
        {
            case 0:
                clazz = Integer.class;
                break;
        }
        return clazz;
    }
}
class FetchsInfo extends DefaultTableModel
{
    public FetchsInfo()
    {
        super(new String[]{"Student_Name" , "Student_Email_ID" , "Student_Gender" , "Student_Mobile_No" , "Father_Mobile_No"}, 0);
    }
    public Class<?> getColumnClass(int columnIndex)
    {
        Class clazz = String.class;
        switch (columnIndex)
        {
            case 0:
                clazz = Integer.class;
                break;
        }
        return clazz;
    }
}

public class College_Attendance_System
{
    public static void main(String[] args)
    {
        Admin A = new Admin();
        A.setVisible(true);
    }
}
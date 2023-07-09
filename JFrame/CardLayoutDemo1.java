import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo1 extends JFrame implements ItemListener
{

	private int currentCard = 1;
	private CardLayout cl;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	JTextField totelText;
	JPanel north,south,east,west,center;

	public CardLayoutDemo1()
	{
		setTitle("Galaxy Computer Education,Chopda");
		setSize(1000,500);
		setLocation(100,100);
		/////////////////////////////////////////
		north = new JPanel();
		north.setBackground(new Color(100,150,200));
		north.setLayout(new FlowLayout());

		Font font1 = new Font("Serif",Font.BOLD,20);
		Font font2 = new Font("Serif",Font.BOLD,17);




		JLabel L1 = new JLabel("Galaxy Computer Education     ");
		north.add(L1);
		L1.setFont(font1);

		JComboBox C1 = new JComboBox();
		    C1.addItem("Select Batch  .... ");
			C1.addItem("C Programming");
			C1.addItem("C ++ Programming");
			C1.addItem("Data Structure");
			C1.addItem("Java Programming");
			C1.addItem("Advanced Java");
			north.add(C1);


			JComboBox C2 = new JComboBox();
			C2.addItem("Select Batch Time .... ");
			C2.addItem("8.00 AM");
			C2.addItem("9.45 AM");
			C2.addItem("11.30 AM");
			C2.addItem("2.00 PM");
			C2.addItem("3.30 PM");
			north.add(C2);


			JLabel L2 = new JLabel("Date :");
			north.add(L2);

			JTextField T1 = new JTextField(15);
			north.add(T1);


			JLabel L3 = new JLabel("Students :");
			north.add(L3);

			JTextField T2 = new JTextField(8);
			north.add(T2);

			JButton B1 = new JButton("Create Batch");
			north.add(B1);


			//south = new JPanel();
		   // south.setBackground(new Color(80,130,180));

		   east = new JPanel();
		   east.setBackground(new Color(120,170,220));


		/////////////////////////////////////

		JPanel cardPanel = new JPanel();

		cl = new CardLayout();
		cardPanel.setLayout(cl);


		JPanel jp1 = new JPanel();
		jp1.setBackground(new Color(150,180,240));
		jp1.setLayout(new GridLayout(11,1));
		////////////////////////////////////////////
		JPanel jp2 = new JPanel();
		jp2.setBackground(new Color(150,180,240));
		jp2.setLayout(new GridLayout(11,1));

		JPanel selButtons = new JPanel();
		selButtons.setBackground(new Color(150,180,240));
		selButtons.setLayout(new GridLayout(1,5));


        JPanel StuDetail = new JPanel();
		StuDetail.setBackground(new Color(150,180,240));
		StuDetail.setLayout(new GridLayout(20,2));


		JButton checkall = new JButton("Check-All");
		checkall.setFont(font2);

	//	checkall.addActionListener(this);
		selButtons.add(checkall);

		JButton unckeckall = new JButton("Uncheck-All");
		//unckeckall.setBackground(new Color(120,140,240));
		unckeckall.setFont(font2);

	//	unckeckall.addActionListener(this);
		selButtons.add(unckeckall);


		JLabel TotelPres = new JLabel("Present Student");
		TotelPres.setFont(font2);
		StuDetail.add(TotelPres);


		totelText = new JTextField();
		StuDetail.add(totelText);
		totelText.setFont(font1);
		totelText.setEnabled(false);

	    JLabel TotelAbse = new JLabel("Absent Student");
		TotelAbse.setFont(font2);
		StuDetail.add(TotelAbse);

		JTextField totelTextab = new JTextField();
		totelTextab.setFont(font1);
		StuDetail.add(totelTextab);
		totelText.setEnabled(false);







        //////////////////////////////poly panel/////////////////

		JLabel jl1 = new JLabel("                     List of Polytechnic Students");
		jl1.setFont(font1);
		jp1.add(jl1);


		//   JLabel jl1 = new JLabel("Check-in              Student Name                    Srn.");


	      c1 = new JCheckBox("					                             Mayur Vasudeo Kumbhar.                          1");
	  	  c2 = new JCheckBox("					                             Name Of the Poly Student.                         2");
	   	  c3 = new JCheckBox("					                             Name Of the Poly Student.                         3");
	      c4 = new JCheckBox("					                             Name Of the Poly Student.                         4");
		  c5 = new JCheckBox("					                             Name Of the Poly Student.                         5");
	      c6 = new JCheckBox("					                             Name Of the Poly Student.                         6");
		  c7 = new JCheckBox("					                             Name Of the Poly Student.                         7");
	      c8 = new JCheckBox("					                             Name Of the Poly Student.                         8");
		  c9 = new JCheckBox("					                             Name Of the Poly Student.                         9");
	      c10 = new JCheckBox("					                             Name Of the Poly Student.                         10");

		jp1.add(c1);
		jp1.add(c2);
        jp1.add(c3);
        jp1.add(c4);
        jp1.add(c5);
        jp1.add(c6);
        jp1.add(c7);
        jp1.add(c8);
        jp1.add(c9);
        jp1.add(c10);



       c1.addItemListener(this);
	   c2.addItemListener(this);
	   c3.addItemListener(this);
	   c4.addItemListener(this);
	   c5.addItemListener(this);
	   c6.addItemListener(this);
	   c7.addItemListener(this);
	   c8.addItemListener(this);
	   c9.addItemListener(this);
	   c10.addItemListener(this);


	/*	JCheckBox data1[] = new JCheckBox[10];
		for(int i=0;i<data1.length;i++)
		{
			data1[i] = new JCheckBox("                                Name of the Poly Student");
			jp1.add(data1[i]);
			data1[i].setEnabled(false);
		}*/


		////////////////////////////////////BSC panel/////////////////////////


		JLabel jl2 = new JLabel("                     List of BSC Students");
		jl2.setFont(font1);

		jp2.add(jl2);


		JCheckBox data2[] = new JCheckBox[10];
		for(int i=0;i<data2.length;i++)
		{
			data2[i] = new JCheckBox("                                Name of the BSC Student");
			jp2.add(data2[i]);
		//	data2[i].setEnabled(false);
			jp2.setBackground(new Color(150,180,240));

		}


		////////////////////////////////
		cardPanel.add(jp1, "1");
		cardPanel.add(jp2, "2");

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2,1));




		JButton firstBtn = new JButton("Poly");
		firstBtn.setFont(font1);

		JButton nextBtn = new JButton("BSC");
		nextBtn.setFont(font1);


		buttonPanel.add(firstBtn);
		buttonPanel.add(nextBtn);


		firstBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				cl.first(cardPanel);

				currentCard = 1;
			}
		});


		nextBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				if (currentCard < 4)
				{
					currentCard += 1;

					cl.show(cardPanel, "" + (currentCard));
				}
			}
		});



		add(cardPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.WEST);

		add(north,BorderLayout.NORTH);
		add(selButtons,BorderLayout.SOUTH);
		add(StuDetail,BorderLayout.EAST);
		//add(west,BorderLayout.WEST);
		//add(center,BorderLayout.CENTER);
		show();

	}
	/*public void actionPerformed(ActionEvent ae)
	 {
	      /*  if(ae.getSource()==SelectAll)
	        {
						//	data2[i].setEnabled(false);

				 //((JButton)e.getSource()).setEnabled(false);
			}
    }*/

   public void itemStateChanged(ItemEvent ie)
   	{
   		int a=0;
   		if(c1.isSelected())
   		{
   			a = a + 1;
   		}
   		if(c2.isSelected())
   		{
   			a = a + 1;
   		}
   		if(c3.isSelected())
   		{
   			a = a + 1;
   		}
   		if(c4.isSelected())
		{
		   	a = a + 1;
   		}
   		if(c5.isSelected())
		{
		   	a = a + 1;
   		}
   		if(c6.isSelected())
		{
				   	a = a + 1;
   		}
   		if(c7.isSelected())
		{
				   	a = a + 1;
   		}
   		if(c8.isSelected())
		{
				   	a = a + 1;
   		}
   		if(c9.isSelected())
		{
				   	a = a + 1;
   		}
   		if(c10.isSelected())
		{
					a = a + 1;
   		}

   		totelText.setText(String.valueOf(a));

	}

	public static void main(String[] args)
	{


		CardLayoutDemo1 cl = new CardLayoutDemo1();


		cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		cl.setVisible(true);
	}
}

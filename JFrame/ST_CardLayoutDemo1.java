import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ST_CardLayoutDemo1 extends JFrame implements ItemListener
{

	private int currentCard = 1;
	private CardLayout cl;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,checkAll;
	JCheckBox c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,checkAllBSC;

	JTextField totelText,totelText2,totelTextab,totelTextab2,totelStu,totelStu1;


	JPanel north,south,east,west,center;



	public ST_CardLayoutDemo1()
	{


		setTitle("Galaxy Computer Education,Chopda");
		setSize(1150,500);
		setLocation(100,100);
		/////////////////////////////////////////
		north = new JPanel();
		north.setBackground(new Color(100,150,200));
		north.setLayout(new FlowLayout());

		Font font3 = new Font("Serif",Font.ITALIC,35);

		Font font1 = new Font("Serif",Font.BOLD,25);
		Font font2 = new Font("Serif",Font.BOLD,17);




		JLabel L1 = new JLabel("Galaxy Computer Education     ");
		L1.setForeground(Color.ORANGE);
		north.add(L1);
		L1.setFont(font3);

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

			JTextField T1 = new JTextField(8);
			north.add(T1);


			JLabel L3 = new JLabel("Students Id :");
			north.add(L3);

			JTextField T2 = new JTextField(4);
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
		jp1.setLayout(new BorderLayout());
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		JPanel jp2 = new JPanel();
		jp2.setBackground(new Color(150,180,240));
		jp2.setLayout(new BorderLayout());

		JPanel selButtons = new JPanel();
		selButtons.setBackground(new Color(150,180,240));
		//selButtons.setLayout(new GridLayout(5,1));


        JPanel StuDetail = new JPanel();
		StuDetail.setBackground(new Color(150,180,240));
		StuDetail.setLayout(new GridLayout(14,1));


		JPanel StuDetail2 = new JPanel();
		StuDetail2.setBackground(new Color(150,180,240));
		StuDetail2.setLayout(new GridLayout(14,1));


		JButton checkall = new JButton("Check-All");
		checkall.setFont(font2);

	//	checkall.addActionListener(this);
		//selButtons.add(checkall);

//		JButton unckeckall = new JButton("Uncheck-All");
		//unckeckall.setBackground(new Color(120,140,240));
//		unckeckall.setFont(font2);

	//	unckeckall.addActionListener(this);
//		selButtons.add(unckeckall);

//////////////////////////////////////////////////////////////////////
		JLabel TotelPres = new JLabel("  Present Student      ");
		TotelPres.setFont(font2);
		TotelPres.setForeground(Color.RED);

		StuDetail.add(TotelPres);


		totelText = new JTextField();
		StuDetail.add(totelText);
		totelText.setFont(font1);
		totelText.setBackground(Color.BLACK);

		totelText.setEnabled(false);


		JLabel TotelAbse = new JLabel("  Absent Student      ");
		TotelAbse.setForeground(Color.RED);
		TotelAbse.setFont(font2);
		StuDetail.add(TotelAbse);

		totelTextab = new JTextField(3);
		totelTextab.setFont(font1);
		StuDetail.add(totelTextab);
		totelTextab.setBackground(Color.BLACK);
		totelTextab.setEnabled(false);


		JLabel Totel = new JLabel("  Totel Student      ");
		Totel.setForeground(Color.RED);
		Totel.setFont(font2);
		StuDetail.add(Totel);

		totelStu = new JTextField(3);
		totelStu.setFont(font1);
		StuDetail.add(totelStu);
		totelStu.setBackground(Color.BLACK);
		totelStu.setEnabled(false);
///////////////////////////////////////////////////////////////

	    JLabel TotelPres2 = new JLabel("  Present Student      ");
	    TotelPres2.setForeground(Color.RED);
		TotelPres2.setFont(font2);
		StuDetail2.add(TotelPres2);

		totelText2 = new JTextField();
		StuDetail2.add(totelText2);
		totelText2.setBackground(Color.BLACK);
		totelText2.setFont(font1);
		totelText2.setEnabled(false);



        JLabel TotelAbse2 = new JLabel("  Absent Student      ");
        TotelAbse2.setForeground(Color.RED);
		TotelAbse2.setFont(font2);
		StuDetail2.add(TotelAbse2);


		totelTextab2 = new JTextField();
		totelTextab2.setFont(font1);
		totelTextab2.setBackground(Color.BLACK);
		StuDetail2.add(totelTextab2);
		totelTextab2.setEnabled(false);



		JLabel Totel1 = new JLabel("  Totel Student      ");
		Totel1.setForeground(Color.RED);
		Totel1.setFont(font2);
		StuDetail2.add(Totel1);

		totelStu1 = new JTextField(3);
		totelStu1.setFont(font1);
		StuDetail2.add(totelStu1);
		totelStu1.setBackground(Color.BLACK);
		totelStu1.setEnabled(false);

        //////////////////////////////poly panel/////////////////

		JLabel jl1 = new JLabel("List of Polytechnic Students",JLabel.CENTER);
		jl1.setForeground(Color.BLACK);

		jl1.setFont(font1);
		jp1.add(jl1,BorderLayout.NORTH);

	    JPanel jp11 = new JPanel();
	    jp11.setLayout(new GridLayout(12,1));




        checkAll = new JCheckBox("Select-All");



        JLabel srn1 = new JLabel(" Check-in              Students Name                    Sr.no");
       //   srn2.setForeground(Color.WHITE);
		//srn1.setBackground(Color.RED);
		srn1.setFont(font2);



	      c1 = new JCheckBox("					                             Mayur Vasudeo Kumbhar.                         1");
	  	  c2 = new JCheckBox("					                             Name Of the Poly Student.                         2");
	   	  c3 = new JCheckBox("					                             Name Of the Poly Student.                         3");
	      c4 = new JCheckBox("					                             Name Of the Poly Student.                         4");
		  c5 = new JCheckBox("					                             Name Of the Poly Student.                         5");
	      c6 = new JCheckBox("					                             Name Of the Poly Student.                         6");
		  c7 = new JCheckBox("					                             Name Of the Poly Student.                         7");
	      c8 = new JCheckBox("					                             Name Of the Poly Student.                         8");
		  c9 = new JCheckBox("					                             Name Of the Poly Student.                         9");
	      c10 = new JCheckBox("					                             Name Of the Poly Student.                         10");

		jp11.add(srn1);
		jp11.add(checkAll);
		jp11.add(c1);
		jp11.add(c2);
        jp11.add(c3);
        jp11.add(c4);
        jp11.add(c5);
        jp11.add(c6);
        jp11.add(c7);
        jp11.add(c8);
        jp11.add(c9);
        jp11.add(c10);

		jp1.add(jp11);
		jp1.add(StuDetail,BorderLayout.EAST);



 checkAll.addItemListener(this);
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





		JLabel jl2 = new JLabel("List of BSC Students",JLabel.CENTER);
				jl2.setForeground(Color.BLACK);

		jl2.setFont(font1);


		jp2.add(jl2,BorderLayout.NORTH);


		JPanel jp21 = new JPanel();
	    jp21.setLayout(new GridLayout(13,1));



	       JLabel srn2 = new JLabel(" Check-in              Students Name                    Sr.no");
	       //   srn2.setForeground(Color.WHITE);
		   // srn2.setBackground(Color.RED);
		   		srn2.setFont(font2);


	       checkAllBSC = new JCheckBox("Select-All");


	      c11 = new JCheckBox("					                             Mayur Vasudeo Kumbhar.                          1");
	  	  c12 = new JCheckBox("					                             Name Of the BSC Student.                         2");
	   	  c13 = new JCheckBox("					                             Name Of the BSC Student.                         3");
	      c14 = new JCheckBox("					                             Name Of the BSC Student.                         4");
		  c15 = new JCheckBox("					                             Name Of the BSC Student.                         5");
	      c16 = new JCheckBox("					                             Name Of the BSC Student.                         6");
		  c17 = new JCheckBox("					                             Name Of the BSC Student.                         7");
	      c18 = new JCheckBox("					                             Name Of the BCS Student.                         8");
		  c19 = new JCheckBox("					                             Name Of the BSC Student.                         9");
	      c20 = new JCheckBox("					                             Name Of the BSC Student.                         10");


				jp21.add(srn2);
        		jp21.add(checkAllBSC);
				jp21.add(c11);
				jp21.add(c12);
		        jp21.add(c13);
		        jp21.add(c14);
		        jp21.add(c15);
		        jp21.add(c16);
		        jp21.add(c17);
		        jp21.add(c18);
		        jp21.add(c19);
		        jp21.add(c20);

             jp2.add(jp21);
		     jp2.add(StuDetail2,BorderLayout.EAST);



				     checkAllBSC.addItemListener(this);
				       c11.addItemListener(this);
					   c12.addItemListener(this);
					   c13.addItemListener(this);
					   c14.addItemListener(this);
					   c15.addItemListener(this);
					   c16.addItemListener(this);
					   c17.addItemListener(this);
					   c18.addItemListener(this);
					   c19.addItemListener(this);
					   c20.addItemListener(this);


/*		JCheckBox data2[] = new JCheckBox[10];
		for(int i=0;i<data2.length;i++)
		{
			data2[i] = new JCheckBox("                                Name of the BSC Student");
			jp2.add(data2[i]);
		//	data2[i].setEnabled(false);
			jp2.setBackground(new Color(150,180,240));

		}*/


		////////////////////////////////
		cardPanel.add(jp1, "1");
		cardPanel.add(jp2, "2");

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(14,1));


		JLabel batch = new JLabel("Select Batch",JLabel.CENTER);


		JButton firstBtn = new JButton(" Polytechnic   ");
		firstBtn.setForeground(Color.WHITE);
		firstBtn.setBackground(Color.BLACK);
		firstBtn.setFont(font2);

		JButton nextBtn = new JButton(" BSC");
		nextBtn.setForeground(Color.WHITE);
		nextBtn.setBackground(Color.BLACK);
		nextBtn.setFont(font2);


		buttonPanel.add(batch);
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
		//add(StuDetail,BorderLayout.EAST);
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

		poly();
		Bsc();

	}
	void poly()
	{
		   		int a=0,t=10;
		   		int z=0;
		   		if(checkAll.isSelected()==true )
				{
						c1.setSelected(true);
						c2.setSelected(true);
						c3.setSelected(true);
						c4.setSelected(true);
						c5.setSelected(true);
						c6.setSelected(true);
						c7.setSelected(true);
						c8.setSelected(true);
						c9.setSelected(true);
						c10.setSelected(true);



		   		}else
		   		{
					c1.setSelected(false);
					c2.setSelected(false);
					c3.setSelected(false);
					c4.setSelected(false);
					c5.setSelected(false);
					c6.setSelected(false);
					c7.setSelected(false);
					c8.setSelected(false);
					c9.setSelected(false);
					c10.setSelected(false);

				}


				if(c1.isSelected())
					a = a + 1;
				else

					z= z + 1;

				if(c2.isSelected())
					a = a + 1;
				else
                    z= z + 1;

				if(c3.isSelected())
					a = a + 1;

				else
                    z= z + 1;

				if(c4.isSelected())
				  	a = a + 1;
				else
				  z= z + 1;


				if(c5.isSelected())
				  	a = a + 1;
				else
                    z= z + 1;


				if(c6.isSelected())
				   	a = a + 1;

				else
                    z= z + 1;

				if(c7.isSelected())
				 	a = a + 1;

				else
                    z= z + 1;

				if(c8.isSelected())
					a = a + 1;

				else
                    z= z + 1;

				if(c9.isSelected())
				   	a = a + 1;

				else
                    z= z + 1;

				if(c10.isSelected())
					a = a + 1;
				else
                    z= z + 1;



		   	  totelText.setText(String.valueOf(a));
		   	  totelTextab.setText(String.valueOf(z));
		   	  totelStu.setText(String.valueOf(t));



	}
	void Bsc()
	{
		   		int a=0,z=0,t=10;

		   		/*if(checkAllBSC.isSelected())
				{
						c11.setSelected(true);
						c12.setSelected(true);
						c13.setSelected(true);
						c14.setSelected(true);
						c15.setSelected(true);
						c16.setSelected(true);
						c17.setSelected(true);
						c18.setSelected(true);
						c19.setSelected(true);
						c20.setSelected(true);



		   		}else
		   		{
					c11.setSelected(false);
					c12.setSelected(false);
					c13.setSelected(false);
					c14.setSelected(false);
					c15.setSelected(false);
					c16.setSelected(false);
					c17.setSelected(false);
					c18.setSelected(false);
					c19.setSelected(false);
					c20.setSelected(false);

				}*/
				if(c11.isSelected())
					a = a + 1;
				else
                    z= z + 1;

				if(c12.isSelected())
					a = a + 1;
				else
                    z= z + 1;

				if(c13.isSelected())
					a = a + 1;
				else
                    z= z + 1;

				if(c14.isSelected())
				  	a = a + 1;
				else
                    z= z + 1;

				if(c15.isSelected())
				  	a = a + 1;
				else
                    z= z + 1;

				if(c16.isSelected())
				   	a = a + 1;
				else
                    z= z + 1;

				if(c17.isSelected())
				 	a = a + 1;
				else
                    z= z + 1;

				if(c18.isSelected())
					a = a + 1;
				else
                    z= z + 1;

				if(c19.isSelected())
				   	a = a + 1;
				else
                    z= z + 1;

				if(c20.isSelected())
					a = a + 1;
				else
                    z= z + 1;

		   		totelText2.setText(String.valueOf(a));
		   		totelTextab2.setText(String.valueOf(z));
		   		totelStu1.setText(String.valueOf(t));



	}

	public static void main(String[] args)
	{


		ST_CardLayoutDemo1 cl = new ST_CardLayoutDemo1();


		cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		cl.setVisible(true);
	}
}

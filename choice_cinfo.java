import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class choice_cinfo extends Applet implements ActionListener , ItemListener
{
	Label lblheading,lblcnm,lblscsi;
	TextField txtcnm;
	Button addncountry;
	Choice country;

	public void init()
	{
		Font f = new Font("Arial",Font.BOLD,15);
		setFont(f);

		lblheading = new Label("             COUNTRY INFORMATION             ");
		add(lblheading);

		lblcnm = new Label("Country Name : ");
		add(lblcnm);

		txtcnm = new TextField(25);
		add(txtcnm);

		addncountry = new Button("           ADD NEW COUNTRY          ");
		add(addncountry);

		country = new Choice();
		country.add("             Select Your Country ...");
		add(country);

		lblscsi = new Label("                                                                                        ");
		add(lblscsi);

		addncountry.addActionListener(this);
		country.addItemListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		country.add(txtcnm.getText());
	}

	public void itemStateChanged(ItemEvent ie)
	{
		int index = country.getSelectedIndex();

		if(index==0)
		{
			lblscsi.setText("Please Select The Country");
		}
		else
		{
			String x = country.getSelectedItem();
			lblscsi.setText("Selected Country : " + x + " & Selected Index : " + index);
		}
	}
}
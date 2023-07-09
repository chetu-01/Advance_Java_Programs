import java.awt.*;
import java.applet.*;

public class sample_ui extends Applet
{
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	TextField t1,t2,t3,t4,t5,t6,t7;
	Button b1,b2;

	public void init()
	{
		l1 = new Label("              Marks Statement      ");
		add(l1);
		l2 = new Label("Marathi         ");
		add(l2);
		t1 = new TextField(15);
		add(t1);
		l3 = new Label("English          ");
		add(l3);
		t2 = new TextField(15);
		add(t2);
		l4 = new Label("Hindi              ");
		add(l4);
		t3 = new TextField(15);
		add(t3);
		l5 = new Label("Math              ");
		add(l5);
		t4 = new TextField(15);
		add(t4);
		l6 = new Label("Science           ");
		add(l6);
		t5 = new TextField(15);
		add(t5);
		l7 = new Label("Social Science ");
		add(l7);
		t6 = new TextField(15);
		add(t6);
		b1 = new Button("Find Total    ");
		add(b1);
		b2 = new Button("Result    ");
		add(b2);
		l8 = new Label("Remark            ");
		add(l8);
		t7 = new TextField(15);
		add(t7);
	}
}
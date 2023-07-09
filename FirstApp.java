import java.applet.*;
import java.awt.*;

public class FirstApp extends Applet
{
	Label bkid , bknm , bkaut , bklan , bktype , bkarea , bkpublication , bkedition , bkpages , bkprice , bkcopies , bkfeedback ;
	TextField txtid , txtnm , txtaut , txtarea , txtpublication , txtedition , txtpages , txtprice , txtcopies ;
	Scrollbar s1 , s2 , s3 ;
	Choice clan , ctype ;

	public void init()
	{
		setSize(300,400);
		setLayout(null);

		int x = 10, y = 20;
		int xgap = 10, ygap = 10;
        int w = 50, h = 70;

		Label bkid = new Label("Book ID : ");
		bkid.setBounds(x,y,w,h);
		add(bkid);
		txtid = new TextField(50);
		txtid.setBounds(x,y,w,h);

		bknm = new Label("Book Name : ");
		bknm.setBounds(x,y,w,h);
		txtnm = new TextField(50);
		txtnm.setBounds(x,y,w,h);

		bkaut = new Label("Book Auther : ");
		bkaut.setBounds(x,y,w,h);
		txtaut = new TextField(50);
		txtaut.setBounds(x,y,w,h);

		bklan = new Label("Book Language : ");
		bklan.setBounds(x,y,w,h);
		clan = new Choice();
		clan.setBounds(x,y,w,h);

		bktype = new Label("Book Type : ");
		bktype.setBounds(x,y,w,h);
		ctype = new Choice();
		ctype.setBounds(x,y,w,h);

		bkarea = new Label("Book Area : ");
		bkarea.setBounds(x,y,w,h);
		txtarea = new TextField(50);
		txtarea.setBounds(x,y,w,h);

		bkpublication = new Label("Book publication : ");
		bkpublication.setBounds(x,y,w,h);
		txtpublication = new TextField(50);
		txtpublication.setBounds(x,y,w,h);

		bkedition = new Label("Book Edition : ");
		bkedition.setBounds(x,y,w,h);
		txtedition = new TextField(50);
		txtedition.setBounds(x,y,w,h);

		bkpages = new Label("Book Pages : ");
		bkpages.setBounds(x,y,w,h);
		txtpages = new TextField(50);
		txtpages.setBounds(x,y,w,h);

		bkprice = new Label("Book Price : ");
		bkprice.setBounds(x,y,w,h);
		txtprice = new TextField(50);
		txtprice.setBounds(x,y,w,h);

		bkcopies = new Label("Book Copies : ");
		bkcopies.setBounds(x,y,w,h);
		txtcopies = new TextField(50);
		txtcopies.setBounds(x,y,w,h);

		bkfeedback = new Label("Book Feedback : ");
		bkfeedback.setBounds(x,y,w,h);
		s2 = new Scrollbar(Scrollbar.VERTICAL,10,5,0,10);
		s3 = new Scrollbar(Scrollbar.HORIZONTAL,50,10,0,100);
	}
}
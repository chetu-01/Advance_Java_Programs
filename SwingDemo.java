import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;
public class SwingDemo extends javax.swing.JFrame
{
	Image img = Toolkit.getDefaultToolkit().getImage("D:\\Books\\Java\\Advance Java Programs\\Poly.jpg");
   	public SwingDemo() throws IOException
   	{
      	this.setContentPane(new JPanel()
      	{
         	public void paintComponent(Graphics g)
         	{
            	super.paintComponent(g);
            	g.drawImage(img, 10, 10, this);
         	}
		});
    	pack();
    	setVisible(true);
	}
   	public static void main(String[] args) throws Exception
   	{
      	new SwingDemo();
   	}
}
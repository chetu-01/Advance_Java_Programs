import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Checkbox_Table extends JFrame
{
   	private JTable table;
   	private DefaultTableModel model;
   	public Checkbox_Table()
   	{
    	Random rnd = new Random();
   		model = new DefaultTableModel(new Object[]{"Check Box1","Name"}, 0)
    	{
    	   	@Override
    	   	public Class getColumnClass(int columnIndex)
    	   	{
    	     	return Boolean.class;
    	   	}
 		};
   		for (int index = 0; index < 10; index++)
   		{
    	 	model.addRow(new Object[]{rnd.nextBoolean()});
  		}
    	table = new JTable(model);
    	add(new JScrollPane(table));
    	setTitle("JCheckBoxJTable Test");
    	setSize(375, 250);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLocationRelativeTo(null);
    	setVisible(true);
    }
   public static void main(String[] args) {
      new Checkbox_Table();
   }
}
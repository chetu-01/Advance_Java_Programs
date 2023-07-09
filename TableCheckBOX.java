import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

class ABC extends JFrame
{
	ABC()
	{
		setSize(500,500);
		setLocation(200,300);

        TableCheckBOX model = new TableCheckBOX();

        for(int i = 0; i< 40; i++)
        {
        	model.addRow(new Object[]{0, "Brian", "","","","",false});
        	model.addRow(new Object[]{1, "Ned","","","","", false});
        	model.addRow(new Object[]{2, "John","","","","", false});
        	model.addRow(new Object[]{3, "Drogo","","","","", false});
		}
        JTable table = new JTable(model);

		add(new JScrollPane(table));

        show();
	}
}

public class TableCheckBOX extends DefaultTableModel
{
    public TableCheckBOX()
    {
    	super(new String[]{"Roll No.", "Name", "Email ID","Gender","Mobile No.","Father Mobile No.","Attendance"}, 0);
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
        	System.out.println(aValue);
        	Vector rowData = (Vector)getDataVector().get(row);
        	rowData.set(6, (boolean)aValue);
        	fireTableCellUpdated(row, column);
      	}
    }
  	public static void main(String[] args)
  	{
    	new ABC();
  	}
}
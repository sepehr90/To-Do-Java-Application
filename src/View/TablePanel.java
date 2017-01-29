package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import Model.CustomTableModel;
import Model.Item;

/**
 * Panel with a table to show items on the GUI.
 * 
 * @author Jens Lundin
 */
@SuppressWarnings("serial")
public class TablePanel extends JPanel {
	private CustomTableModel tableModel;
	private JTable table;
	private JPopupMenu popup = new JPopupMenu();
	private JMenuItem menuDelItem;
	
	
	public TablePanel(CustomTableModel tableModel) {
		super(new GridLayout(1, 0));
		
		this.tableModel = tableModel;
        table = new JTable(tableModel);
        table.setFillsViewportHeight(true);
 
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        
        table.setAutoCreateRowSorter(true);
 
        //Add the scroll pane to this panel.
        add(scrollPane);
		
		// Create popup menu.
		menuDelItem = new JMenuItem("delete");
		popup.add(menuDelItem);
		
		table.setComponentPopupMenu(popup);
    }
	

	
	/**
	 * @return custom table model.
	 * 
	 * @author Jens Lundin
	 */
	public JTable getTable() {
		return this.table;
	}
	
	
	public JMenuItem getDelMenuItem() {
		return menuDelItem;
	}
	
    public Boolean isDelMenuItem(JMenuItem item) {
    	Boolean value = (item == menuDelItem);
    	return value;
    }
	
}
	
package View;

import java.awt.BorderLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.DBJaxb;
import Model.Item;
import Model.Items;

@SuppressWarnings("serial")
public class TodaysItemsWindow extends JFrame {

	private JPanel contentPane = (JPanel) getContentPane();
	public customListModel listmodel;
	public JList jlist;
	
	private DBJaxb database = new DBJaxb();
	
	public void draw(){
		
		
		setTitle("Items due Today");
		setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));
		Items items = database.loadItems().getTodaysItemList();
		DefaultListModel listModel = new DefaultListModel();
		jlist = new JList(listModel);
		
		for(Iterator<Item> iter = items.getItemList().iterator(); iter.hasNext();){
			Item current = iter.next();
			listModel.addElement(current);
		}
		//tablePanel = new TablePanel(items.getItemList());
		
		add(jlist);
		//tablePanel.getTable().getColumnModel().getColumn(3).setCellRenderer(new ItemTableCellRenderer());
		pack();
		setVisible(true);
	}
}

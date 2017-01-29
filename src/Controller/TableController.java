package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.JTable;

import Model.CustomTableModel;
import Model.Item;
import View.TablePanel;

public class TableController {
	private TablePanel tablePanel;
	private JTable table;
	private CustomTableModel tableModel;
	private ActionListener menuListener;
	
	public TableController(TablePanel tablePanel, CustomTableModel tableModel) {
		this.tablePanel = tablePanel;
		this.table = tablePanel.getTable();
		this.tableModel = tableModel;
		
		addActionsToButtonsAndMenus();
	}
	
	
	public void addActionsToButtonsAndMenus(){
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int r = table.rowAtPoint(e.getPoint());
				if (r >= 0 && r < table.getRowCount()) {
					table.setRowSelectionInterval(r, r);
				} else {
					table.clearSelection();
				}
			}
		});
    
    menuListener = new ActionListener(){
    public void actionPerformed(ActionEvent event) {
        JMenuItem menu = (JMenuItem) event.getSource();
        if (tablePanel.isDelMenuItem(menu)) {
        	tableModel.removeSelectedRow(table);
        	}
    	}
    };
    
    tablePanel.getDelMenuItem().addActionListener(menuListener);
    
	}
	
	public Item getSelectedItem() {
		return tableModel.getSelectedItem(table);
	}
	
	public void removeSelectedItem() {
		tableModel.removeSelectedRow(table);
	}
	
	public CustomTableModel getTableModel() {
		return this.tableModel;
	}
	
	
}

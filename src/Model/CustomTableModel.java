package Model;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 * Custom table model.
 * 
 * @author Jens Lundin
 */
public class CustomTableModel extends AbstractTableModel {
	private String[] columnNames = {"Title", "Description", "Date", "Priority", "Category", "Done"};
	private ArrayList<Item> data;
	
	public CustomTableModel(ArrayList<Item> items) {
		this.data = items;
	}
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
	@Override
	public String getColumnName(int nr) {
		return columnNames[nr];
	}

	@Override
	public int getRowCount() {
	return data.size();
}
	@Override
    public boolean isCellEditable(int row, int col) {
        if (col == 5) {
            return true;
        } else {
            return false;
        }
    }
	
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
	
	@Override
	public Object getValueAt(int row, int col) {
        Object value = "";
        Item item = data.get(row);
        switch (col) {
            case 0:
                value = item.getTitle();
                break;
            case 1:
                value = item.getDescription();
                break;
            case 2:
                value = item.getDate();
                break;
            case 3:
                value = item.getPriority();
                break;
            case 4:
                value = item.getCategory();
                break;
            case 5:
                value = item.getDone();
                break;
        }

        return value;
	}
	
	@Override
	public void setValueAt(Object value, int row, int col) {
		if (col == 5) {
			data.get(row).setDone((Boolean)value);
		} else {
			data.add((Item) value);
		}
	}
	
    public void removeSelectedRow(JTable table) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
        	data.remove(selectedRow);
        	fireTableDataChanged();
        }
    }
    
    public Item getSelectedItem(JTable table) {
    	Item item = null;
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
        	item = data.get(selectedRow);
        }
        return item;
    }
    
}


package View;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import Model.Item;

/**
 * 
 * @author Deniz Taneli
 * 
 * This class colors the background of each item in a list
 * according to their priorities
 *
 */

@SuppressWarnings("serial")
public class ItemListCellRenderer extends JLabel implements ListCellRenderer{

	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		setText(value.toString());
		
		setOpaque(true);
		
		if(isSelected){
			setBackground(Color.BLUE);
			setForeground(Color.WHITE);
		}
		else{
			// Cast the value to the item type
			Item item = (Item) value;
			setBackground(item.getPriority().getColor());
			setForeground(Color.BLACK);
		}
		
		return this;
	}
}
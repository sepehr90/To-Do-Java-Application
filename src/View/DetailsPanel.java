	/**
	 *Handles the list of items and the displaying the area of their det
	 *@author Jens Lundin, Luis Mauricio
	 * @param none 
	 */

package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.Item;

/**
 * @author Jens Lundin, Luis Mauricio
 * 
 * Display the items and output some of their properties when selected.
 *
 */
@SuppressWarnings("serial")
public class DetailsPanel extends JPanel {
	private DefaultListModel listModel = new DefaultListModel();
	
	/**
	 * @author Jens Lundin
	 * 
	 * Initialize the panel properties and populate it with components.
	 *
	 */
	public DetailsPanel() {
		setBackground(Color.gray);
		setPreferredSize(new Dimension(250, 150));
		setLayout(new GridLayout(2, 1, 5, 5));
		
		// Create components
		final JLabel label = new JLabel();
		final JList list = new JList(listModel);
		
		// For custom list view
		list.setCellRenderer(new ItemListCellRenderer());
		
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		
		// Add components to panel
		add(list);
		add(label);
		
		
		// Listen for selected items and print the contents in label.
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					Item selectedItem = (Item) list.getSelectedValue();
					label.setText(selectedItem.getTitle() + " "
							+ selectedItem.getDate());
				}
			}
		});
		
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Append an item to the list component.
	 *
	 */
	public void setListModel(Item item) {
		this.listModel.addElement(item);
	}

	

}

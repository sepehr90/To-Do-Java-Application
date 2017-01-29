package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.event.EventListenerList;

import Model.Item;
import View.AddNewItemWindow;

public class ItemWindowController {
	private AddNewItemWindow window;
	private EventListenerList listenerList = new EventListenerList();
	private LanguageController language = new LanguageController();
	
	public ItemWindowController(AddNewItemWindow window){
		this.window = window;
	}
	
	public void drawWindow(){
		window.initFrame();
	}
	public void addActionsToWindow(){
		// On submit, create a new Item with data from the text fields and create a new event.
		window.submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				
				String priorityString = Model.Priority.LOW.toString();
				// Get selected priority
		        for (Enumeration<AbstractButton> buttons = window.priorityRadioButtons.getElements(); buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();

		            if (button.isSelected()) {
		            	priorityString = button.getText();
		            }
		        }
		        	
		        //convert date to string
		        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		        String date = dateFormat.format(window.jDateChooser1.getDate());
		        
				Item item = new Item(window.txtTitle.getText(),
						window.txtDescription.getText(),
						date,
						priorityString,
						window.txtCategory.getText());
				// Create a new event and notify the interested listener.
				fireNewItemEvent(new NewItemEvent(this, item));

				// Close the add new item window?
				window.dispose();

			}
		});			
	}
	
	public void updateLanguage(){

		//setting language to the AddNewItemWindow
		window.setTranslate(language.getTranslate("s11"),
				language.getTranslate("s12"), 
				language.getTranslate("s1"),
				language.getTranslate("s3"),
				language.getTranslate("s13"),
				language.getTranslate("s14"));
	}
	
	 /**
	 * @author Jens Lundin
	 * 
	 * Traverse the list of listeners and notify the ones that are listening for new item events.
	 * 
	 */
	public void fireNewItemEvent(NewItemEvent event) {
		Object[] listeners = listenerList.getListenerList();
		// The first element in a pair is the class if it match we know the next item is the newItemListener.
		for (int i = 0; i < listeners.length; i =+ 2) {
			if (listeners[i] == NewItemListener.class) {
				((NewItemListener)listeners[i+1]).newItemEventOccurred(event);
			}
		}
	}

	 /**
	 * @author Jens Lundin
	 * 
	 * Add NewItemListener to listenerList
	 * 
	 */
	public void addNewItemListener(NewItemListener listener) {
		listenerList.add(NewItemListener.class, listener);

	}

}

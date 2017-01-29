package Controller;

import java.util.EventObject;

import Model.Item;

/**
 * @author Jens Lundin
 * 
 * Event object that construct item.
 * 
 */
@SuppressWarnings("serial")
public class NewItemEvent extends EventObject {
	private Item item;

	public NewItemEvent(Object source, Item item) {
		super(source);
		
		this.item = item;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Get item from this event.
	 * 
	 * @return item
	 * 
	 */
	public Item getItem() {
		return this.item;
	}
}
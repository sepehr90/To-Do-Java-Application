package Controller;

import java.util.EventListener;

/**
 * @author Jens Lundin
 * 
 * Event listener for NewItemEvent that specify newItemEventOccurred method.
 * 
 */
public interface NewItemListener extends EventListener {
	public void newItemEventOccurred(NewItemEvent event);
	}
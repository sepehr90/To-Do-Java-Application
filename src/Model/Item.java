package Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import Model.Priority;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "item")
/**
 * @author Jens Lundin
 * 
 * All item details are handled here.
 * 
 */
public class Item {
	private String title;
	private String date;
	private Priority priority;
	private String category;
	private String description;
	private Boolean done = false;

	/**
	 * @author Jens Lundin
	 * 
	 * Default constructor.
	 * 
	 */
	public Item() {
		
	}

	/**
	 * @author Jens Lundin
	 * 
	 * Overloading constructor, initialize all attributes with parameters.
	 * 
	 */
	public Item(String title, String description, String date, String priority,
			String category) {
		this.title = title;
		this.description = description;
		this.date = date;
		this.priority = Priority.getPriority(priority);
		this.category = category;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Get method for title.
	 * 
	 * @return title
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Get method for Done.
	 * 
	 * @return done
	 */
	public Boolean getDone() {
		return this.done;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Set method for done.
	 */
	public void setDone(Boolean value) {
		this.done = value;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Get method for date.
	 * 
	 * @return date.
	 */
	public String getDate() {
		return this.date;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Get method for description.
	 * 
	 * @return description.
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Get method for priority.
	 * 
	 * @return priority.
	 */

	public Priority getPriority() {
		return this.priority;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Get method for category.
	 * 
	 * @return category.
	 */
	public String getCategory() {
		return this.category;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * toString method.
	 * 
	 * @return title.
	 */
	@Override
	public String toString() {
		return this.title;
	}

}

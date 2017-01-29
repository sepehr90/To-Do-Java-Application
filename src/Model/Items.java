package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "items")
@XmlAccessorType (XmlAccessType.FIELD)
public class Items {
	
	@XmlElementWrapper(name = "itemList")
	@XmlElement(name = "item")
	
	private ArrayList<Item> itemList = new ArrayList<Item>();
	
	/**
	 * @author Jens Lundin
	 * 
	 * Add an item to itemList.
	 * 
	 */
	public void setItem(Item item) {
		this.itemList.add(item);
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Set method for itemsList.
	 * 
	 */
	public void setItemList(ArrayList<Item> items) {
		this.itemList = items;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Get method for itemList.
	 * 
	 * @return itemList.
	 * 
	 */
	public ArrayList<Item> getItemList() {
		return this.itemList;
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * toString method.
	 * 
	 * @return itemList toString value.
	 * 
	 */
	public String toString() {
		return itemList.toString();
	}
	
	public Items getTodaysItemList(){
		
		//Calculate today's date and store as string
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Calendar cal = Calendar.getInstance();
		String currentDate = dateFormat.format(cal.getTime());
		
		
		Items result = new Items();
		result.itemList = new ArrayList<Item>();
		
		for(Iterator<Item> iter = this.itemList.iterator(); iter.hasNext();){
			Item current = iter.next();
			
			if(current.getDate() != null && current.getDate().equals(currentDate)){
				// this item is due today
				result.setItem(current);
			}
				
		}
		return result;
		
	}

}
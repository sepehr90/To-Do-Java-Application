package Model;

import java.awt.Color;

/**
 * 
 * @author Deniz Taneli
 * 
 * an enum for having a consistent way of accessing
 * managing priorities
 *
 */
public enum Priority
{
	LOW(Color.WHITE), MEDIUM(Color.PINK), HIGH(Color.RED);
	
	private Color color;
	
	/**
	 * Default constructor
	 * @param color
	 */
	private Priority(Color color){
		this.color = color;
	}
	
	/**
	 * @author Deniz Taneli
	 * 
	 * @return the color associated with a priority enum 
	 */
	public Color getColor(){
		return this.color;
	}
	
	/**
	 * @author Deniz Taneli
	 * @param enumString, a string that represents a priority
	 * @return the correct priority enum that corresponds the the parameter string
	 */
	public static Priority getPriority(String enumString){
		if(enumString.equals("LOW"))
			return LOW;
		else if(enumString.equals("MEDIUM"))
			return MEDIUM;
		else if(enumString.equals("HIGH"))
			return HIGH;
		else
			return LOW;
	}
};
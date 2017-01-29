package Controller;

import java.util.*;
public class LanguageController {

	/**
	 * Class Constuctors
	 */
	public LanguageController()
	{

	}

	/**
	 * @author Deniz Taneli
	 * 
	 * Default constructor that uses a string to initialize this object
	 * @param languageString string to decide which language to use
	 */
	public LanguageController(String languageString)
	{
		if(languageString.equals(Locale.GERMAN.toString()))
			Locale.setDefault(Locale.GERMAN);
		else if(languageString.equals(Locale.ENGLISH.toString()))
			Locale.setDefault(Locale.ENGLISH);
	}

	/**
	 * Returns the proper translation according to LabelsBundle.
	 * 
	 * @param text 
	 * @return translated text from given bundle of words
	 */
	
	public String getTranslate(String text) 
	{
		ResourceBundle labels = ResourceBundle.getBundle("LabelsBundle");
		return labels.getString(text);	
	}

	public String toString()
	{
		return Locale.getDefault().toString();
	}
}
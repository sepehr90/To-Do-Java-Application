package View;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Deniz Taneli
 * 
 * This class is responsible for drawing, creating the menu for
 * the main window of the application
 */
public class GUIMenu {

	private JMenuBar menuBar;
	private JMenu fileMenu, settingsSubMenu, settingsMenu;
	private JMenuItem menuItemEnglish, menuItemGerman, menuItem;
	
	/**
	 * @author Deniz Taneli
	 * 
	 * Constructor for the GUIMenu class
	 * Creates a menu bar that has all the necessary sub-menus and items 
	 */
	public GUIMenu(){
		//Create the menu bar.
		menuBar = new JMenuBar();

		// Call the relevant functions for each menu in the menu bar
		initFileMenu();
		initSettingsMenu();

	}

	
	/**
	 * @author Deniz Taneli
	 * 
	 * returns the menu bar so that the caller
	 * can use this component and add the full menu to its own view
	 * using setMenuBar() function
	 * 
	 * @return the menu bar that was initialized
	 */
	public JMenuBar getMenuBar(){
		return menuBar;
	}

	/**
	 * @author Deniz Taneli
	 * @return menu items for adding action listeners to these components
	 */
	public JMenuItem getMenuItemEnglish(){
		return menuItemEnglish;
	}
	
	public JMenuItem getMenuItemGerman(){
		return menuItemGerman;
	}
	
	/**
	 * @author Deniz Taneli
	 * 
	 * Everything related to the "settings menu"
	 * is put together here for better organization
	 */
	private void initSettingsMenu(){
		
		// create the top-level menu
		settingsMenu = new JMenu();

		// Add a sub-menu for language choice
		
		settingsSubMenu = new JMenu();
		
		// Create English as one language and add it to sub-menu
		//TODO add more languages
		menuItemEnglish = new JMenuItem();
		menuItemGerman = new JMenuItem();
		settingsSubMenu.add(menuItemEnglish);
		settingsSubMenu.add(menuItemGerman);

		// Add the language sub-menu to top-level settings menu
		settingsMenu.add(settingsSubMenu);

		// add settings menu to the menu bar (so it will be displayed)
		menuBar.add(settingsMenu);
	}
	
	
	/**
	 * @author Deniz Taneli
	 * 
	 * Everything related to the "file menu"
	 * is put together here for better organization
	 */
	private void initFileMenu(){
		
		//Build the first menu, temporarily named "File".
		// Every program has a file menu anyways
		fileMenu = new JMenu();

		// Just put a dummy item until we decide what to add inside the menu
		menuItem = new JMenuItem();
		fileMenu.add(menuItem);

		// add the File menu to the menu bar
		menuBar.add(fileMenu);
	}
	
	/**
	 * Sets the proper language on each item accordingly
	 * @param
	 */
	
	public void setTranslate (String File,String Close, String German, String English, String Settings, String Language)
	{
		 fileMenu.setText(File);
		 settingsMenu.setText(Settings);
		 menuItem.setText(Close);
		 menuItemEnglish.setText(English);
		 menuItemGerman.setText(German);
		 settingsSubMenu.setText(Language);
		 
	}
	
}

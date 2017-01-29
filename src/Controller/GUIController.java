package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;
import java.util.prefs.Preferences;

import javax.swing.table.TableModel;

import Model.CustomTableModel;
import Model.DBJaxb;
import Model.Item;
import Model.Items;
import View.AddNewItemWindow;
import View.GUI;
import View.ItemTableCellRenderer;
import View.TablePanel;
import View.TodaysItemsWindow;

public class GUIController {

	private GUI mainGUI;
	private LanguageController language = new LanguageController();
	private TableController tableController;
	private Preferences preferences;
	private DBJaxb database = new DBJaxb();

	public GUIController(GUI gui){
		mainGUI = gui;
	}

	/**
	 * updates the text in components for GUI & GUIMenu
	 */

	public void updateLanguage()
	{
		mainGUI.dateButton.setText(language.getTranslate("s1"));
		mainGUI.sortButton.setText(language.getTranslate("s2"));
		mainGUI.prioButton.setText(language.getTranslate("s3"));
		mainGUI.addButton.setText(language.getTranslate("s4"));
		mainGUI.getMenu().setTranslate(language.getTranslate("s7"), 
				language.getTranslate("s8"),
				language.getTranslate("s9"), 
				language.getTranslate("s10"), 
				language.getTranslate("s5"), 
				language.getTranslate("s6"));
		
		mainGUI.pack();
	}

	public void drawGUI(){
		mainGUI.initUI();
		mainGUI.setTitle("To-Do App");
		mainGUI.setLocationRelativeTo(null);
		mainGUI.setVisible(true);
	}

	public void initPreferenceBehaviour() {
		/**
		 * Load window size, position and language settings from user preferences.
		 * 
		 * @author Jens Lundin
		 */	
		Preferences root = Preferences.userRoot();
		this.preferences = root.node("/prefs");

		int left = this.preferences.getInt("xPos", 0);
		int top = this.preferences.getInt("yPos", 0);
		int width = this.preferences.getInt("width", 400);
		int height = this.preferences.getInt("height", 400);

		String languageString = this.preferences.get("language", Locale.ENGLISH.toString());
		language = new LanguageController(languageString);
		updateLanguage();
		mainGUI.setBounds(left, top, width, height);


		/**
		 * On default window close, save this frame settings in user preference and exit.
		 * 
		 *  @author Jens Lundin
		 */
		mainGUI.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent event) {
				preferences.putInt("xPos", mainGUI.getX());
				preferences.putInt("yPos", mainGUI.getY());
				preferences.putInt("width", mainGUI.getWidth());
				preferences.putInt("height", mainGUI.getHeight());
				preferences.put("language", Locale.getDefault().toString());
				database.storeItems();
				System.exit(0);
			}
		});	
	}

	/**
	 * Load any stored item from XML database.
	 * 
	 * @author Jens Lundin
	 */
	public void loadFromDatabase() {
		// Load any stored item from XML database and populate the table with them.
		Items items = database.loadItems();
		CustomTableModel tableModel = new CustomTableModel(items.getItemList());
		TablePanel tablePanel = new TablePanel(tableModel);
		tableController = new TableController(tablePanel, tableModel);
		mainGUI.add(tablePanel);
		tablePanel.getTable().getColumnModel().getColumn(3).setCellRenderer(new ItemTableCellRenderer());
	}
	
	public void addActionsToButtonsAndMenus(){		
		// get the German JMenuItem belonging to the menu 
		// and add an action listener to this component
		mainGUI.getMenu().getMenuItemGerman().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// set language/locale to German
				
				Locale.setDefault(Locale.GERMAN);
				updateLanguage();
			}
			
		});
		
		// similar to above but for English JMenuItem
		mainGUI.getMenu().getMenuItemEnglish().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// set language/locale to English
				
				Locale.setDefault(Locale.ENGLISH);
				updateLanguage();
			}
			
		});
		
		// When add button is pushed, create a "new item" frame.
		mainGUI.addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				final Item oldItem = tableController.getSelectedItem();
				AddNewItemWindow itemWindow = new AddNewItemWindow();
				ItemWindowController windowController = new ItemWindowController(itemWindow);
				
				windowController.drawWindow();
				windowController.addActionsToWindow();
				windowController.updateLanguage();
				if (oldItem != null) {
					itemWindow.initTextFields(oldItem);
				}

				// Add item listener.
				windowController.addNewItemListener(new NewItemListener() {
					// Get item from events when they occur and append them to the list component.
					@Override
					public void newItemEventOccurred(NewItemEvent event) {
						Item item = event.getItem();
						

						tableController.removeSelectedItem();

						TableModel model = tableController.getTableModel();
						model.setValueAt(item, 0, 0);
						// (..,row,col) is not used but is there because its a override method.
						//It can be used to change individual fields.
						database.storeItems();
					}
				});
			}});
		
		mainGUI.dateButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				TodaysItemsWindow window = new TodaysItemsWindow();
				
				window.draw();
			}});
	}

}

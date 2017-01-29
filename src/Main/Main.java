package Main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

import Controller.GUIController;
import View.AppTheme;
import View.GUI;

public class Main extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				// manage the theme of the app before drawing anything (only done once)
				JFrame.setDefaultLookAndFeelDecorated(true); 
				MetalLookAndFeel.setCurrentTheme(new AppTheme()); 
				try {
			        UIManager.setLookAndFeel(
			                UIManager.getCrossPlatformLookAndFeelClassName());
				} catch (Exception e){
				}
				
				// create a GUI controller and initialize the windows, actions from it
				GUIController mainGUIController = new GUIController(new GUI());
				mainGUIController.drawGUI();
				mainGUIController.addActionsToButtonsAndMenus();
				mainGUIController.initPreferenceBehaviour();
				mainGUIController.loadFromDatabase();
				mainGUIController.updateLanguage();
			}
		});
	}

}